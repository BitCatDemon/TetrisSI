package tetris.gui;

import java.awt.image.*;

public class Images {
  
  public static final int WHITE = 0;
  public static final int RED = 256;
  public static final int FLASH = 512;
  public static final int TILES = 768;
  
  public BufferedImage[] tiles = new BufferedImage[259 * 256];
  public int[][] background = new int[30][32];
}
