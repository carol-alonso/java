/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/


package T44;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int totalDia,dia,mes,ano;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Há quantos dias você nasceu?");
		totalDia = leia.nextInt();
		
		ano = totalDia / 365;
		mes = (totalDia % 365) / 30;
		dia = (totalDia % 356) % 30;
	
				
		
	}
}
