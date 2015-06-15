package sistemasInteligentes;

import sistemasInteligentes.ai.SIAI;
import tetris.ai.PlayfieldUtil;

public class PlayFieldEvaluator {

	public int[][] currentPF;
	private int currentHeight;
	public int[] columnDepths = new int[SIAI.PLAYFIELD_WIDTH];
	final public PlayfieldUtil playfieldUtil = new PlayfieldUtil();

	int maxY; // Representa la altura mas alta en el tablero;


	public PlayFieldEvaluator(final int[][] playfield) {
		currentPF = playfield;
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
