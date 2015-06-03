package sistemasInteligentes.ai;

import java.util.ArrayList;
import sistemasInteligentes.SingleExperiment;

public class Central extends Thread {
	ArrayList<Chromosome> players;
	final int MAX_T = 20;
	final int MAX_G = 30;
	public int[] tetriminos;
	private static Central central;
	Common common;
        SingleExperiment experimento;

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
				// Realizar selecci�n.

				// Realizar cruce.

				// Realizar mutaci�n.

				// Correr la nueva toda la poblaci�n.
				common.restart();
				this.runThreads();
			}
		}
	}
        
        
        /**
        * Metodos para la interfaz grafica de Genetris
        **/
        
        public void botonPlay (){
            
        }
        public void botonStep (){
            
        }
        public void botonStop (){
            
        }
        public void botonExperimentoSimple (){
            experimento = new SingleExperiment();
            Gene gen = new Gene();
        }
}
