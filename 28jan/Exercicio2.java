package T44_3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

		Scanner leia = new Scanner(System.in);
		
		
		int []vetor = new int [6];
		int somaPar = 0, nImpar = 0;
		
		for(int i=0; i<6; i++) {
			System.out.println("Insira um valor: ");
			vetor[i] = leia.nextInt();
			
			if(vetor[i]%2 == 0) {
				somaPar += vetor[i];
			} else {
				nImpar++;
			}
		}
		
		System.out.println("\nOs números pares são: ");
		for(int i=0; i<6; i++) {
			if(vetor[i]%2 == 0) {
				System.out.println(vetor[i]+ ", ");
				
			}
		}
		
		System.out.println("\nA soma dos números pares é: "+somaPar);
		
		System.out.println("\nOs números ímpares são: ");
		for(int i=0; i<6; i++) {
			if(vetor[i]%2 != 0) {
				System.out.println(vetor[i]+ ", ");
				
			}
		}
		
		
		
		System.out.println("\nA quantidade de números ímpares digitados foi de: " +nImpar);
	}

}
