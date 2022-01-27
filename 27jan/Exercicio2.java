package T44_2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		// Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner (System.in);
		
		double num1,num2,num3,maior1=0,maior2=0,maior3=0;

		System.out.println("Entre com o numero 1: ");
		num1 = leia.nextDouble();
		System.out.println("Entre com o numero 2: ");
		num2 = leia.nextDouble();
		System.out.println("Entre com o numero 3: ");
		num3 = leia.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			maior1 = num1; // se num1 for menor, vai pra posição 1
			if(num2 < num3) { // se num2 for menor que num3
				maior2 = num2;
				maior3 = num3;
			} else {		  // se num3 for menor que num2
				maior2 = num3;
				maior3 = num2;
			}
		} 
		if (num2 < num1 && num2 < num3) {
			maior1 = num2;
			if(num1 < num3) {
				maior2 = num1;
				maior3 = num3;
			} else {
				maior2 = num3;
				maior3 = num1;
			}
		} 
		if (num3 < num2 && num3 < num1) {
			maior1 = num3;
			if(num2 < num3) {
				maior2 = num2;
				maior3 = num1;
			} else {
				maior2 = num1;
				maior3 = num2;
			}
		}
		
		System.out.println("A ordem crescente é: "+ maior1 + ", " + maior2 + " e " + maior3);
	}
}
