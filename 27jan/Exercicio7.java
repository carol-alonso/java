package T44_2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		/* 7- Ler 10 números e imprimir quantos são pares e quantos são ímpares. */
	
		
		Scanner leia = new Scanner(System.in);
		
		int num, contImpar=0, contPar=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe um número: ");
			num = leia.nextInt();
			
			if(num%2 != 0) {
				contImpar++;
			} else {
				contPar++;
			}
			
		}
		
		System.out.println(contImpar+" números são impares e " +contPar+ " são pares");
	}

}
