package main_package.VirusStorage;

public class Glycoprotein {
	private String type;
	private int num;
	
	public Glycoprotein(String type, int num) {
		this.type = type;
		this.num = num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
