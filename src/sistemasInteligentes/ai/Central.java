package sistemasInteligentes.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import sistemasInteligentes.Genetris;

import sistemasInteligentes.SingleExperiment;

public class Central {

    ArrayList<Chromosome> players;
    final int MAX_T = 15;
    private int MAX_G = 20;
    final int selection_percentage = 20, mutation_percentage = 30;
    private static Central central;
    boolean allStarted = false;
    boolean stop4Starting = true;
    private Common common;
    private Random random = new Random();
    private boolean isEvolving = true;
    Chromosome best;
    SingleExperiment experimento;
    Genetris g;

    private Central() {
        players = new ArrayList<>(MAX_T);
        common = Common.getInstance(MAX_T);
        initializeThreads();
    }

    public void setCentral(Genetris g) {
        this.g = g;
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
                System.out.println("Se rompi� " + i);
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

    public Chromosome evolve() {
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
                g.updateCurrentGeneration(current_generations);
                System.out.println(current_generations);
            }
        }
        while (lastRound()) {
            if (!allStarted) {
                this.runThreads();
            }
            if (areAllStarted() && common.areAllDone()) {
                Collections.sort(players, new ChromosomeComparator());
                resetChromosomeValues(players);
                best = players.get(0);
                lastRound = false;
                setEvolving(false);
            }
        }
        return players.get(0);
    }

    private void resetChromosomeValues(ArrayList<Chromosome> current) {
        for (Chromosome chromosome : current) {
            chromosome.resetValues();
        }
    }

    public synchronized boolean isEvolving() {
        return isEvolving;
    }

    public void setEvolving(boolean done) {
        this.isEvolving = done;
    }

    /**
     * Se selecciona un 20% de la poblaci�n que corresponde a los mejores. de
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
     * obtendr�n los genes de la cr�a que surgir�.
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
     * Se muta un 30% de la poblaci�n de cromosomas seleccionados.
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
     * */
    public Chromosome getBest() {
        // TODO Auto-generated method stub
        return best;
    }

    public Chromosome[] getThreeBest() {
        Chromosome[] vector = {players.get(0), players.get(1), players.get(2)};
        return vector;
    }

    public int getMAX_G() {
        return MAX_G;
    }

    public void setMAX_G(int MAX_G) {
        this.MAX_G = MAX_G;
    }
}
