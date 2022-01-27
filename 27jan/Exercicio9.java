package T44_2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		/* 9 - Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
			 o n�mero de pessoas calmas; (total m, h e o)
			 o n�mero de mulheres nervosas;
			 o n�mero de homens agressivos;
		 	 o n�mero de outros calmos;
			 o n�mero de pessoas nervosas com mais de 40 anos;
			 o n�mero de pessoas calmas com menos de 18 anos.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, opc, totalCalm = 0, mNerv = 0, hAgre = 0, oCalm = 0;
		int nerv40 = 0, nerv18, calm18 = 0, totalP=0;
		
		while(totalP<5) {
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
			System.out.println("Insira seu sexo: \n(1-feminino / 2-masculino / 3-Outros)");
			sexo = leia.nextInt();
			System.out.println("Insira sua op��o: \n(1-calma / 2-nervosa / 3-agressiva)");
			opc = leia.nextInt();
			
			if(opc == 1) {
				totalCalm++;
				if(sexo == 3) {
					oCalm++;
				}
				if (idade < 18) {
					calm18++;
				}
			}
			if(opc ==2) {
				if(sexo ==1) {
					mNerv++;
				}
				if(idade >40) {
					nerv40++;
				}
			}
			if (sexo == 2 && opc == 3) {
				hAgre++;
			}
			totalP++;
		}
		
		System.out.println("O n�mero de pessoas calmas � de: "+totalCalm);
		System.out.println("O n�mero de mulheres nervosas � de: "+mNerv);
		System.out.println("O n�mero de homens agressivos � de: "+hAgre);
		System.out.println("O n�mero de outros calmos � de: "+oCalm);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 � de: "+nerv40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 � de: "+calm18);
	}
}
