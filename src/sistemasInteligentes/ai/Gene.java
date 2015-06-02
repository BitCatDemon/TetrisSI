package sistemasInteligentes.ai;

public class Gene {

	private double[] genes;

	public static enum geneID {
		HEIGHT, LINE, HOLES, BLOCK, WALLS, FLOOR, PARTNER;
	}

	public Gene() {
		genes = new double[7];
		// ACÁ HABRÍA QUE GENERAR VALORES PARA CADA GEN.
	}
	
	public Gene(double[] genes){
		this.genes = genes;
	}

	public double[] getGenes() {
		return genes;
	}

	public void setGenes(double[] genes) {
		this.genes = genes;
	}
	

}
