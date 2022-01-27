package T44_2;

import java.util.Scanner;

public class Else_IfElse {
	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a Primeira nota; ");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota; ");
		n2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota; ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3) / 3;
		System.out.printf("Sua média foi de %.2f ",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAlune aprovado ...");
			
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAlune de exame ...");
		
		}
		else {
			System.out.println("\nAlune reprovado ...");
			
		}
	}
}