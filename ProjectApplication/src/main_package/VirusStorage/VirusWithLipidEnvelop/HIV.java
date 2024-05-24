
package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public class HIV extends VirusWithLipidEnvelop{
    public HIV(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public void replicateGene() {
        a.setType("DNA");
        a.setNum(1);

        a.setStrand("Double");

        System.out.println("The viral RNA genome is reverse transcribed into double-stranded DNA");
        System.out.println("It replicates its genetic material in the cytoplasm of infected host cells");
        super.replicateGene();
        System.out.println("It replicates its genetic material in the nucleus of infected host cells");
    }
}
