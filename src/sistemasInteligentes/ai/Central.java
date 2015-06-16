package sistemasInteligentes.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import sistemasInteligentes.SingleExperiment;

public class Central extends Thread {
	ArrayList<Chromosome> players;
	final int MAX_T = 15;
	final int MAX_G = 5;
	final int selection_percentage = 20, mutation_percentage = 30;
	private static Central central;
	boolean allStarted = false;
	boolean stop4Starting = true;
	Common common;
	SingleExperiment experimento;
	private Random random = new Random();

	public static void main(String[] args) {
		Central c = Central.getInstance();
		c.run();
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
			try {
				players.get(i).start();
			} catch (Exception e) {
				System.out.println("Se rompió " + i);
			}

		}
		doneStarting();
	}

	public synchronized void doneStarting() {
		allStarted = true;
	}

	public synchronized boolean areAllStarted() {
		return allStarted;
	}

	boolean lastRound = false;
	
	public synchronized boolean lastRound() {
		return lastRound;
	}
	@Override
	public void run() {
		int current_generations = 0;
		int[] res_selection;
		while (current_generations < MAX_G) {
			if (!allStarted) {
				this.runThreads();
			}

			if (areAllStarted() && common.areAllDone()) {
				Collections.sort(players, new ChromosomeComparator());
				res_selection = selection(players);
				players = crossover(res_selection);
				mutation(players);
				common.restart();
				current_generations++;
				allStarted = false;
				lastRound = current_generations == MAX_G;
			}
		}
		while (lastRound()) {
			if (!allStarted) {
				this.runThreads();
				}
			if (areAllStarted() && common.areAllDone()) {
				Collections.sort(players, new ChromosomeComparator());
				System.out.println(players.get(0).getScore());
				System.out.println(players.get(0).genes.toString());
				lastRound = false;
			}
		}
		
	}

	/**
	 * Se selecciona un 20% de la población que corresponde a los mejores. de
	 * resto se eligen parejas al azar y se aplica torneo entre scores
	 * obtenidas. Se retorna un arreglo de enteros con las posiciones en el
	 * ArrayList de los cromosomas seleccionados.
	 * 
	 * @param players
	 * @return ids
	 */
	private int[] selection(ArrayList<Chromosome> current) {
		int[] ids = new int[MAX_T];
		int firstSelected = (MAX_T * selection_percentage) / 100;
		for (int i = 0; i < firstSelected; i++) {
			ids[i] = i;
		}
		int p1, p2;
		for (int i = firstSelected; i < MAX_T; i++) {

			p1 = random.nextInt(MAX_T);
			p2 = random.nextInt(MAX_T);

			while (p1 == p2) {
				p2 = random.nextInt(MAX_T);
			}
			ids[i] = current.get(p1).getScore() >= current.get(p2).getScore() ? p1
					: p2;
		}
		return ids;
	}

	/**
	 * 
	 * Se seleccionan al azar dos cromosomas diferentes, de los cuales se
	 * obtendrán los genes de la cría que surgirá.
	 * 
	 * @param ids
	 * @return new players
	 */
	private ArrayList<Chromosome> crossover(int[] ids) {
		ArrayList<Chromosome> copy = new ArrayList<>(MAX_T);
		int numberOfGenes = Gene.numberOfGenes;
		int ind_mut, p1, p2;
		Chromosome cr;
		for (int i = 0; i < MAX_T; i++) {
			p1 = random.nextInt(MAX_T);
			p2 = random.nextInt(MAX_T);
			ind_mut = random.nextInt(numberOfGenes);
			while (p1 == p2) {
				p2 = random.nextInt(MAX_T);
			}

			cr = new Chromosome(common);
			copyGenes(cr.genes.genes, players.get(ids[p1]).genes.genes, 0,
					ind_mut);
			copyGenes(cr.genes.genes, players.get(ids[p2]).genes.genes,
					ind_mut, numberOfGenes);
			copy.add(cr);
		}
		return copy;
	}

	/**
	 * Se muta un 30% de la población de cromosomas seleccionados.
	 * 
	 * @param current
	 */
	private void mutation(ArrayList<Chromosome> current) {
		int numberOfGenes = Gene.numberOfGenes;
		int numMutated = (MAX_T * mutation_percentage) / 100;
		int numGenesMutated;
		int prev, cur = random.nextInt(MAX_T), gene;
		Chromosome cr;
		for (int i = 0; i < numMutated; i++) {
			numGenesMutated = random.nextInt(numberOfGenes);
			if (numGenesMutated == 0) {
				numGenesMutated = 1;
			}
			cr = current.get(cur);
			for (int j = 0; j < numGenesMutated; j++) {
				gene = random.nextInt(numberOfGenes);
				cr.genes.genes[gene] += random.nextDouble() / 10;
			}
			prev = cur;
			while (prev == cur) {
				cur = random.nextInt(MAX_T);
			}
		}
	}

	public void copyGenes(double[] destiny, double[] source, int begin, int end) {
		if (begin > end && destiny != null && source != null) {
			return;
		}
		for (int i = begin; i < end; i++) {
			destiny[i] = source[i];
		}
	}

	public class ChromosomeComparator implements Comparator<Chromosome> {
		@Override
		public int compare(Chromosome c1, Chromosome c2) {
			// return c1.getScore() >= c2.getScore() ? c1.getScore() : c2
			// .getScore();
			return c2.getScore() - c1.getScore();
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
