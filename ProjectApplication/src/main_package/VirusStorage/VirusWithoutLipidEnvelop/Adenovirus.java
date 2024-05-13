package main_package.VirusStorage;

public class Adenovirus extends VirusWithoutLipidEnvelop{
    public Adenovirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}
    
    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the nucleus of infected host cells");
    }

}
