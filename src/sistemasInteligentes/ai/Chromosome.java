package sistemasInteligentes.ai;

import sistemasInteligentes.PlayFieldEvaluator;

public class Chromosome extends Thread {
	private int id;
	public Gene genes;
	protected PlayFieldEvaluator pfe;
	protected int[] tetriminos;
	public boolean hasLost = false;
	private int maxMoves = 20;
	String parentsTrack = "";
	SIAI ai;
	Common common;

	public Chromosome(int id, int[] tetriminos, Common common) {
		this.id = id;
		this.genes = new Gene();
		this.tetriminos = tetriminos;
		this.common = common;
		pfe = new PlayFieldEvaluator(initializePlayfield());
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxMoves() {
		return maxMoves;
	}

	private int[][] initializePlayfield() {
		int[][] c = { { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 } };
		return c;
	}

	@Override
	public void run() {
		int m = 0;
		while (m < maxMoves && !hasLost) {

		}

	}
}
