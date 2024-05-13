package main_package.VirusStorage;

public class HepatitisB extends VirusWithLipidEnvelop{
    public HepatitisB(LipidEnvelop l, Glycoprotein g, AcidNucleic a, Capsid c, String disease, int year, String origin) {
        super(l, g, a, c, disease, year, origin);
    }

    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the nucleus of infected host cells");
    }
}
