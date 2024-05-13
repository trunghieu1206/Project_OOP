package main_package.VirusStorage;

public class Rotavirus extends VirusWithoutLipidEnvelop{
    public Rotavirus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		super(a, c, disease, year, origin);
	}

    public void replicateGene() {
        super.replicateGene();
        System.out.println("It replicates its genetic material in the cytoplasm of infected host cells");
    }
}
