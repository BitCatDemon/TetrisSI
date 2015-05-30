package sistemasInteligentes;

import tetris.ai.State;

public class PlayFieldEvaluator {
	
    int [][] currentPF;
    int maxY; //Representa la altura mas alta en el tablero;
    


    public PlayFieldEvaluator(int [][] playfield) {
            currentPF = playfield;
    }
    public void updateCurrentPF(int [][] playfield){
        currentPF = playfield;
    }
    
    public int alturaMax(){
        int max = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if(currentPF[i][j]>0) return 20-i;
            }
        }
        return 0;
    }
    
    
    
    public int evaluarAltura(int tipoTetrimino, State s){
        
        return 0;
    }
}
