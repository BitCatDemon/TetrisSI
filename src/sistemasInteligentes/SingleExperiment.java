package sistemasInteligentes;

import sistemasInteligentes.TetrisSI;
import sistemasInteligentes.ai.Gene;

/**
 *
 * @author microraptor
 * 
 * Clase que ejecuta una instancia del tetris independiente de la aplicacion de 
 * algoritmos generitcos, pero que utiliza la inteligencia genetris es decir el vector
 * de 7 caracterisitcas de buen juego.
 */
public class SingleExperiment {
    TetrisSI currentTetris;
    Gene gen;
    public SingleExperiment() {
        currentTetris = new TetrisSI();
        gen = new Gene();
    }
    
    
}
