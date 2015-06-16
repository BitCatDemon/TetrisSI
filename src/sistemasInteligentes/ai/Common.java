package sistemasInteligentes.ai;

public class Common {
	private int MAX_T;
	public int doneThreads = 0;
	private boolean allDone = false;
	private int[][] initialPlayField;
	private static Common common;

	private Common(int maxT) {
		this.MAX_T = maxT;
//		initialPlayField = PlayfieldUtil.createPlayfield();
	}

//	public synchronized int[][] getInitialPlayfield() {
//		return initialPlayField.clone();
//	}

	public synchronized boolean areAllDone() {
		return allDone;
	}

	public static Common getInstance(int maxT) {
		if (common == null) {
			common = new Common(maxT);
		}
		return common;
	}

	public synchronized void imDone() {
		doneThreads++;
		allDone = doneThreads == MAX_T;
	}

	public void restart() {
		doneThreads = 0;
		ready = 0;
		allDone = false;
	}

	int ready = 0;

	protected synchronized void imReady() {
		ready++;
	}

	protected synchronized boolean shallIStart() {
		if (ready == MAX_T) {
			System.out.println("Ya están listos");
		}
		return ready == MAX_T;
	}

}
