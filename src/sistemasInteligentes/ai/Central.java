package sistemasInteligentes.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sistemasInteligentes.SingleExperiment;

public class Central extends Thread {
	ArrayList<Chromosome> players;
	final int MAX_T = 3;
	final int MAX_G = 1;
	private static Central central;
	Common common;
	SingleExperiment experimento;

	public static void main(String[] args) {
		Central c = Central.getInstance();
		c.start();
	}

	private Central() {
		players = new ArrayList<>(MAX_T);
		common = Common.getInstance(MAX_T);
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
			players.add(new Chromosome(common));
		}
	}

	public void runThreads() {
		for (int i = 0; i < MAX_T; i++) {
			players.get(i).start();
		}
	}
	
	public void go(){
		this.runThreads();
		int current_generations = 0;
		while (current_generations++ < MAX_G) {
			if (common.areAllDone()) {
				System.out.println("I N I T I A L +++++++++++++");
				for (Chromosome cr : players) {
					System.out.println(cr.getScore());
				}
				Collections.sort(players, new CustomComparator());
				System.out.println("S O R T E D   S O R T E D ");
				for (Chromosome cr : players) {
					System.out.println(cr.getScore());
				}
				/*
				 * Realizar selección--> Va a pasar un 20% de la población
				 * compuesto por los mejores de la población. Los otros 17 se
				 * eligen al azar y se hace
				 */

				// Realizar cruce.

				// Realizar mutaciï¿½n.

				// Correr la nueva toda la poblaciï¿½n.
//				common.restart();
//				this.runThreads();
			}
		}
	}

	@Override
	public void run() {
		this.runThreads();
		int current_generations = 0;
		while (current_generations < MAX_G) {
			if (common.areAllDone()) {
				System.out.println("I N I T I A L +++++++++++++");
				for (Chromosome cr : players) {
					System.out.println(cr.getScore());
				}
				Collections.sort(players, new CustomComparator());
				System.out.println("S O R T E D   S O R T E D ");
				for (Chromosome cr : players) {
					System.out.println(cr.getScore());
				}
				/*
				 * Realizar selección--> Va a pasar un 20% de la población
				 * compuesto por los mejores de la población. Los otros 17 se
				 * eligen al azar y se hace
				 */

				// Realizar cruce.

				// Realizar mutaciï¿½n.

				// Correr la nueva toda la poblaciï¿½n.
//				common.restart();
//				this.runThreads();
				current_generations++;
			}
		}
	}

	private ArrayList<Chromosome> makeSelection(ArrayList<Chromosome> current) {
		ArrayList<Chromosome> copy = new ArrayList<>(MAX_T);
		return null;
	}

	public class CustomComparator implements Comparator<Chromosome> {
		@Override
		public int compare(Chromosome c1, Chromosome c2) {
			return c1.getScore() >= c2.getScore() ? c1.getScore() : c2
					.getScore();
		}
	}

	/**
	 * Metodos para la interfaz grafica de Genetris
	 **/

	public void botonPlay() {

	}

	public void botonStep() {

	}

	public void botonStop() {

	}

	public void botonExperimentoSimple() {
		experimento = new SingleExperiment();
		Gene gen = new Gene(new Randomizer());
	}
}
