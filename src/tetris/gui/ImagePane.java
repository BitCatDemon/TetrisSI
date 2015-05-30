package tetris.gui;

import tetris.ai.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;

public class ImagePane extends JComponent {
  
  public static final int IMAGE_WIDTH = 256;
  public static final int IMAGE_HEIGHT = 240;
  
  public static final int[] LEVELS = {
    0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 
    0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x20, 0x21, 0x22, 0x23, 
    0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x00, 0x0A, 0x14, 0x1E, 0x28, 0x32, 
    0x3C, 0x46, 0x50, 0x5A, 0x64, 0x6E, 0x78, 0x82, 0x8C, 0x96, 0xA0, 0xAA, 
    0xB4, 0xBE, 0xC6, 0x20, 0xE6, 0x20, 0x06, 0x21, 0x26, 0x21, 0x46, 0x21, 
    0x66, 0x21, 0x86, 0x21, 0xA6, 0x21, 0xC6, 0x21, 0xE6, 0x21, 0x06, 0x22, 
    0x26, 0x22, 0x46, 0x22, 0x66, 0x22, 0x86, 0x22, 0xA6, 0x22, 0xC6, 0x22, 
    0xE6, 0x22, 0x06, 0x23, 0x26, 0x23, 0x85, 0xA8, 0x29, 0xF0, 0x4A, 0x4A, 
    0x4A, 0x4A, 0x8D, 0x07, 0x20, 0xA5, 0xA8, 0x29, 0x0F, 0x8D, 0x07, 0x20, 
    0x60, 0xA6, 0x49, 0xE0, 0x15, 0x10, 0x53, 0xBD, 0xD6, 0x96, 0xA8, 0x8A, 
    0x0A, 0xAA, 0xE8, 0xBD, 0xEA, 0x96, 0x8D, 0x06, 0x20, 0xCA, 0xA5, 0xBE, 
    0xC9, 0x01, 0xF0, 0x1E, 0xA5, 0xB9, 0xC9, 0x05, 0xF0, 0x0C, 0xBD, 0xEA, 
    0x96, 0x38, 0xE9, 0x02, 0x8D, 0x06, 0x20, 0x4C, 0x67, 0x97, 0xBD, 0xEA, 
    0x96, 0x18, 0x69, 0x0C, 0x8D, 0x06, 0x20, 0x4C, 0x67, 0x97, 0xBD, 0xEA, 
    0x96, 0x18, 0x69, 0x06, 0x8D, 0x06, 0x20, 0xA2, 0x0A, 0xB1, 0xB8, 0x8D, 
    0x07, 0x20, 0xC8, 0xCA, 0xD0, 0xF7, 0xE6, 0x49, 0xA5, 0x49, 0xC9, 0x14, 
    0x30, 0x04, 0xA9, 0x20, 0x85, 0x49, 0x60, 0xA5, 0xB1, 0x29, 0x03, 0xD0, 
    0x78, 0xA9, 0x00, 0x85, 0xAA, 0xA6, 0xAA, 0xB5, 0x4A, 0xF0, 0x5C, 0x0A, 
    0xA8, 0xB9, 0xEA, 0x96, 0x85, 0xA8, 0xA5, 0xBE, 0xC9, 0x01, 0xD0, 0x0A, 
    0xA5, 0xA8, 0x18, 0x69, 0x06, 0x85, 0xA8, 0x4C, 0xBD, 0x97, 0xA5, 0xB9, 
    0xC9, 0x04, 0xD0, 0x0A, 0xA5, 0xA8, 0x38, 0xE9, 0x02, 0x85, 0xA8, 0x4C, 
    0xBD, 0x97, 0xA5, 0xA8, 
  };
  
  public static final int[] TILES = { 0, 2, 1, 0, 2, 1, 0 };  
  public static final int[][] STATS = { { 32, 85 }, { 32, 100}, { 32, 117}, 
      { 35, 133}, { 32, 149}, { 32, 164}, { 36, 184} };
  public static final int[][] NEXTS = { { 204, 120 }, { 204, 120 }, 
      { 204, 120 }, { 208, 120 }, { 204, 120 }, { 204, 120 }, { 208, 124 } };
  public static final int[] POINTS = { 0, 40, 100, 300, 1200 };
  
