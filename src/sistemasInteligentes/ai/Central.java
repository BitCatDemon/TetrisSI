package sistemasInteligentes.ai;

import java.util.ArrayList;

public class Central extends Thread {
	ArrayList<Chromosome> players;
	final int MAX_T = 20;
	final int MAX_G = 30;
	public int[] tetriminos;
	private static Central central;
	Common common;

	private Central() {
		players = new ArrayList<>(MAX_T);
		common = Common.getInstance(MAX_T);
		Randomizer.setInitialTetriminoTypes(tetriminos);
		initializeThreads();
	}

	public static Central getInstance() {
		if (central == null) {
			central = new Central();
		}
		return central;
	}

	private void initializeThreads() {
		for (int i = 1; i <= MAX_T; i++) {
			players.add(new Chromosome(i, tetriminos, common));
		}
	}

	public void runThreads() {
		for (int i = 1; i <= MAX_T; i++) {
			players.get(i).run();
		}
	}

	@Override
	public void run() {
		int current_generations = 0;
		while (current_generations < MAX_G) {
			if (common.areAllDone()) {
				// Realizar selección.

				// Realizar cruce.

				// Realizar mutación.

				// Correr la nueva toda la población.
				common.restart();
				this.runThreads();
			}
		}
	}

}
