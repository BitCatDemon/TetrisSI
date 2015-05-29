package tetris.gui;

import tetris.ai.*;
import java.awt.image.*;
import javax.imageio.*;

public class PatternFilter implements IChildFilter {

  private boolean[][] pattern;
  
  public PatternFilter(String name) throws Throwable {
    BufferedImage image = ImageIO.read(ImageLoader.class.getResource(
        "/tetris/gui/patterns/" + name + ".png"));
    pattern = new boolean[image.getHeight()][image.getWidth()];
    for(int y = 0; y < image.getHeight(); y++) {
      for(int x = 0; x < image.getWidth(); x++) {
        pattern[y][x] = (0xFFFFFF & image.getRGB(x, y)) == 0;
      }
    }
  }

  @Override
  public boolean validate(
      int[][] playfield, int tetriminoType, int x, int y, int rotation) {
    
    int pileHeight = AI.PLAYFIELD_HEIGHT - 1;
    outer: for(; pileHeight > 0; pileHeight--) {
      for(int i = 0; i < 10; i++) {
        if (playfield[pileHeight][i] != Tetriminos.NONE) {
          continue outer;
        }
      }
      break;
    }    
    
    int row = AI.PLAYFIELD_HEIGHT - 1;
    outer: for(; row > 0; row--) {
      for(int i = 0; i < AI.PLAYFIELD_WIDTH; i++) {
        if ((playfield[row][i] == Tetriminos.NONE) != pattern[row][i]) {
          break outer;
        }
      }
    }
    for(int i = 0; i < AI.PLAYFIELD_WIDTH; i++) {
      if (playfield[row][i] != Tetriminos.NONE && pattern[row][i]) {
        row++;
        break;
      }
    }
    
    if (row == AI.PLAYFIELD_HEIGHT || pileHeight < 2) {
      return true;
    }
    
    Point[] squares 
        = Tetriminos.ORIENTATIONS[tetriminoType][rotation].squares;
    for(int i = 0; i < 4; i++) {
      Point square = squares[i];      
      int cellY = y + square.y;
      if (cellY >= 0 && (cellY > row 
          || (cellY == row && pattern[cellY][x + square.x]))) {
        return false;
      }
    }
    
    return true;
  }
}
