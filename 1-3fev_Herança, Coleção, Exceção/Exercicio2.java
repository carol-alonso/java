package T44_5;

import java.util.Scanner;

public class Exercicio2{

	public static void main(String[] args) {
		
		ClasseAbs animais = null;

		CachorroAbs dog = new CachorroAbs();
		CavaloAbs cav = new CavaloAbs();
		Pregui�aAbs preg = new Pregui�aAbs();
	
		Scanner leia = new Scanner(System.in);

		int opc;
		
		do {
			
			System.out.println("Escolha um animal:\n1-Cachorro\n2-Cavalo\n3-Pregui�a");
			opc = leia.nextInt();
			
			switch(opc) {
			
			case 1: animais = dog; break;
			case 2: animais = cav; break;
			case 3: animais = preg; break;
			
			default: System.out.println("Op��o inv�lida!");
			
			}
			
			if(animais != null) {
				animais.som();
			}
			
		} while (true); 
	}
}
