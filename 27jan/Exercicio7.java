package T44_2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		/* 7- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */
	
		
		Scanner leia = new Scanner(System.in);
		
		int num, contImpar=0, contPar=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe um n�mero: ");
			num = leia.nextInt();
			
			if(num%2 != 0) {
				contImpar++;
			} else {
				contPar++;
			}
			
		}
		
		System.out.println(contImpar+" n�meros s�o impares e " +contPar+ " s�o pares");
	}

}
