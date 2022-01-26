/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: R=(A+B)²	S=(B+C)²	D=(R+S/2 	D=((A+B)² + (B+C)²) / 2 */


package T44;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		A = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		B = leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		C = leia.nextDouble();
		
		R = Math.pow((A+B), 2); // (A+B) = A-valor, 2 = B-potencia
		S = Math.pow((B+C), 2);
		D = (R+S) / 2;
		
		System.out.println("O valor de D é: "+D);
	}

}
