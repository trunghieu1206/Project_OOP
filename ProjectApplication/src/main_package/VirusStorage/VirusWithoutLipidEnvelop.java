package main_package.VirusStorage;

public abstract class VirusWithoutLipidEnvelop extends Virus {
	public VirusWithoutLipidEnvelop(AcidNucleic a, Capsid c) {
		super(a, c);
	}
	
	public void attachToHostCell() {
		System.out.println("Viruses without lipid envelop does not fuse with the host cell's membrane, instead they are absorbed directly into the host cell through endocytosis.\nThis creates a new vesicle consists of the virus Acid Nucleic, Capsid and an envelop made up of the host cell's membrane");
		System.out.println("\n");
	}
	
	public void entryIntoHostCell() {
		System.out.println("After the newly created vesicle is engulfed into the host cell, the viral Acid Nucleic is released and separated from the Capsid");
		c.setNum(0);
		System.out.println("\n");
	}
	
	public void release() {
		System.out.println("Newly created viruses, which only consist of Acid Nucleic and Capsid, emerge from the host cell");
		System.out.println("\n");
	}
	
	public void displayInfectionProcess() {
		this.attachToHostCell();
		this.entryIntoHostCell();
		this.replicateGene();
		this.assemble();
		this.release();
		this.infectToNewCells();
	}
}
