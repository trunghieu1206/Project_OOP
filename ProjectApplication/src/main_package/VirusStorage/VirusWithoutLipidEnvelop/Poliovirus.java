

package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public class Poliovirus extends VirusWithoutLipidEnvelop{
    public Poliovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
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
        str.append("  Poliovirus is a highly contagious virus that causes poliomyelitis (polio), a disease that can lead to paralysis and, in severe cases, can be life-threatening\n");
        str.append("  The most effective way to prevent polio is through vaccination. Two types of vaccines are used: Inactivated Poliovirus Vaccine (IPV) and Oral Poliovirus Vaccine (OPV)\n");
        return str.toString();
    }
}