  private volatile Images images;
  private volatile int imageX;
  private volatile int imageY;
  private volatile int imageWidth;
  private volatile int imageHeight;
  private volatile int paneWidth;
  private volatile int paneHeight;
  
  private volatile int[] statistics = new int[7];
  private volatile int lines;
  private volatile int score;
  private volatile int next;
  private volatile int level; 
  private volatile int[][] playfield = new int[20][10];
  private volatile int frameIndex;
  private volatile boolean flashing;
  private volatile boolean flashOn;
  private volatile boolean drawActiveTetrimino;
  private volatile int tetriminoX;
  private volatile int tetriminoY;
  private volatile int tetriminoRotation;
  private volatile int tetriminoType;
  
  private volatile BufferedImage buffer = new BufferedImage(
      IMAGE_WIDTH, IMAGE_HEIGHT, BufferedImage.TYPE_INT_ARGB);
  private volatile Graphics2D b = buffer.createGraphics();
  private volatile int[][] tiles = new int[30][32];
  
  private volatile ArrayList<Integer> clears = new ArrayList<>();
  
  public ImagePane(Images images) {
    
    this.images = images;

    addComponentListener(new ComponentListener() {
      @Override
      public void componentResized(ComponentEvent e) {
        paneResized();
      }
      @Override
      public void componentMoved(ComponentEvent e) {
      }
      @Override
      public void componentShown(ComponentEvent e) {
      }
      @Override
      public void componentHidden(ComponentEvent e) {
      }
    }); 
    setPreferredSize(new Dimension(2 * IMAGE_WIDTH, 2 * IMAGE_HEIGHT));    
    
    for(int y = 0; y < 20; y++) {
      for(int x = 0; x < 10; x++) {
        playfield[y][x] = -1;
      }
    }
    
    for(int y = 0; y < 30; y++) {
      System.arraycopy(images.background[y], 0, tiles[y], 0, 32);
    }
    tiles[4][3] = 0x0A;
    tiles[5][25] = 0x01;
    
    drawNumber(0, 21, 3, 3, true, true, true);
    recolorStatisticsTetriminos();
    for(int i = 0; i < 7; i++) {
      drawNumber(0, 8, 12 + (i << 1), 3, false, true, true);
    }    
    updateBuffer();
  }
  
  public void updateStatisticsAndNext(int activeTetrimino, int nextTetrimino) {
    statistics[activeTetrimino]++;
    drawNumber(statistics[activeTetrimino], 8, 12 + (activeTetrimino << 1), 3, 
        false, true, true);
    this.next = nextTetrimino;
    render();
  }
  
  public void displayTetrimino(
      int type, int rotation, int x, int y, int delay) {
    drawActiveTetrimino = true;
    tetriminoType = type;
    tetriminoRotation = rotation;
    tetriminoX = x;
    tetriminoY = y;
    render();
    animationDelay(delay);
  }
  
  public boolean dropTetrimino(int type, boolean animate) {
    
    int x = 5;
    int y = 0;
    int[][] squares = Tetriminos.PATTERNS[type][0];
    for(int i = 0; i < 4; i++) {
      if (playfield[squares[i][1]][squares[i][0] + 5] >= 0) {        
        lockTetrimino(type, 0, 5, 0, false);        
        if (animate) {
          animationDelay(48);
          int tile = 0x34F + (levelMod10() << 8);
          for(int j = 0; j < AI.PLAYFIELD_HEIGHT; j++) {
            for(int k = 0; k < AI.PLAYFIELD_WIDTH; k++) {
              tiles[6 + j][12 + k] = tile;
            }
            render();
            animationDelay(4);
          }
        }
        return false;
      }
    }

    outer: while(true) {
      if (animate) {
        displayTetrimino(type, 0, x, y, 1);
      }
      y++;
      for(int i = 0; i < 4; i++) {
        int squareX = squares[i][0] + x;
        int squareY = squares[i][1] + y;
        if (squareY >= AI.PLAYFIELD_HEIGHT 
            || (squareX >= 0 && squareY >= 0 && squareX < 10 && squareY < 20 
                && playfield[squareY][squareX] >= 0)) {        
          break outer;
        }
      }      
    }
    y--;
    lockTetrimino(type, 0, x, y, animate);
    
    return true;
  }
  
