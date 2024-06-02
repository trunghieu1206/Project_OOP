

package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public class HIV extends VirusWithLipidEnvelop{
    public HIV(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        a.setType("DNA");
        a.setNum(1);

        a.setStrand("Double");

        str.append("The viral RNA genome is reverse transcribed into double-stranded DNA\n");
        str.append("It replicates its genetic material in the cytoplasm of infected host cells\n");
        str.append(super.replicateGene());
        str.append("It replicates its genetic material in the nucleus of infected host cells\n");
        return str.toString();
    }
    
    public String displayInformation(Virus virus) {
    	StringBuilder str = new StringBuilder("");
        str.append(super.displayInformation(virus));
        str.append("This virus targets and weakens the immune system of human by destroying important cells that fight disease and infection. Over time, as HIV destroys more CD4 cells, the body becomes more vulnerable to infections and certain cancers.\n");
        str.append("There is no cure for HIV/AIDS, but it can be managed with proper medical care. Antiretroviral therapy (ART) is the standard treatment, which involves taking a combination of HIV medicines every day.\n");
        return str.toString();
    }
}
