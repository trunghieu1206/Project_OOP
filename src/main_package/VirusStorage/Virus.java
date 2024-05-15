
package main_package.VirusStorage;

import main_package.VirusStorage.Part.*;
import main_package.VirusStorage.VirusWithLipidEnvelop.*;

public abstract class Virus {
	protected AcidNucleic a;
	protected Capsid c;
	protected String disease;
	protected int year;
	protected String origin;
	
	public Virus(AcidNucleic a, Capsid c, String disease, int year, String origin) {
		this.a = a;
		this.c = c;
		this.disease = disease;
		this.year = year;
		this.origin = origin;
	}
	
	public AcidNucleic getA() {
		return a;
	}

	public void setA(AcidNucleic a) {
		this.a = a;
	}

	public Capsid getC() {
		return c;
	}

	public void setC(Capsid c) {
		this.c = c;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public abstract void attachToHostCell();
	
	public abstract void entryIntoHostCell();
	
	public void replicateGene() {
		a.setNum(10);
		System.out.println("The viral genome takes over the host cell's machinery to replicate its genetic material and express viral proteins");
		System.out.println("\n");
	}
	
	public void assemble() {
		c.setNum(10);
		System.out.println("New viral particles (consists of Acid Nucleic and Capsid) are created by the synthesized viral proteins");
		System.out.println("\n");
	}
	
	public abstract void release();
	
	public void infectToNewCells() {
		System.out.println("Newly created virus will repeat the infecting process with other cells in the body");
		System.out.println("\n");
	}
	
	public abstract void displayInfectionProcess();
	
	public <T> void displayInformation(T virus) {
		System.out.println("It is the virus responsible for " + virus.getDisease());
		System.out.println("It was first identified in " + virus.getYear() + " in " + virus.getOrigin() + ".");
	}

	public <T> void displayStructure(T virus) {
		System.out.println("The structure of " + virus.getClass().getName() + ": ");
		System.out.println("1. Acid nucleic (genetic material): a " + virus.getA().getStrand() + "-stranded " + virus.getA().getType());
		System.out.println("2. Capsid (protein shell that protect the genetic material)");
		if (virus instanceof VirusWithLipidEnvelop) {
			System.out.println("3. Lipid envelop (the outermost layer of the virus that protects the genetic material in its life cycle when traveling between host cells)");
			System.out.println("4. Spike glycoprotein (is embedded within the lipid envelope and plays a crucial role in viral attachment to host cells)");
		}
	}
}
