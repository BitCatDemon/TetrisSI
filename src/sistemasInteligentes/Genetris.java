/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasInteligentes;

import java.util.Random;
import javax.swing.JOptionPane;
import sistemasInteligentes.ai.Central;
import sistemasInteligentes.ai.Chromosome;
import sistemasInteligentes.gui.EvolveFrame;
import sistemasInteligentes.gui.Reader;
import sistemasInteligentes.gui.Writer;
import tetris.gui.Randomizer;

/**
 *
 * @author microraptor
 */
public class Genetris {

    public static final boolean PLAY_FAST = true;
    Randomizer randomizer;

    Central central = Central.getInstance();
    Chromosome cr;
    int stepCount;
    boolean play;
    PlayFieldEvaluator pfe;
    Random rnd = new Random();
    EvolveFrame centralFrame;
    public Chromosome [] threeBest;
    Writer writer  = new Writer();

    public Genetris() {
        threeBest = new Chromosome[3];
        centralFrame = new EvolveFrame(this);
        centralFrame.setVisible(true);
        central.setCentral(this);
    }
    public void playGod() {
        while (central.isEvolving()) {
            central.evolve();
        }
    }
    public void launch() throws Throwable {
        //createTetrisFrame(ImageLoader.loadImages());
        playGod();
        threeBest[0]=central.getThreeBest()[0];
        threeBest[1]=central.getThreeBest()[1];
        threeBest[2]=central.getThreeBest()[2];
        String genesPrint =threeBest[0].genes.toString2()+"&"+ threeBest[0].lastScore+"&"+ central.getMAX_G()+"\n";
        genesPrint +=threeBest[1].genes.toString2()+"&"+ threeBest[1].lastScore+"&"+ central.getMAX_G()+"\n";
        genesPrint +=threeBest[2].genes.toString2()+"&"+ threeBest[2].lastScore+"&"+ central.getMAX_G()+"\n";
        writer.escribir(genesPrint);
        JOptionPane.showMessageDialog(null, "La evolución a terminado.");
    }
    
    public void al_buttonEvolution(int max_generations) throws Throwable{
            this.central.setMAX_G(max_generations);
            this.launch();
    }
    
    public void updateCurrentGeneration(int i){
        centralFrame.updateCurrentGeneration(i);
    }


}

