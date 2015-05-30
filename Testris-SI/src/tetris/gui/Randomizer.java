package tetris.gui;

import java.util.*;

public class Randomizer {
	// Extraña forma de generar las fichas aleatoreamente.
  private static final int[] SPAWN_TABLE 
      = { 0x02, 0x07, 0x08, 0x0A, 0x0B, 0x0E, 0x12 };
  private static final int MAX_SCRAMBLES = 257;
  
  private int register = 0x8988;
  private int spawnCount;
  private int spawnID;
  private Random random = new Random();
  
  private int generateNextPseudorandomNumber(int value) {
    return ((((value >> 9) & 1) ^ ((value >> 1) & 1)) << 15) | (value >> 1);
  }
  
  public void setInitialTetriminoTypes(int[] tetriminos) {
    for(int i = 0; i < tetriminos.length; i++) {
      tetriminos[i] = generateNextTetriminoType();
    }
  }
  
  public void setNextTetriminoType(int[] tetriminos) {
    for(int i = 1; i < tetriminos.length; i++) {
      tetriminos[i - 1] = tetriminos[i];
    }
    tetriminos[tetriminos.length - 1] = generateNextTetriminoType();
  }  
  
  public int generateNextTetriminoType() {
    
    for(int i = random.nextInt(MAX_SCRAMBLES); i >= 0; i--) {
      register = generateNextPseudorandomNumber(register);
    }
    
    spawnCount = 0xFF & (spawnCount + 1);
    int index = ((0xFF & (register >> 8)) + spawnCount) & 0x07;
    if (index < 7) {
      int newSpawnID = SPAWN_TABLE[index];
      if (newSpawnID != spawnID) {
        spawnID = newSpawnID;
        return index;
      }
    }
    
    register = generateNextPseudorandomNumber(register);
    
    index = (((0xFF & (register >> 8)) & 0x07) + spawnID) % 7;
    
    spawnID = SPAWN_TABLE[index];
    
    return index;
  }
}
