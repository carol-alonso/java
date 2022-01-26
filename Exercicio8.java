package T44;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

public class Exercicio8 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		double custoFab, custoConsu;
		
		System.out.println("Qual o custo de fábrica?");
		custoFab = leia.nextDouble();
		
		custoConsu = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo de consumidor é de: R$"+custoConsu);
		
		
		
	}

}
