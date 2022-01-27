package T44_2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*Faça um programa em que permita a entrada de um número qualquer
		 *e exiba se este número é par ou ímpar. Se for par exiba também
		 *a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		
		System.out.println("Informe um número:");
		num = leia.nextDouble();
		
		if(num %2 == 0) {
			
			System.out.println(num+ " é um número par.");
			num = Math.sqrt(num);
			System.out.println("\nSua raíz quadrada é: "+num);
		} else {
			
			System.out.println(num+ " é um número impar.");
			num = Math.pow(num, 2);
			System.out.println("\nSua potência ao quadrado é: "+num);
		
		}

	}

}
