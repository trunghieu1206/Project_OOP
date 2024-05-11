package main_package.VirusStorage;

public abstract class Virus {
	private AcidNucleic a;
	private Membrane m;
	private Nucleocapsid n;
	private Glycoprotein g;
	
	public Virus(AcidNucleic a, Membrane m, Nucleocapsid n, Glycoprotein g) {
		this.a = a;
		this.m = m;
		this.n = n;
		this.g = g;
	}
	
	public void entryIntoHostCell() {
		
	}
	
	public void uncoat() {
		
	}
	
	public void replicateGene() {
		
	}
	
	public void assemble() {
		
	}
	
	public void maturateAndRelease() {
		
	}
	
	public void infectToNewCells() {
		
	}
	
	public abstract void displayInformation();
	
	public abstract void attachToHostCell();
	
}
