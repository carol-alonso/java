package T44;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo ? a soma do custo de f?brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f?brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f?brica de um carro e escreva o custo ao
consumidor.*/

public class Exercicio8 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		double custoFab, custoConsu;
		
		System.out.println("Qual o custo de f?brica?");
		custoFab = leia.nextDouble();
		
		custoConsu = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo de consumidor ? de: R$"+custoConsu);
		
		
		
	}

}
