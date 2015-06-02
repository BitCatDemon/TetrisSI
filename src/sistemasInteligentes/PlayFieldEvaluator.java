package sistemasInteligentes;

import tetris.ai.PlayfieldUtil;

public class PlayFieldEvaluator {

	public int[][] currentPF;
	public PlayfieldUtil playfieldUtil;
	int maxY; // Representa la altura mas alta en el tablero;

	public PlayFieldEvaluator() {
		playfieldUtil = new PlayfieldUtil();
		currentPF = playfieldUtil.createPlayfield();
	}

	public PlayFieldEvaluator(int[][] playfield) {
		playfieldUtil = new PlayfieldUtil();
		currentPF = playfield;
	}

	public void updateCurrentPF(int[][] playfield) {
		currentPF = playfield;
	}

	public int alturaMax() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (currentPF[i][j] > 0)
					return 20 - i;
			}
		}
		return 0;
	}

}
