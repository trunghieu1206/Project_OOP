package main_package.VirusStorage.Part;

public class AcidNucleic {
	private String type;
	private String strand;
	private int num;
	
	public AcidNucleic(String type, String strand, int num) {
		this.type = type;
		this.strand = strand;
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStrand() {
		return strand;
	}

	public void setStrand(String strand) {
		this.strand = strand;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}