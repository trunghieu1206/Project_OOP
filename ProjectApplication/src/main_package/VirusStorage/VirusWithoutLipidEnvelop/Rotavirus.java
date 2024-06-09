

package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;


public class Rotavirus extends VirusWithoutLipidEnvelop{
    public Rotavirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
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
        str.append("  Rotavirus is a highly contagious virus that primarily infects the intestines, causing gastroenteritis, a common illness characterized by diarrhea and vomiting, especially in infants and young children\n");
        str.append("  It is transmitted through the fecal-oral route, primarily via: direct contact, contamintated surfaces and ingestion of contaminated food and water\n");
        str.append("  Symptoms of rotavirus infection typically appear 1-3 days after exposure and can last for 3-7 days, including severe watery diarrhea, fever, dehydration,...\n");
        str.append("  Treatment of rotavirus infection focuses on managing symptoms and preventing dehydration, including drinking rehydration solution, maintaining nutrition,...");
        return str.toString();
    }
}
