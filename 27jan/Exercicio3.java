package T44_2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Entre com a idade:");
		idade = leia.nextInt();
		
		if(idade <= 14 && idade >= 10) {
			System.out.println("Sua categoria é: Infantil");
		} else if (idade <= 17 && idade >= 15) {
			System.out.println("Sua categoria é: Juvenil");
		} else if (idade <=25 && idade >= 18) {
			System.out.println("Sua categoria é: Adulto");
		} else {
			System.out.println("Não há categoria para essa idade!");
		}

	}

}
