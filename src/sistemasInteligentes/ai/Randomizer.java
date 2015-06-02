package sistemasInteligentes.ai;

import java.util.Random;

public class Randomizer {
	private static Random random = new Random();

	public static void setInitialTetriminoTypes(int[] tetriminos) {
		for (int i = 0; i < tetriminos.length; i++) {
			tetriminos[i] = generateNextTetriminoType();
		}
	}

	private static int generateNextTetriminoType() {
		// TODO Auto-generated method stub
		return random.nextInt(7);
	}

	public static void setNextTetriminoType(int[] tetriminos) {
		for (int i = 1; i < tetriminos.length; i++) {
			tetriminos[i - 1] = tetriminos[i];
		}
		tetriminos[tetriminos.length - 1] = generateNextTetriminoType();
	}
	
	public static void main(String[] args) {
		int[] a = new int[3];
		setInitialTetriminoTypes(a);
		System.out.println(a);
		for (int i = 0; i < 20; i++) {
			System.out.println(generateNextTetriminoType());
		}
	}
}
