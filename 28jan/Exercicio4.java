package T44_3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		/*Fa�a um programa que leia duas matrizes 2 x 2 com valores reais.
		 *Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada.
Na terceira op��o o valor da constante deve ser lido e o resultado
da adi��o da constante deve ser armazenado na pr�pria matriz.
*/

		int [][]matriz1 = new int[2][2];
		int [][]matriz2 = new int[2][2];
		int [][]mSoma = new int[2][2];
		int [][]mSub = new int[2][2];
		int opc = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Informe um n�mero para a primeira matriz: ");
				matriz1[i][j] = leia.nextInt();
				System.out.println("Informe um n�mero para a segunda matriz: ");
				matriz2[i][j] = leia.nextInt();
			}
		}
		
		System.out.println("\t\tSelecione uma op��o");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		opc = leia.nextInt();
		
		switch(opc) {
		case 1:
			
			System.out.println("A soma das matrizes �: ");
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					mSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.println("["+(mSoma[i][j])+"] ");
				}
				System.out.println("\n");
			}
			break;
			
		case 2: 
			System.out.println("A diferen�a das matrizes �: ");
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					mSoma[i][j] = matriz1[i][j] - matriz2[i][j];
				}
			}
			
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.println("["+(mSub[i][j])+"] ");
				}
				System.out.println("\n");
			}
			break;
			
		case 3:
			
			System.out.println("Informe um valor de constante para a primeira matriz: ");
			final int num1 = leia.nextInt();
			System.out.println("Informe um valor de constante para a segunda matriz: ");
			final int num2 = leia.nextInt();
			
			matriz1[0][0] = num1;
			matriz1[0][0] = num2;
			
			break;
			
		case 4:
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.println("["+matriz1[i][j]+"]");
				}
				System.out.println("\n");
			}
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.println("["+matriz2[i][j]+"]");
				}
				System.out.println("\n");
		}
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
	}
}
