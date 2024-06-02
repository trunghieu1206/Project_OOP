
package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public class Rhinovirus extends VirusWithoutLipidEnvelop{
    public Rhinovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
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
        str.append("Rhinoviruses are a group of viruses that are the most common cause of the common cold\n");
        str.append("Symptoms of rhinovirus infection typically appear 1-3 days after exposure and can last for 7-10 days, including nasal congestion, runny nose, sneezing, sore throat,...:\r\n");
        str.append("Treatment of rhinovirus infection focuses on rest, hydration, medications such as decongestants, antihistamines, and pain relievers\n");
        return str.toString();
    }

}