  public void lockTetrimino(
      int type, int rotation, int x, int y, boolean animate) {
    drawActiveTetrimino = false;
    boolean overlaps = false;
    for(int i = 0; i < 4; i++) {
      int[][] squares = Tetriminos.PATTERNS[type][rotation];
      int squareX = squares[i][0] + x;
      int squareY = squares[i][1] + y;
      if (squareX >= 0 && squareY >= 0 && squareX < 10 && squareY < 20) {
        if (playfield[squareY][squareX] >= 0) {
          overlaps = true;
        }
        playfield[squareY][squareX] = TILES[type];
      }
    }
    
    updatePlayfieldTiles();
    render();
    if (overlaps) {
      return;
    }
    identifyClears(y);
    if (clears.size() > 0 && animate) {
      if (clears.size() == 4) {
        flashing = true;
      }
      for(int i = 4; i >= 0; i--) {
        for(int j = clears.size() - 1; j >= 0; j--) {
          int rowY = clears.get(j);
          int[] row = playfield[rowY];
          row[i] = -1;
          row[9 - i] = -1;
          updatePlayfieldTiles(rowY);
        }
        render();
        animationDelay(4);        
      }
      flashing = false;      
    }
    clearLines();
    updatePlayfieldTiles();
    render();
  }
  
  private void updatePlayfieldTiles() {
    int offset = 0x37B + (levelMod10() << 8);
    for(int y = 0; y < 20; y++) {
      for(int x = 0; x < 10; x++) {
        int tile = playfield[y][x];
        tiles[6 + y][12 + x] = tile < 0 ? 0xFF : tile + offset;
      }
    }
  }
  
  private void updatePlayfieldTiles(int row) {
    int offset = 0x37B + (levelMod10() << 8);
    for(int x = 0; x < 10; x++) {
      int tile = playfield[row][x];
      tiles[6 + row][12 + x] = tile < 0 ? 0xFF : tile + offset;
    }
  }  
  
  private void updateFlashTiles(boolean flash) {
    if (flash == flashOn) {
      return;
    }
    flashOn = flash;
    int offset = flash ? Images.FLASH : Images.WHITE;
    for(int y = 0; y < 30; y++) {
      for(int x = 0; x < 32; x++) {
        int t = images.background[y][x];
        int tx = 0x0F & t;
        int ty = t >> 4;
        if (ty == 3 || ty == 8 || (ty == 7 && (tx < 11 || tx > 13))
            || (tx == 7 && ty == 6)) {
          tiles[y][x] = t + offset;
        }
      }
    }
  }
  
  private void clearLines() {
    if (clears.isEmpty()) {
      return;
    }
    for(int i = 0; i < clears.size(); i++) {      
      int row = clears.get(i);
      int[] line = playfield[row];
      for(int j = row; j > 0; j--) {
        playfield[j] = playfield[j - 1];
      }
      playfield[0] = line;
      for(int j = 0; j < 10; j++) {
        playfield[0][j] = -1;
      }
    }
    int originalLines = lines;
    lines += clears.size();
    if (originalLines / 10 != lines / 10) {
      int digit0 = lines % 10;
      int digit1 = (lines / 10) % 10;
      int digit2 = lines / 100;      
      int a8a9 = (digit2 << 8) | (digit1 << 4) | digit0;
      int a8 = 0xFF & (a8a9 >> 4);      
      if ((0xFF & (level - a8)) >= 128) {
        level = 0xFF & (level + 1);
        recolorStatisticsTetriminos();
        updatePlayfieldTiles();
      } 
    }
    if (score < 999999) {      
      int points = (level + 1) * POINTS[clears.size()];      
      if (points > 0 && score + points > 0) {
        score += points;
        if (score > 999999) {
          score = 999999;
        }
      }
    }
    
    drawNumber(lines, 21, 3, 3, true, true, true);
    drawNumber(score, 29, 8, 6, true, true, false);
    drawNumber(LEVELS[0xFF & level], 27, 21, 2, true, false, false);
  }
  
  private void animationDelay(int frames) {
    long period = 16639267 * frames;
    long startTime = System.nanoTime();
    while(System.nanoTime() - startTime < period);
  }
  
