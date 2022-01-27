package T44_2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0, somaTudo = 0, div = -1;
		
		do {
			System.out.println("Informe um número: ");
			num = leia.nextInt();
			
			if(num%3==0) {
				somaTudo += num;
				div++;
			}
		} while (num != 0);
		
		System.out.println("A média dos múltiplos de 3 é de: " +(somaTudo/div));
		
	}

}
