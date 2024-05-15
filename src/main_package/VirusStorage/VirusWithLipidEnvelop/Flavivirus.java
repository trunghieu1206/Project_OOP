package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Part.*;

public class Flavivirus extends VirusWithLipidEnvelop{
    public Flavivirus(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the cytoplasm of infected host cells");
    }
}
