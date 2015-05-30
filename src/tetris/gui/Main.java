/*
 * Nintendo Tetris AI
 * Copyright (C) 2014 meatfighter.com
 *
 * This file is part of Nintendo Tetris AI. 
 *
 * Nintendo Tetris AI is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Nintendo Tetris AI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package tetris.gui;

import tetris.ai.*;

import java.awt.*;

public class Main {
  
  public static final boolean PLAY_FAST = false; // disables drop movements

  private volatile TetrisFrame tetrisFrame;
  
  public void launch() throws Throwable {
    createTetrisFrame(ImageLoader.loadImages());
    Randomizer randomizer = new Randomizer();    
    AI ai = new AI();
    PlayfieldUtil playfieldUtil = new PlayfieldUtil();
    int[] tetriminos = new int[AI.TETRIMINOS_SEARCHED];
    //playfield es la matriz del tablero de width+heigth+1
    int[][] playfield = playfieldUtil.createPlayfield();
    
    randomizer.setInitialTetriminoTypes(tetriminos);
    
    
    //Loop del Tetris.
    while(true) {        
    	System.out.println("El while 1");
      State state = ai.search(playfield, tetriminos);
      if (state == null) {
        break;
      }
      tetrisFrame.updateStatisticsAndNext(tetriminos[0], tetriminos[1]);
      
      if (!PLAY_FAST) {
        State[] states = ai.buildStatesList(state);
        for(int i = 0; i < states.length; i++) {
          state = states[i];
          tetrisFrame.displayTetrimino(
              tetriminos[0], state.rotation, state.x, state.y, 1);
        }
      }
      tetrisFrame.lockTetrimino(tetriminos[0], 
          state.rotation, state.x, state.y, !PLAY_FAST);      
      playfieldUtil.lockTetrimino(playfield, tetriminos[0], state);
      
      randomizer.setNextTetriminoType(tetriminos);
    }
    
    while(true) {      
    	System.out.println("el while");
      tetrisFrame.updateStatisticsAndNext(tetriminos[0], tetriminos[1]);
      if (!tetrisFrame.dropTetrimino(tetriminos[0], !PLAY_FAST)) {
        break;
      }            
      randomizer.setNextTetriminoType(tetriminos);            
    }
  }
  
  private void createTetrisFrame(final Images images) throws Throwable {
    EventQueue.invokeAndWait(new Runnable() {
      @Override
      public void run() {
    	  tetrisFrame = new TetrisFrame(images);
      }
    });    
  }  
  
  public static void main(String... args) throws Throwable {
    new Main().launch();
  }
}

