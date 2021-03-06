package sistemasInteligentes.ai;

public class Gene {

	public double[] genes;
	public final static int numberOfGenes = 7;

	public static enum geneID {
		HEIGHT, CLEARS, HOLES, BLOCK, WALLS, FLOOR, PARTNER;
	}

	public static final int HEIGHT = 0, CLEARS = 1, HOLES = 2, BLOCKADES = 3,
			WALLS = 4, FLOOR = 5, PARTNER = 6;

	public Gene(Randomizer randomizer) {
		genes = new double[numberOfGenes];
		for (int i = 0; i < genes.length; i++) {
			genes[i] = randomizer.getRndGeneValue();
		}
		// AC� HABR�A QUE GENERAR VALORES PARA CADA GEN.
	}

	public Gene(double[] genes) {
		this.genes = genes;
	}

	public double[] getGenes() {
		return genes;
	}

	public void setGenes(double[] genes) {
		this.genes = genes;
	}

	@Override
	public String toString() {
//		System.out.println("HEIGHT" + ": " + genes[HEIGHT]);
//		System.out.println("CLEARS" + ": " + genes[CLEARS]);
//		System.out.println("HOLES" + ": " + genes[HOLES]);
//		System.out.println("BLOCKADES" + ": " + genes[BLOCKADES]);
//		System.out.println("WALLS" + ": " + genes[WALLS]);
//		System.out.println("PARTNER" + ": " + genes[PARTNER]);
//		System.out.println("FLOOR" + ": " + genes[FLOOR]);
		String s = "{" + genes[0] + ", " + genes[1] + ", " + genes[2]
				+ "," + genes[3] + "," + genes[4] + "," + genes[5] + "," +genes[6]+"}";
		return s;
	}
        
        public String toString2(){
            String s = genes[HEIGHT]
                    +"&" + genes[CLEARS]
                    +"&" + genes[HOLES]
                    +"&" + genes[BLOCKADES]
                    +"&" + genes[WALLS]
                    +"&" + genes[FLOOR]
                    +"&" + genes[PARTNER];
            return s;
        }
}
