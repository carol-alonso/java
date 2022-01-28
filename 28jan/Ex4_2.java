package T44_3;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float [][] m1 = new float [2][2];
		float [][] m2 = new float [2][2];
		float [][] m3 = new float [2][2];
		int l, c, opc, constante;
		
		for(l=0; l<2; l++) {
			for(c=0; c<2; c++)
			{
				System.out.println("\nInforme um número para a primeira matriz: ");
				m1[l][c] = leia.nextFloat();
				System.out.println("\nInforme um número para a segunda matriz: ");
				m2[l][c] = leia.nextFloat();
			}
		}
		do
		{
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as duas matrizes:");
			System.out.println("\n2- Subtrair a primeira matriz da segunda:");
			System.out.println("\n3- Adicionar uma constante as duas matrizes:");
			System.out.println("\n4- Imprimir as duas matrizes");
			System.out.println("\n0- Finalizar programação");
			System.out.println("\nDigite sua opção: ");
			opc = leia.nextInt();
			
			switch(opc) {
			
			case 1: 
				for(l=0; l<2; l++) {
					for(c=0; c<2; c++) {
						m3[l][c] = m1[l][c] + m2[l][c];
						System.out.println("\nSoma: "+m3[l][c]);
					}
				}
				break;
				
			case 2:
				for(l=0; l<2; l++) {
					for(c=0; c<2; c++) {
						m3[l][c] = m1[l][c] - m2[l][c];
						System.out.println("\nDiferença: "+m3[l][c]);
					}
				}
				break;
				
			case 3: 
				System.out.println("\nEntre com o valor da constante: ");
				constante = leia.nextInt();
				for(l=0; l<2; l++) {
					for(c=0; c<2; c++) {
						m1[l][c] += constante;
						m2[l][c] += constante;
						System.out.println("\nM1 mais a constante: "+m1[l][c]);
						System.out.println("\nM2 mais a constante: "+m2[l][c]);
					}
				}
				break;
				
			case 4:
				for(l=0; l<2; l++) {
					for(c=0; c<2; c++) {
						System.out.println("\nMatriz1: "+m1[l][c]);
						System.out.println("\nMatriz2: "+m2[l][c]);
					}
				}
				break;
				default:
					if(opc!=0) {
						System.out.println("\nOpção inválida...");
					}
					else {
						System.out.println("\nMuito obrigada por utilizar o programa!");
					}
				
				
			}
			
		}
		
		while(opc!=0);
	
}
}
