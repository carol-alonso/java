package T44_5;

public abstract class ClasseAbs {
	
	private String especie;
	
	public ClasseAbs(String especie) {
		this.especie = especie;
	}
	
	abstract public void som();
		
	public String getString;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGetString() {
		return getString;
	}

	public void setGetString(String getString) {
		this.getString = getString;
	}

}
