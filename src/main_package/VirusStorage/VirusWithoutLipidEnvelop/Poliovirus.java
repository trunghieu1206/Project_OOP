package main_package.VirusStorage.VirusWithoutLipidEnvelop;

import main_package.VirusStorage.Part.*;

public class Poliovirus extends VirusWithoutLipidEnvelop{
    public Poliovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the cytoplasm of infected host cells");
    }
}
