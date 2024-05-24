package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;

public class SarsCov2 extends VirusWithLipidEnvelop{
    public SarsCov2(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }
    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the cytoplasm of infected host cells");
    }

}
