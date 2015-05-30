package tetris.gui;

import javax.swing.*;

public class TetrisFrame extends JFrame {
  
  private ImagePane imagePane;  
  
  public TetrisFrame(Images images) {
    
    imagePane = new ImagePane(images);
    
    setTitle("Tetris");    
    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    setContentPane(imagePane);
    pack();
    getRootPane().setDoubleBuffered(true);
    setLocationRelativeTo(null);
    setVisible(true);    
  }
  
  public void updateStatisticsAndNext(int activeTetrimino, int nextTetrimino) {
    imagePane.updateStatisticsAndNext(activeTetrimino, nextTetrimino);
  } 
  
  public void displayTetrimino(
      int type, int rotation, int x, int y, int delay) {
    imagePane.displayTetrimino(type, rotation, x, y, delay);
  }
  
  public void lockTetrimino(
      int type, int rotation, int x, int y, boolean animate) { 
    imagePane.lockTetrimino(type, rotation, x, y, animate);
  } 
  
  public boolean dropTetrimino(int type, boolean animate) {
    return imagePane.dropTetrimino(type, animate);
  }
}
