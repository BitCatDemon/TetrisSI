package sistemasInteligentes.ai;

import java.util.ArrayList;
import java.util.Random;

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
		pfe = new PlayFieldEvaluator();
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

	@Override
	public void run() {
		int m = -1;
		ArrayList<tetris.ai.State> estadosValidos;
		Random rnd = new Random();
		while (++m < maxMoves || !hasLost) {
			// Juega hasta que pierde o alcanza el max de movimientos
			estadosValidos = ai.search(pfe.currentPF, tetriminos);
			hasLost = estadosValidos.size() == 0;
			// busca el mejor estado según su fnción fitness
			tetris.ai.State state = estadosValidos.get(rnd
					.nextInt(estadosValidos.size()));

		}
		//
		common.imDone();

	}
}
