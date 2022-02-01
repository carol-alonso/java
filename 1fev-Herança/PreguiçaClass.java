package T44_5;

public class Pregui�aClass extends AnimalClass{

	private String corPregui�a;
	
	public Pregui�aClass(String nomeAnimal, int idadeAnimal, boolean emiteSom,
	String deslocamento, String corPregui�a) {
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		
		this.corPregui�a = corPregui�a;

	}
	public void infoPregui�a() {
		System.out.println("\n\nA pregui�a se chama " +getNomeAnimal()+"."
		+"\nTem " +getIdadeAnimal() + " anos de vida.");
		if(isEmiteSom()) {
			System.out.print("Ela faz grunidos.");
		}
		else {
			System.out.print("\nN�o emite nenhum som."); }
			System.out.println("\nO deslocamento dela � do tipo "+getDeslocamento()+".");
			System.out.println("Ela � da cor "+corPregui�a+".");
		}

}
