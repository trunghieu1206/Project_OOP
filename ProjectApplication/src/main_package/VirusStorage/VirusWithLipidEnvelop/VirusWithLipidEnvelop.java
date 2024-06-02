

package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public abstract class VirusWithLipidEnvelop extends Virus{
	protected LipidEnvelop l;
	protected Glycoprotein g;
	
	public VirusWithLipidEnvelop(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
		this.l = l;
		this.g = g;
	}

	public LipidEnvelop getL() {
		return l;
	}

	public void setL(LipidEnvelop l) {
		this.l = l;
	}

	public Glycoprotein getG() {
		return g;
	}

	public void setG(Glycoprotein g) {
		this.g = g;
	}

	public String attachToHostCell() {
		StringBuilder str = new StringBuilder("");
		str.append("Viruses with Lipid envelop have Glycoprotein spikes that attach to host cell's receptors\n");
		return str.toString();
	}
	
	public String entryIntoHostCell() {
		StringBuilder str = new StringBuilder("");
		str.append("Virus's envelop fuses with host cell's membrane through endocytosis (a process which a cell absorbs external material by engulfing it with the cell's membrane\n");
		g.setNum(0);
		l.setNum(0);
		str.append("Capsid and Acid Nucleic of virus release inside the host cell\n");
		str.append("Virus's Acid Nucleic seperates from Capsid and incorporates into host cell's genetic material\n");
		c.setNum(0);
		return str.toString();
	}

	public String replicateGene() {
		StringBuilder str = new StringBuilder("");
		str.append(super.replicateGene());
		return str.toString();
	}
	
	public String release() {
		StringBuilder str = new StringBuilder("");
		l.setNum(10);
		g.setNum(10);
		str.append("Newly created virus emerge form the host cell.\n");
		str.append("Some viruses with Lipid envelop retain parts of the host cell's membrane, forming an envelop around the virus. This envelop gives some protection to the virus from the immune system of the host organism.\n");
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
