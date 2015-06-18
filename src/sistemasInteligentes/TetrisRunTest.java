package sistemasInteligentes;

import java.awt.EventQueue;
import java.util.Random;

import sistemasInteligentes.ai.Central;
import sistemasInteligentes.ai.Chromosome;
import sistemasInteligentes.ai.Common;
import sistemasInteligentes.ai.Gene;
import tetris.gui.ImageLoader;
import tetris.gui.Images;
import tetris.gui.Randomizer;
import tetris.gui.TetrisFrame;

public class TetrisRunTest extends Thread {

	public static final boolean PLAY_FAST = true; // disables drop movements
	private volatile TetrisFrame tetrisFrame;
	Randomizer randomizer;

	Central central = Central.getInstance();
	Chromosome cr;

	int stepCount;
	boolean play;
	PlayFieldEvaluator pfe;
	Random rnd = new Random();
        private Common common;

	public void playGod() {
		while (central.isEvolving()) {
			central.evolve();
		}
        }
        
        public void setFirstPlayer(Chromosome cr) {
		this.cr = cr;
	}

        
//        public void launch() throws Throwable {
//		createTetrisFrame(ImageLoader.loadImages());
//		playGod();
//		setFirstPlayer(central.getBest());
//
//		run();
	public void launch(Chromosome cr) throws Throwable {
		createTetrisFrame(ImageLoader.loadImages());
                setFirstPlayer(cr);
		run();
	}

	@Override
	public void run() {
		cr.resetValues();
		stepCount = 0;
		play = false;
		randomizer = new Randomizer();
		getOrSetGameStatus(movimiento.play);
		while (true) {
			while (getOrSetGameStatus(null)) {
				if (step() == -1) {
					System.out.println("Termino el juego");
					getOrSetGameStatus(movimiento.stop);
				}
			}
			if (mvnt == movimiento.step) {
				if (step() == -1) {
					System.out.println("Termino el juego");
					getOrSetGameStatus(movimiento.stop);
				}
				getOrSetGameStatus(movimiento.still);
			}
			if (mvnt == movimiento.stop) {

				break;
			}
		}
	}

	public void b_play() {
		try {
			getOrSetGameStatus(movimiento.play);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void b_step() {
		try {
			getOrSetGameStatus(movimiento.step);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void stopGame() {
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
		tetris.ai.State state = cr.ai.search(cr.pfe.currentPF, cr.tetriminos);
		if (state == null) {
			System.out.println("PERDI� \n \n" + "Score: " + cr.getScore());
			return -1;
		}
		tetrisFrame.lockTetrimino(cr.tetriminos[0], state.rotation, state.x,
				state.y, !PLAY_FAST);
		cr.ai.playfieldUtil.lockTetrimino(cr.pfe.currentPF, cr.tetriminos[0],
				state);
		cr.updateScore();
		tetrisFrame.updateStatisticsAndNext(cr.tetriminos[0], cr.tetriminos[1]);
		cr.setNextTetriminoType();

		if (stepCount == 1000) {
			System.out.println("Fin movimientos \n \n" + "Score: "
					+ cr.getScore());
			return -1;
		}
		return stepCount;
	}

	public void finalJuego() {
		while (true) {
			tetrisFrame.updateStatisticsAndNext(cr.tetriminos[0],
					cr.tetriminos[1]);
			if (!tetrisFrame.dropTetrimino(cr.tetriminos[0], !PLAY_FAST)) {
				break;
			}
			randomizer.setNextTetriminoType(cr.tetriminos);
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

}
