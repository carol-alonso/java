package T44_5;

public class CachorroClass extends AnimalClass{

	private String racaCachorro;
	
	public CachorroClass(String nomeAnimal, int idadeAnimal, boolean emiteSom,
	String deslocamento, String racaCachorro) {
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		
		this.racaCachorro = racaCachorro;
	}
	
	public void infoCachorro() {
		System.out.println("O cachorro se chama " +getNomeAnimal()+"."
		+"\nTem " +getIdadeAnimal() + " anos de vida.");
		if(isEmiteSom()) {
			System.out.print("Emite latido.");
		}
		else {
			System.out.print("\nN�o emite nenhum som.");
		}
		System.out.println("\nO deslocamento dele � do tipo "+getDeslocamento()
		+ "\nSua ra�a � "+racaCachorro);
	}

	public String getRacaCachorro() {
		return racaCachorro;
	}

	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}
}
