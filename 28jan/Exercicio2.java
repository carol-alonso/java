package T44_3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
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
		
		System.out.println("\nOs n�meros pares s�o: ");
		for(int i=0; i<6; i++) {
			if(vetor[i]%2 == 0) {
				System.out.println(vetor[i]+ ", ");
				
			}
		}
		
		System.out.println("\nA soma dos n�meros pares �: "+somaPar);
		
		System.out.println("\nOs n�meros �mpares s�o: ");
		for(int i=0; i<6; i++) {
			if(vetor[i]%2 != 0) {
				System.out.println(vetor[i]+ ", ");
				
			}
		}
		
		
		
		System.out.println("\nA quantidade de n�meros �mpares digitados foi de: " +nImpar);
	}

}
