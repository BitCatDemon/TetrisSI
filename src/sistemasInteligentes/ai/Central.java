package sistemasInteligentes.ai;

import java.util.ArrayList;

public class Central {
	ArrayList<Chromosome> players;
	final int MAX_T = 20;
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
	
	
	
}
