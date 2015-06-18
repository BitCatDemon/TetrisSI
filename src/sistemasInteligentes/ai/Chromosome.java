package sistemasInteligentes.ai;

import sistemasInteligentes.PlayFieldEvaluator;

public class Chromosome extends Thread {
	public Gene genes;
	public PlayFieldEvaluator pfe;
	public int[] tetriminos;
	public boolean hasLost = false;
	private int maxMoves = 75;
	public SIAI ai;
	Common common;
	private int score = 0;
        public int lastScore = 0;
	Randomizer randomizer;

	public Chromosome(Common common) {
		this.randomizer = new Randomizer();
		this.genes = new Gene(randomizer);
		this.tetriminos = new int[3];
		randomizer.setInitialTetriminoTypes(tetriminos);
		this.common = common;
		pfe = new PlayFieldEvaluator();
		ai = new SIAI();
		ai.setGenes(this.genes.getGenes());
	}

	public int getMaxMoves() {
		return maxMoves;
	}

	@Override
	public void run() {
		common.imReady();
		int m = 0;
		tetris.ai.State selected;
		while (m++ < maxMoves) {
			selected = ai.search(pfe.currentPF.clone(), tetriminos);
			if (selected == null) {
				break;
			}
			ai.playfieldUtil.lockTetrimino(pfe.currentPF, tetriminos[0],
					selected);
			updateScore();

			randomizer.setNextTetriminoType(tetriminos);
		}
		common.imDone();

	}

	public void setNextTetriminoType() {
		randomizer.setNextTetriminoType(tetriminos);
	}

	public int getScore() {
		return score;
	}

	public void updateScore() {
		int clears = ai.playfieldUtil.cleared;
		switch (clears) {
		case 1:
			score += 40;
			break;
		case 2:
			score += 100;
			break;
		case 3:
			score += 300;
		case 4:
			score += 1200;
			break;
		default:
			break;
		}
	}

	public void resetValues() {
		randomizer.setInitialTetriminoTypes(tetriminos);
		pfe = new PlayFieldEvaluator();
		ai = new SIAI();
		ai.setGenes(genes.genes);
                lastScore = score;
		score = 0;
	}

	@Override
	public String toString() {
		return "Chromosome [score=" + score + "]";
	}
        
        public String toString2() {
		return "Chromosome [score=" + score + "]"+ "Gen "+genes.toString();
	}
}
