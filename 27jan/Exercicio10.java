package T44_2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		
		int num, somaNum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			somaNum += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos números é de: "+somaNum);
	}

}
