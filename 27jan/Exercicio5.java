package T44_2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Faça um programa que mostre um Menu com opções de um cardápio de restaurante
		 *para uma pessoa. A pessoa vai escolher o prato desejado: 

Após escolher o prato, o programa deverá fazer uma pergunta ao usuário,
se ele aceita pagar a gorjeta do garçom 10% sobre o valor do prato. Se o usuário aceitar,
mostrar o valor final (valor do prato + 10%), caso contrário, mostrar o valor final
(somente o valor do prato).
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		Pão com ovo 		5,00 

(usar o laço condicional switch...case).
*/
		
		Scanner leia = new Scanner(System.in);
		
		double gorjeta;
		int prato;
		
		System.out.println("Códido\tPrato\t\tValor\n");
		System.out.println("1\tPicanha\t\t25,00\n");
		System.out.println("2\tLasanha\t\t20,00\n");
		System.out.println("3\tStrogonoff\t18,00\n");
		System.out.println("4\tBife Acebolado\t15,00\n");
		System.out.println("5\tPão com Ovo\t5,00\n");
		
		System.out.println("Informe o prato desejado:");
		prato = leia.nextInt();
		
		switch(prato) {
		case 1:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-Não");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(25*1.1));
			}
			break;
			
		case 2:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-Não");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(20*1.1));
			}
			break;
			
			
		case 3:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-Não");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(18*1.1));
			}
			break;
			
		case 4:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-Não");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(15*1.1));
			}
			break;
			
		case 5:
			System.out.println("Deseja pagar gorjeta?\n1-Sim\t2-Não");
			gorjeta = leia.nextDouble();
			if(gorjeta == 1) {
				System.out.println("O valor total da compra foi de: R$"+(25*1.1));
			}
			break;
			
			default:
		}
		

	}

}
