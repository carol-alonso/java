package T44_2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		int num, somaNum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			somaNum += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos n�meros � de: "+somaNum);
	}

}
