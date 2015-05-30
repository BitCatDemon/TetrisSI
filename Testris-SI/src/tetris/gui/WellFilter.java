package tetris.gui;

import tetris.ai.*;

public class WellFilter implements IChildFilter {

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
    if (pileHeight >= AI.PLAYFIELD_HEIGHT / 2) {
      int wellRow = AI.PLAYFIELD_HEIGHT - 1;
      outer: for(; wellRow > pileHeight; wellRow--) {        
        if (playfield[wellRow][AI.PLAYFIELD_WIDTH] < 9) {
          break outer;
        }
      }      
      
      Point[] squares 
          = Tetriminos.ORIENTATIONS[tetriminoType][rotation].squares;
      
      for(int i = 0; i < 4; i++) {
        Point square = squares[i];
        int cellX = x + square.x;
        int cellY = y + square.y;        
        if (wellRow > AI.PLAYFIELD_HEIGHT - 5 
            && cellX == AI.PLAYFIELD_WIDTH - 1 
            && cellY >= wellRow) {
          return false;
        }
        if (wellRow <= AI.PLAYFIELD_HEIGHT - 5 
            && cellX == AI.PLAYFIELD_WIDTH - 1 
            && tetriminoType != Tetriminos.I) {
          return false;
        }
      }    
    }    
    
    return true;
  }  
}
