

package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public abstract class VirusWithoutLipidEnvelop extends Virus {
	public VirusWithoutLipidEnvelop(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
	
	public String attachToHostCell() {
		StringBuilder str = new StringBuilder("");
		str.append("  Viruses without lipid envelop does not fuse with the host cell's membrane, instead they are absorbed directly into the host cell through endocytosis.\n  This creates a new vesicle consists of the virus Acid Nucleic, Capsid and an envelop made up of the host cell's membrane\n");
		return str.toString();
	}
	
	public String entryIntoHostCell() {
		StringBuilder str = new StringBuilder("");
		str.append("  After the newly created vesicle is engulfed into the host cell, the viral Acid Nucleic is released and separated from the Capsid\n");
		c.setNum(0);
		return str.toString();

	}

	public String replicateGene() {
		return super.replicateGene();
	}
	
	public String release() {
		StringBuilder str = new StringBuilder("");
		str.append("  Newly created viruses, which only consist of Acid Nucleic and Capsid, emerge from the host cell\n");
		return str.toString();

	}
	
	public String displayInfectionProcess(){
		StringBuilder str = new StringBuilder("");
		str.append(this.attachToHostCell());
		str.append(this.entryIntoHostCell());
		str.append(this.replicateGene());
		str.append(this.assemble());
		str.append(this.release());
		str.append(this.infectToNewCells());
		return str.toString();
	}
}
