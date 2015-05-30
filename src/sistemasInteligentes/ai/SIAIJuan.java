package sistemasInteligentes.ai;

import java.util.ArrayList;

import tetris.ai.*;
import tetris.gui.WellFilter;

public class SIAIJuan {
	public ArrayList<State> estadosPosibles;
	public static final int PLAYFIELD_WIDTH = 10;
	public static final int PLAYFIELD_HEIGHT = 20;
	public static final int TETRIMINOS_SEARCHED = 3;
	private State[][][] states;
	private IChildFilter positionValidator;
        public static Searcher searcher;
        
        int id=0;
	
	public SIAIJuan() {
		estadosPosibles = new ArrayList<State>();
		this.positionValidator = new WellFilter();
	}
	
	public void construirEstadosPosibles(int [][] playfield, int tetrimino){
		
	}
	
	public State getNextState(int [][] playfield, int [] tetriminos){
		int tipoTetrimino = tetriminos[0];
                ArrayList<State> estados = new ArrayList<State>();
		createStates();
                Queue q = searchStates(playfield, tipoTetrimino);
                System.out.println("Cola"+ q.toString());
		System.out.println(printStates());
		System.out.println(states.length);
		State estado = new State(0,18,1);
		System.out.println(positionValidator.validate(playfield, tipoTetrimino, 0, 1, 1));
		return estado;
	}
        
        public Queue searchStates(int [][] playfield, int tipoTetrimino){
            searcher.search(playfield, tipoTetrimino, id);
            return searcher.queue;
        }
        public Queue searchStates2(int [][] playfield, int tipoTetrimino){
		if(states!= null){
			for (int i = 0; i < states.length; i++) {
				for (int j = 0; j < states[i].length; j++) {
					for (int j2 = 0; j2 < states[i][j].length; j2++) {
						//s+=states[i][j][j2].toString()+"\n";
                                            searcher.search(playfield, tipoTetrimino, id++);
					}
				}
			}
		}
		return searcher.queue;
        }
	
	private void createStates() {
	    states = new State[AI.PLAYFIELD_HEIGHT][AI.PLAYFIELD_WIDTH][4];
	    for(int y = 0; y < AI.PLAYFIELD_HEIGHT; y++) {
	      for(int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {        
	        for(int rotation = 0; rotation < 4; rotation++) { 
	          states[y][x][rotation] = new State(x, y, rotation);
	        }
	      }
	    }
	}
	
	public State[] buildStatesList(State state) {
	    State s = state;
	    int count = 0;      
	    while(s != null) {
	      count++;
	      s = s.predecessor;
	    }
	    State[] states = new State[count];
	    while(state != null) {
	      states[--count] = state;
	      state = state.predecessor;
	    }
	    return states;
	  }
	
	public String printStates(){
		String s = "Estados\n";
		if(states!= null){
			for (int i = 0; i < states.length; i++) {
				for (int j = 0; j < states[i].length; j++) {
					for (int j2 = 0; j2 < states[i][j].length; j2++) {
						s+=states[i][j][j2].toString()+"\n";
					}
				}
			}
		}
		return s;
	}
        
}
