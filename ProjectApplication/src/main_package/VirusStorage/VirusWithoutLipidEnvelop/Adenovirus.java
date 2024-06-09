

package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public class Adenovirus extends VirusWithoutLipidEnvelop{
    public Adenovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
    
    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        str.append(super.replicateGene());
        str.append("  It replicates its genetic material in the nucleus of infected host cells\n");
        return str.toString();
    }
    
    public String displayInformation(Virus virus) {
    	StringBuilder str = new StringBuilder("");
        str.append(super.displayInformation(virus));
        str.append("  Adenoviruses cause a variety of illnesses in humans, ranging from mild respiratory infections to more severe diseases, particularly in people with weakened immune systems\n");
        str.append("  The symptoms of adenovirus infections depend on the site of infection and can vary widely. Common types of infections and their symptoms include: respiratory infections, gastrointestinal infections, and eye infections\n");
        str.append("  Treatment focuses on rest, hydration, fever reducers and pain relievers.\n");
        return str.toString();
    }

}
