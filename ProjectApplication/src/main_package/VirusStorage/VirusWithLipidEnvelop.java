package main_package.VirusStorage;

public abstract class VirusWithLipidEnvelop extends Virus{
	private LipidEnvelop l;
	private Glycoprotein g;
	
	public VirusWithLipidEnvelop(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid n) {
		 super(a, n);
		 this.l = l;
	}
	
	public void attachToHostCell() {
		
	}
	
	public void entryIntoHostCell() {
		
	}
	
	public void release() {
		
	}
	
	public void displayInfectionProcess(){
		
	}
	
}
