package sistemasInteligentes.ai;

public class Common {
private int MAX_T;
	public int doneThreads = 0;
	private boolean allDone = false;
	private static Common common;

	private Common(int maxT) {
		this.MAX_T= maxT;
	}

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
		allDone = false;
	}

}
