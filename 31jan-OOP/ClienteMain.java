package T44_4;

public class ClienteMain {

	public static void main(String[] args) {
		
		ClienteClass c1 = new ClienteClass("Gabriel", 20, 1.75, 70);
		ClienteClass c2 = new ClienteClass("Luis", 18, 1.84, 80);
		
		System.out.println(c1.getNome()+ " tem " + c1.getIdade() + " anos, "
				+ c1.getAltura() + " de altura e " + c1.getPeso() + " kilogramas.");
		
		System.out.println("\n" + c2.getNome()+ " tem " + c2.getIdade() + " anos, "
				+ c2.getAltura() + " de altura e " + c2.getPeso() + " kilogramas.");

	}

}
