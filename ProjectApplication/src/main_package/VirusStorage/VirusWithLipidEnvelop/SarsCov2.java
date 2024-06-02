

package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public class SarsCov2 extends VirusWithLipidEnvelop{
    public SarsCov2(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }
    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        str.append(super.replicateGene());
        str.append("It replicates its genetic material in the cytoplasm of infected host cells\n");
        return str.toString();
    }
    
    public String displayInformation(Virus virus) {
    	StringBuilder str = new StringBuilder("");
        str.append(super.displayInformation(virus));
        str.append("SARS-CoV-2 primarily spreads through respiratory droplets from an infected person when they cough, sneeze, talk, or breathe\n");
        str.append("COVID-19 presents a wide range of symptoms that can appear 2-14 days after exposure to the virus such as fever, cough, difficulty in breathing, headache, runny nose\n");
        str.append("Vaccine is the most effective way to prevent infection.\n");
        return str.toString();
    }

}
