package tetris.gui;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public final class ImageLoader {
  
  private static final int[] NES_PALETTE = {
    0xFF747474,
    0xFF0000FC,
    0xFF0000BC,
    0xFF4428BC,
    0xFF940084,
    0xFFA80020,
    0xFFA81000,
    0xFF881400,
    0xFF503000,
    0xFF007800,
    0xFF006800,
    0xFF005800,
    0xFF004058,
    0xFF000000,
    0xFF000000,
    0xFF000000,
    0xFFBCBCBC,
    0xFF0078F8,
    0xFF0058F8,
    0xFF6844FC,
    0xFFD800CC,
    0xFFE40058,
    0xFFF83800,
    0xFFE45C10,
    0xFFAC7C00,
    0xFF00B800,
    0xFF00A800,
    0xFF00A844,
    0xFF008888,
    0xFF000000,
    0xFF000000,
    0xFF000000,
    0xFFF8F8F8,
    0xFF3CBCFC,
    0xFF6888FC,
    0xFF9878F8,
    0xFFF878F8,
    0xFFF85898,
    0xFFF87858,
    0xFFFCA044,
    0xFFF8B800,
    0xFFB8F818,
    0xFF58D854,
    0xFF58F898,
    0xFF00E8D8,
    0xFF787878,
    0xFF000000,
    0xFF000000,
    0xFFFCFCFC,
    0xFFA4E4FC,
    0xFFB8B8F8,
    0xFFD8B8F8,
    0xFFF8B8F8,
    0xFFF8A4C0,
    0xFFF0D0B0,
    0xFFFCE0A8,
    0xFFF8D878,
    0xFFD8F878,
    0xFFB8F8B8,
    0xFFB8F8D8,
    0xFF9CFCF0,
    0xFFF8D8F8,
    0xFF000000,
    0xFF000000,    
  };
  
  private ImageLoader() {    
  }
  
  public static Images loadImages() throws Throwable {
    Images images = new Images();
    
    readBackgroundData(images);
    loadTiles(images);
    
    return images;
  }
  
  private static void loadTiles(Images images) throws Throwable {
    int[] squareColors = new int[256];
    
    try(DataInputStream in = new DataInputStream(new BufferedInputStream(
        ImageLoader.class.getResourceAsStream(
            "/tetris/gui/images/colors.dat")))) {
      for(int i = 0; i < 256; i++) {
        squareColors[i] = in.readInt();
      }
    }
    
    int[] pixels = extractPixels(loadImage("tiles"));
    for(int i = 0, k = 0; i < 3; i++) {
      for(int y = 0; y < 16; y++) {
        for(int x = 0; x < 16; x++, k++) {
          int black = 0x0F;
          int blue = 0x00;
          int white = 0x3C;
          int red = 0x30;
          if (i == 1) {
            black = 0x0F;
            blue = 0x12;
            white = 0x30;
            red = 0x16;            
          } else if (i == 2) {
            black = 0x0F;
            blue = 0x30;
            white = 0x3C;
            red = 0x30;           
          }          
          images.tiles[k] = createTile(pixels, x, y, black, red, blue, white);  
        }
      }
    }
    
    for(int i = 0; i < 256; i++) {
      int I = (i + 3) << 8;
      for(int y = 4; y < 8; y++) {
        int Y = y << 4;
        for(int x = 0; x < 16; x++) {
          int black = 0x0F;
          int red = 0x3F & squareColors[i];
          int blue = 0x3F & (squareColors[i] >> 8);
          int white = 0x3F & (squareColors[i] >> 16);
          images.tiles[I + Y + x] 
              = createTile(pixels, x, y, black, red, blue, white);  
        }
      } 
      images.tiles[I + 0xFF] = images.tiles[0xFF];
    }
  }
  
  private static BufferedImage createTile(int[] pixels, int tileX, int tileY, 
      int black, int red, int blue, int white) {
    
    BufferedImage tile = new BufferedImage(8, 8, BufferedImage.TYPE_INT_ARGB);
    int[] pix = extractPixels(tile);
    
    for(int y = 0, k = 0; y < 8; y++) {
      int offset = (((tileY << 3) + y) << 7) + (tileX << 3);
      for(int x = 0; x < 8; x++, k++) {
        switch(pixels[offset + x]) {
          case 0xFF000000:
            pix[k] = NES_PALETTE[black];
            break;
          case 0xFFD82800:
            pix[k] = NES_PALETTE[red];
            break;
          case 0xFF2038EC:
            pix[k] = NES_PALETTE[blue];
            break;
          case 0xFFFCFCFC:
            pix[k] = NES_PALETTE[white];
            break;
        } 
      }
    }
    
    return tile;
  }
  
  public static int[] extractPixels(BufferedImage image) {
    return ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
  }  
  
  private static BufferedImage loadImage(String name) throws Throwable {
    BufferedImage image = readImage(name);
    
    BufferedImage temp = new BufferedImage(
        image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
    Graphics g = temp.getGraphics();    
    g.drawImage(image, 0, 0, null);    
    g.dispose();
    
    return temp;
  }  
  
  private static BufferedImage readImage(String name) throws Throwable {
    return ImageIO.read(ImageLoader.class.getResource(
        "/tetris/gui/images/" + name + ".png"));
  }
  
  private static void readBackgroundData(Images images) throws Throwable {
    try(DataInputStream dis = new DataInputStream(
        ImageLoader.class.getResourceAsStream(
            "/tetris/gui/images/background.dat"))) {
      byte[] data = new byte[32 * 30];
      dis.readFully(data);
      for(int y = 0, k = 0; y < 30; y++) {
        for(int x = 0; x < 32; x++, k++) {
          images.background[y][x] = 0xFF & data[k];          
        }
      }
      
      images.background[4][3] = 0x0A;
    }
  }
}
