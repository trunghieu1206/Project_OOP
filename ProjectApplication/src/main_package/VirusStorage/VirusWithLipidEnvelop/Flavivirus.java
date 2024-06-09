

package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public class Flavivirus extends VirusWithLipidEnvelop{
    public Flavivirus(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        str.append(super.replicateGene());
        str.append("  It replicates its genetic material in the cytoplasm of infected host cells\n");
        return str.toString();
    }
    
    public String displayInformation(Virus virus) {
    	StringBuilder str = new StringBuilder("");
        str.append(super.displayInformation(virus));
        str.append("  Flavivirus are typically transmitted by arthropod vectors, primarily mosquitoes and ticks, and can cause a variety of diseases in humans and animals\n");
        str.append("  Vaccine is the most effective way to prevent infection.\n");
        return str.toString();
    }
}
