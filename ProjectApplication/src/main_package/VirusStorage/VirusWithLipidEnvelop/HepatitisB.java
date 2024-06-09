

package main_package.VirusStorage.VirusWithLipidEnvelop;

import main_package.VirusStorage.Virus;
import main_package.VirusStorage.Part.AcidNucleic;
import main_package.VirusStorage.Part.Capsid;
import main_package.VirusStorage.Part.Glycoprotein;
import main_package.VirusStorage.Part.LipidEnvelop;


public class HepatitisB extends VirusWithLipidEnvelop{
    public HepatitisB(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public String replicateGene() {
    	StringBuilder str = new StringBuilder("");
        str.append(super.replicateGene());
        str.append("  It replicates its genetic material in the nucleus of infected host cells\n");
        return str.toString();
    }
    
    public String displayInformation(Virus virus) {
    	StringBuilder str = new StringBuilder("");
        str.append(super.displayInformation(virus));
        str.append("  This virus causes liver infection that can lead to both acute and chronic disease, and it is a significant global health problem due to its potential to cause chronic liver disease, liver cirrhosis, and liver cancer.\n");
        str.append("  The hepatitis B vaccine is the most effective way to prevent infection. It is typically given in a series of three or four shots over a six-month period.\n");
        return str.toString();
    }
}
