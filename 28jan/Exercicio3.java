package T44_3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[2][2];
		
		int cont = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Entra o valor [" + i + "] [" + j + "]");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Valor [" + i + "] [" + j + "] é: " + matriz[i][j]);
			}
		}
		
		leia.close();
	}

}
