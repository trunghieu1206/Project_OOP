

package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public class Poliovirus extends VirusWithoutLipidEnvelop{
    public Poliovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        str.append(super.replicateGene());
        str.append("It replicates its genetic material in the cytoplasm of infected host cells\n");
        return str.toString();
    }
}