  private void identifyClears(int tetriminoY) {
    clears.clear();
    outer: for(int i = -2; i <= 1; i++) {
      int y = tetriminoY + i;
      if (y <= 0 || y > 19) {
        continue;
      }
      for(int x = 0; x < 10; x++) {
        if (playfield[y][x] < 0) {
          continue outer;
        }
      }
      clears.add(y);
    }
  }
  
  private void recolorStatisticsTetriminos() {
    int offset = (3 + levelMod10()) << 8;
    for(int y = 11; y <= 24; y++) {
      for(int x = 3; x <= 5; x++) {
        tiles[y][x] = images.background[y][x] + offset;
      }
    }
  }
  
  private void updateBuffer() {
    frameIndex++;
    updateFlashTiles(flashing && (frameIndex & 3) == 0);
    
    for(int y = 0; y < 30; y++) {
      int Y = y << 3;
      for(int x = 0; x < 32; x++) {
        b.drawImage(images.tiles[tiles[y][x]], x << 3, Y, null);
      }
    }
    
    drawTetrimino(next, 0, NEXTS[next][0], NEXTS[next][1], TILES[next]);
    
    if (drawActiveTetrimino) {
      drawPlayfieldTetrimino(tetriminoType, tetriminoRotation, 
              tetriminoX, tetriminoY, TILES[tetriminoType]);
    }    
  }
  
  private void render() {
    updateBuffer();
    Graphics g = getGraphics();
    if (g == null) {
      return;
    }
    g.drawImage(buffer, imageX, imageY, imageWidth, imageHeight, null);
    g.dispose();
  }
  
  private void drawPlayfieldTetrimino(
      int type, int rotation, int x, int y, int index) {
    BufferedImage tile = images.tiles[0x37B + (levelMod10() << 8) + index];    
    int[][] squares = Tetriminos.PATTERNS[type][rotation];
    for(int i = 0; i < 4; i++) {
      int[] square = squares[i];
      int X = x + square[0];
      int Y = y + square[1];
      if (X >= 0 && Y >= 0 && X < 10 && Y < 20) {
        b.drawImage(tile, 96 + (X << 3), 48 + (Y << 3), null);
      }
    }
  }
  
  private int levelMod10() {
    int value = 0xFF & level;
    if (value < 138) {
      return value % 10;
    }
    return value;
  }
  
  private void drawTetrimino(
      int type, int rotation, int x, int y, int index) {
    BufferedImage tile = images.tiles[0x37B + (levelMod10() << 8) + index];
    int[][] squares = Tetriminos.PATTERNS[type][rotation];
    for(int i = 0; i < 4; i++) {
      int[] square = squares[i];
      b.drawImage(tile, x + (square[0] << 3), y + (square[1] << 3), null);
    }
  }
  
  private void drawNumber(int value, int x, int y, int digits, 
      boolean white, boolean decimal, boolean roll) {
    int base = decimal ? 10 : 16;
    int offset = white ? Images.WHITE : Images.RED;
    for(int i = digits - 1; i >= 0; i--, x--) {
      if (roll && i == 0) {
        base = 256;
      }      
      tiles[y][x] = offset + (value % base);
      value /= base;
    }
  }
  
  private void paneResized() {
    paneWidth = getWidth();
    paneHeight = getHeight();
  }

  @Override
  protected void paintComponent(Graphics g) {
    paneResized();
    if (IMAGE_HEIGHT * paneWidth >= IMAGE_WIDTH * paneHeight) {
      imageHeight = paneHeight;
      imageWidth = imageHeight * IMAGE_WIDTH / IMAGE_HEIGHT;
      imageX = (paneWidth - imageWidth) / 2;
      imageY = 0;
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, imageX, paneHeight);
      g.fillRect(imageX + imageWidth, 0, 
          paneWidth - (imageX + imageWidth), paneHeight);
      g.drawImage(buffer, imageX, imageY, imageWidth, imageHeight, null);
    } else {
      imageWidth = paneWidth;
      imageHeight = imageWidth * IMAGE_HEIGHT / IMAGE_WIDTH;
      imageY = (paneHeight - imageHeight) / 2;
      imageX = 0;
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, paneWidth, imageY);
      g.fillRect(0, imageY + imageHeight, 
          paneWidth, paneHeight - (imageY + imageHeight));
      g.drawImage(buffer, imageX, imageY, imageWidth, imageHeight, null);
    }
  }
}
