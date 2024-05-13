package main_package.VirusStorage;

public class AcidNucleic {
	private String type;
	private String strand;
	private int num;
	
	public AcidNucleic(String type, int strand, int num) {
		this.type = type;
		this.strand = strand;
		this.strand = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStrand() {
		return strand;
	}

	public void setStrand(int strand) {
		this.strand = strand;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}