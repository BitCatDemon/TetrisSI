package sistemasInteligentes.ai;

import sistemasInteligentes.PlayfieldEvaluationConstants;
import tetris.ai.AI;
import tetris.ai.Point;
import tetris.ai.State;
import tetris.ai.Tetriminos;

public class PlayfieldUtil {
	private final int[][] spareRows = new int[8 * AI.TETRIMINOS_SEARCHED][AI.PLAYFIELD_WIDTH + 1];
	private final int[] columnDepths = new int[AI.PLAYFIELD_WIDTH];
	private int spareIndex;
	protected int cleared = 0;

	public PlayfieldUtil() {
		for (int y = 0; y < spareRows.length; y++) {
			for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
				spareRows[y][x] = Tetriminos.NONE;
			}
		}
	}

	public static int[][] createPlayfield() {
		int[][] playfield = new int[AI.PLAYFIELD_HEIGHT][AI.PLAYFIELD_WIDTH + 1];
		for (int y = 0; y < AI.PLAYFIELD_HEIGHT; y++) {
			for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
				playfield[y][x] = Tetriminos.NONE;
			}
		}
		return playfield;
	}

	public void lockTetrimino(int[][] playfield, int tetriminoType, State state) {

		Point[] squares = Tetriminos.ORIENTATIONS[tetriminoType][state.rotation].squares;
		for (int i = 0; i < 4; i++) {
			Point square = squares[i];
			int y = state.y + square.y;
			if (y >= 0) {
				playfield[y][state.x + square.x] = tetriminoType;
				playfield[y][AI.PLAYFIELD_WIDTH]++;
			}
		}

		int startRow = state.y - 2;
		int endRow = state.y + 1;

		if (startRow < 1) {
			startRow = 1;
		}
		if (endRow >= AI.PLAYFIELD_HEIGHT) {
			endRow = AI.PLAYFIELD_HEIGHT - 1;
		}
		cleared =0;
		for (int y = startRow; y <= endRow; y++) {
			if (playfield[y][AI.PLAYFIELD_WIDTH] == AI.PLAYFIELD_WIDTH) {
				cleared++;
				int[] clearedRow = playfield[y];
				for (int i = y; i > 0; i--) {
					playfield[i] = playfield[i - 1];
				}
				for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
					clearedRow[x] = Tetriminos.NONE;
				}
				clearedRow[AI.PLAYFIELD_WIDTH] = 0;
				playfield[0] = clearedRow;
			}
		}
		
	}

	public void evaluatePlayfield(int[][] playfield,
			PlayfieldEvaluationConstants e) {

		for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
			columnDepths[x] = AI.PLAYFIELD_HEIGHT - 1;
			for (int y = 0; y < AI.PLAYFIELD_HEIGHT; y++) {
				if (playfield[y][x] != Tetriminos.NONE) {
					columnDepths[x] = y;
					break;
				}
			}
		}
		// Cuenta cuántas fichas deja pegadas a la pared
		e.walls = 0;
		// Cuenta cuántas fichas están bien puestas,una al lado de otra
		e.partners = 0;
		for (int x = 1; x < AI.PLAYFIELD_WIDTH - 1; x++) {
			int minY = 0;
			if (x == 0) {
				minY = columnDepths[1];
			} else if (x == AI.PLAYFIELD_WIDTH - 1) {
				minY = columnDepths[AI.PLAYFIELD_WIDTH - 2];
			} else {
				minY = Math.max(columnDepths[x - 1], columnDepths[x + 1]);
			}
			for (int y = columnDepths[x]; y >= minY; y--) {
				if ((x == 0 || playfield[y][x - 1] != Tetriminos.NONE)
						&& (x == AI.PLAYFIELD_WIDTH - 1 || playfield[y][x + 1] != Tetriminos.NONE)) {
					e.partners++;
				}
				if ((x == 0 || x == SIAI.PLAYFIELD_WIDTH - 1)
						&& playfield[y][x] != Tetriminos.NONE) {
					e.walls++;
				}
			}
		}

		e.holes = 0;
		e.blockades = 0;
		for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
			boolean solid = true;
			for (int y = columnDepths[x] + 1; y < AI.PLAYFIELD_HEIGHT; y++) {
				if (playfield[y][x] == Tetriminos.NONE) {
					if (playfield[y - 1][x] != Tetriminos.NONE) {
						e.holes++;
					}
					if (solid) {
						solid = false;
						e.blockades++;
					}
				} else if (!solid) {
					solid = true;
					e.blockades++;
				}
			}
		}

		e.floor = 0;
		for (int x = 0; x < AI.PLAYFIELD_WIDTH; x++) {
			if (playfield[SIAI.PLAYFIELD_HEIGHT - 1][x] != Tetriminos.NONE) {
				e.floor++;
			}
		}

	}

	public int clearRows(int[][] playfield, int tetriminoY) {

		int rows = 0;
		int startRow = tetriminoY - 2;
		int endRow = tetriminoY + 1;

		if (startRow < 1) {
			startRow = 1;
		}
		if (endRow >= AI.PLAYFIELD_HEIGHT) {
			endRow = AI.PLAYFIELD_HEIGHT - 1;
		}

		for (int y = startRow; y <= endRow; y++) {
			if (playfield[y][AI.PLAYFIELD_WIDTH] == AI.PLAYFIELD_WIDTH) {
				rows++;
				clearRow(playfield, y);
			}
		}

		return rows;
	}

	private void clearRow(int[][] playfield, int y) {

		int[] clearedRow = playfield[y];
		clearedRow[AI.PLAYFIELD_WIDTH] = y;
		for (int i = y; i > 0; i--) {
			playfield[i] = playfield[i - 1];
		}
		playfield[0] = spareRows[spareIndex];
		playfield[0][AI.PLAYFIELD_WIDTH] = 0;

		spareRows[spareIndex++] = clearedRow;
	}

	private void restoreRow(int[][] playfield) {

		int[] restoredRow = spareRows[--spareIndex];
		int y = restoredRow[AI.PLAYFIELD_WIDTH];

		spareRows[spareIndex] = playfield[0];

		for (int i = 0; i < y; i++) {
			playfield[i] = playfield[i + 1];
		}
		restoredRow[AI.PLAYFIELD_WIDTH] = AI.PLAYFIELD_WIDTH;
		playfield[y] = restoredRow;
	}

	public void restoreRows(int[][] playfield, int rows) {
		for (int i = 0; i < rows; i++) {
			restoreRow(playfield);
		}
	}

}
