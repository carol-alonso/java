package T44_5;

public class CavaloClass extends AnimalClass{
	
	private String corCavalo;

	public CavaloClass(String nomeAnimal, int idadeAnimal, boolean emiteSom,
	String deslocamento, String corCavalo) {
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		
		this.corCavalo = corCavalo;
	}
	
	public void infoCavalo() {
		System.out.println("\n\nO cavalo se chama " +getNomeAnimal()+"."
		+"\nTem " +getIdadeAnimal() + " anos de vida.");
		if(isEmiteSom()) {
			System.out.print("Ele relincha.");
		}
		else {
			System.out.print("\nNão emite nenhum som."); }
			System.out.println("\nO deslocamento dele é do tipo "+getDeslocamento()+".");
			System.out.println("Ele é da cor "+corCavalo+".");
		}

	public String getCorCavalo() {
		return corCavalo;
	}

	public void setCorCavalo(String corCavalo) {
		this.corCavalo = corCavalo;
	}
			
}
