/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/


package T44;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a nota 3: ");
		nota3 = leia.nextDouble();
				
				
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
		
		System.out.println("A média ponderada das notas é de: "+media);
	}

}
