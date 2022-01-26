package T44;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1,nota2,nota3,media;
		// int (inteiro)
		// string (letras, numeros, geral)
		// char (um caractere)
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nMédia aritmética: " +media+ " e a nota 1: " +nota1);
		System.out.printf("\nMédia aritmética: %2.2f e a nota 1: %2.2f",media,nota1);
		
		nota1 = Math.sqrt(nota1);
		nota2 = Math.pow(nota3, 3);
		nota1 = nota2 % nota3;
	}

}
