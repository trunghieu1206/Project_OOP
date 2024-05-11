package main_package.VirusStorage;

public abstract class Virus {
	protected AcidNucleic a;
	protected Capsid c;
	
	public Virus(AcidNucleic a, Capsid c) {
		this.a = a;
		this.c = c;
	}
	
	public abstract void attachToHostCell();
	
	public abstract void entryIntoHostCell();
	
	public void replicateGene() {
		System.out.println("DNA virus uses the host cell proteins and enzymes to synthesize viral proteins");
		System.out.println("\n");
	}
	
	public void assemble() {
		System.out.println("New viral particles (consists of Acid Nucleic and Capsid) are created by the synthesized viral proteins");
		System.out.println("\n");
	}
	
	public abstract void release();
	
	public void infectToNewCells() {
		System.out.println("Newly created virus will repeat the infecting process with other cells in the body");
		System.out.println("\n");
	}
	
	public abstract void displayInfectionProcess();
	
}
