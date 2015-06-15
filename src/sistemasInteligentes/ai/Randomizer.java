package sistemasInteligentes.ai;

import java.util.Random;

public class Randomizer {
	private static Random random = new Random();

	public static void setInitialTetriminoTypes(int[] tetriminos) {
		for (int i = 0; i < tetriminos.length; i++) {
			tetriminos[i] = generateNextTetriminoType();
		}
	}

	protected static int generateNextTetriminoType() {
		// TODO Auto-generated method stub
		return random.nextInt(7);
	}

	public static void setNextTetriminoType(int[] tetriminos) {
		for (int i = 1; i < tetriminos.length; i++) {
			tetriminos[i - 1] = tetriminos[i];
		}
		tetriminos[tetriminos.length - 1] = generateNextTetriminoType();
	}

	public double getRndGeneValue() {
		double r = random.nextDouble();
		return r * Math.pow(-1, (int) (r * 10));
	}

}
