package sistemasInteligentes;

import java.awt.EventQueue;
import java.util.ArrayList;
import sistemasInteligentes.ai.SIAI;

import sistemasInteligentes.ai.SIAIJuan;
import tetris.ai.AI;
import tetris.ai.PlayfieldUtil;
import tetris.ai.State;
import tetris.gui.ImageLoader;
import tetris.gui.Images;
import tetris.gui.Randomizer;
import tetris.gui.TetrisFrame;

public class TetrisSI extends Thread {

    public static final boolean PLAY_FAST = true; // disables drop movements
    private volatile TetrisFrame tetrisFrame;
    private volatile DebuggerTetris debuggerTetris;
    public volatile TetrisTest tetrisTest;
    Randomizer randomizer;
    SIAI ai;
    PlayfieldUtil playfieldUtil;
    int[] tetriminos;
    int[][] playfield;

    int stepCount;
    boolean play;
    PlayFieldEvaluator pfe;

    @Override
    public void run() {
        while (true) {
            while (getOrSetGameStatus(null)) {
                step();
            }
            if (mvnt == movimiento.step) {
                step();
                getOrSetGameStatus(movimiento.still);
            }
            if (mvnt == movimiento.stop) {
                getOrSetGameStatus(movimiento.still);
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm finalizing");
    }

    public void launch() throws Throwable {
        // Instancia las vistas graficas
        createTetrisFrame(ImageLoader.loadImages());
        debuggerTetris = new DebuggerTetris(this);
        debuggerTetris.setVisible(true);

        tetrisTest = new TetrisTest(this);
        tetrisTest.setVisible(true);

        // Instancias para la ejecucion del videojuego
        stepCount = 0;
        play = false;
        randomizer = new Randomizer();
        //ai = new Ka0tic();
        ai = new SIAI();
        playfieldUtil = new PlayfieldUtil();
        tetriminos = new int[AI.TETRIMINOS_SEARCHED];
        playfield = playfieldUtil.createPlayfield();
        randomizer.setInitialTetriminoTypes(tetriminos);
        updateTetrisSI();
        getOrSetGameStatus(movimiento.still);
        pfe = new PlayFieldEvaluator(playfield);
        run();
    }

    public void b_play() {
        try {
            getOrSetGameStatus(movimiento.play);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void b_step() {
        try {
            getOrSetGameStatus(movimiento.step);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void play() throws Throwable {
		// while (play) {
        // step();
        // }
    }

    public void stopGame() {
        // play = false;
        getOrSetGameStatus(movimiento.stop);
    }

    movimiento mvnt;

    public synchronized boolean getOrSetGameStatus(movimiento mvt) {
        if (mvt != null) {
            switch (mvt) {
                case play:
                    play = true;
                    break;
                case still:
                    break;
                default:
                    play = false;
                    break;
            }
            mvnt = mvt;
        }
        return play;
    }

    public static enum movimiento {

        play, step, stop, still;
    }

    public int step() {
        stepCount++;
        //Probando cuantos estados me dan con una O
        tetriminos[0] = 3;
        tetriminos[1] = 0;
        tetriminos[2] = 0;
        ArrayList<tetris.ai.State> estadosValidos = ai.search(playfield, tetriminos);
        System.out.println("EstadosValidos: " + estadosValidos.size());
        for (int i = 0; i < estadosValidos.size(); i++) {
            System.out.println("Estado: "+i+" "+estadosValidos.get(i));
        }
        //tetris.ai.State state = ai.search(playfield, tetriminos);
        tetris.ai.State state = new tetris.ai.State(5, 15, 0);
        //No se ejecuta por que estamos en PLAY_FAST
        if (!PLAY_FAST) {
            tetris.ai.State[] states = ai.buildStatesList(state);
            for (int i = 0; i < states.length; i++) {
                state = states[i];
                tetrisFrame.displayTetrimino(tetriminos[0], state.rotation,
                        state.x, state.y, 1);
            }
        }

        tetrisFrame.lockTetrimino(tetriminos[0], state.rotation, state.x, state.y, !PLAY_FAST);
        playfieldUtil.lockTetrimino(playfield, tetriminos[0], state);
        randomizer.setNextTetriminoType(tetriminos);
        updateTetrisSI();
        System.out.println("Altura Maxima: " + pfe.alturaMax() + "\n");
        return stepCount;
    }

//	public int step2() {
//		// updateTetrisSI();
//
//		stepCount++;
//		tetris.ai.State state = ai.search(playfield, tetriminos);
//		System.out.println(state.toString());
//		if (state == null) {return -1;}
//		tetrisFrame.updateStatisticsAndNext(tetriminos[0], tetriminos[1]);
//		if (!PLAY_FAST) {
//			tetris.ai.State[] states = ai.buildStatesList(state);
//			for (int i = 0; i < states.length; i++) {
//				state = states[i];
//				tetrisFrame.displayTetrimino(tetriminos[0], state.rotation,
//						state.x, state.y, 1);
//			}
//		}
//		tetrisFrame.lockTetrimino(tetriminos[0], state.rotation, state.x,
//				state.y, !PLAY_FAST);
//		playfieldUtil.lockTetrimino(playfield, tetriminos[0], state);
//		randomizer.setNextTetriminoType(tetriminos);
//		updateTetrisSI();
//		return stepCount;
//	}
    public void finalJuego() {
        while (true) {
            tetrisFrame.updateStatisticsAndNext(tetriminos[0], tetriminos[1]);
            if (!tetrisFrame.dropTetrimino(tetriminos[0], !PLAY_FAST)) {
                break;
            }
            randomizer.setNextTetriminoType(tetriminos);
        }
    }

    private void createTetrisFrame(final Images images) throws Throwable {
        EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                tetrisFrame = new TetrisFrame(images);
            }
        });
    }

    public void updateTetrisSI() {
        debuggerTetris.addAreaTexto("Step: " + stepCount + "\n");
        debuggerTetris.updateTetrisGrid(playfield);
        tetrisTest.updateTetrisGrid(playfield);
        // debuggerTetris.addAreaTexto(tetriminos.toString());
        debuggerTetris.printTetriminos(tetriminos);
        // debuggerTetris.printPlayfieldAreaTexto(playfield);
    }
}
