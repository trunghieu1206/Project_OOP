package main_package.VirusStorage;

public abstract class Virus {
	private AcidNucleic a;
	private Capsid n;
	
	public Virus(AcidNucleic a, Capsid n) {
		this.a = a;
		this.n = n;
	}
	
	public abstract void attachToHostCell();
	
	public abstract void entryIntoHostCell();
	
	public void replicateGene() {
		
	}
	
	public void assemble() {
		
	}
	
	public abstract void release();
	
	public void infectToNewCells() {
		
	}
	
	public abstract void displayInfectionProcess();
	
}
