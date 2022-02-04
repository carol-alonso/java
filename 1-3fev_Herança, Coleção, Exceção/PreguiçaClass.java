package T44_5;

public class PreguiçaClass extends AnimalClass{

	private String corPreguiça;
	
	public PreguiçaClass(String nomeAnimal, int idadeAnimal, boolean emiteSom,
	String deslocamento, String corPreguiça) {
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		
		this.corPreguiça = corPreguiça;

	}
	public void infoPreguiça() {
		System.out.println("\n\nA preguiça se chama " +getNomeAnimal()+"."
		+"\nTem " +getIdadeAnimal() + " anos de vida.");
		if(isEmiteSom()) {
			System.out.print("Ela faz grunidos.");
		}
		else {
			System.out.print("\nNão emite nenhum som."); }
			System.out.println("\nO deslocamento dela é do tipo "+getDeslocamento()+".");
			System.out.println("Ela é da cor "+corPreguiça+".");
		}

}
