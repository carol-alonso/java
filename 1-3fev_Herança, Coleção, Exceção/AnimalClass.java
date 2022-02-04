package T44_5;

public class AnimalClass {

	private String nomeAnimal;
	private int idadeAnimal;
	private boolean emiteSom;
	private String deslocamento;
	
	public AnimalClass(String nomeAnimal, int idadeAnimal, boolean emiteSom,
			String deslocamento) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.emiteSom = emiteSom;
		this.deslocamento = deslocamento;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	public String getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(String deslocamento) {
		this.deslocamento = deslocamento;
	}
	
	
}
