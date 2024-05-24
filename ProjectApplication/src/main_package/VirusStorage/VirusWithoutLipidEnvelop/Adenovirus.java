package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;

public class Adenovirus extends VirusWithoutLipidEnvelop{
    public Adenovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
    
    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the nucleus of infected host cells");
    }

}
