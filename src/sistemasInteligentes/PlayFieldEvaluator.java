package sistemasInteligentes;

import sistemasInteligentes.ai.SIAI;
import tetris.ai.AI;
import tetris.ai.PlayfieldUtil;
import tetris.ai.Tetriminos;

public class PlayFieldEvaluator {

	public int[][] currentPF;
	private int currentHeight;
	public int[] columnDepths = new int[SIAI.PLAYFIELD_WIDTH];
	final public PlayfieldUtil playfieldUtil = new PlayfieldUtil();

	int maxY; // Representa la altura mas alta en el tablero;

	public PlayFieldEvaluator() {
		currentPF = createPlayfield();
	}

	private int[][] createPlayfield() {
		int[][] playfield = new int[AI.PLAYFIELD_HEIGHT][AI.PLAYFIELD_WIDTH + 1];
		for (int y = 0; y < AI.PLAYFIELD_HEIGHT; y++) {
			for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
				playfield[y][x] = Tetriminos.NONE;
			}
		}
		return playfield;
	}

	public void updateCurrentPF(int[][] playfield) {
		currentPF = playfield;
	}

	public static int alturaMax(int[][] pf) {
		int max = 0;
		for (int i = 0; i < SIAI.PLAYFIELD_HEIGHT; i++) {
			for (int j = 0; j < SIAI.PLAYFIELD_WIDTH; j++) {
				if (pf[i][j] > 0)
					max = max > (SIAI.PLAYFIELD_HEIGHT - i) ? max
							: (SIAI.PLAYFIELD_HEIGHT - i);
			}
		}
		return max;
	}

	public int getCurrentHeight() {
		return currentHeight;
	}

	public void setCurrentHeight(int currentHeight) {
		this.currentHeight = currentHeight;
	}

	@Override
	public String toString() {
		return this.currentPF.toString();
	}

}
