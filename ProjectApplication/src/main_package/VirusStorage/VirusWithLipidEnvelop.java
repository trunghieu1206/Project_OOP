package main_package.VirusStorage;

public abstract class VirusWithLipidEnvelop extends Virus{
	protected LipidEnvelop l;
	protected Glycoprotein g;
	
	public VirusWithLipidEnvelop(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c) {
		 super(a, c);
		 this.l = l;
	}
	
	public void attachToHostCell() {
		System.out.println("Viruses with Lipid envelop have Glycoprotein spikes that attach to host cell's receptors");
		System.out.println("\n");
	}
	
	public void entryIntoHostCell() {
		System.out.println("Virus's envelop fuses with host cell's membrane through endocytosis (a process which a cell absorbs external material by engulfing it with the cell's membrane");
		g.setNum(0);
		l.setNum(0);
		System.out.println("Capsid and Acid Nucleic of virus release inside the host cell");
		System.out.println("Virus's Acid Nucleic seperates from Capsid and incorporates into host cell's genetic material");
		c.setNum(0);
		System.out.println("\n");
	}
	
	public void release() {
		System.out.println("Newly created virus emerge form the host cell.");
		System.out.println("Some viruses with Lipid envelop retain parts of the host cell's membrane, forming an envelop around the virus. This envelop gives some protection to the virus from the immune system of the host organism.");
		System.out.println("\n");
	}
	
	public void displayInfectionProcess(){
		this.attachToHostCell();
		this.entryIntoHostCell();
		this.replicateGene();
		this.assemble();
		this.release();
		this.infectToNewCells();
	}
	
}
