/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


package T44;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int totalseg, seg, min, hora;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento?");
		totalseg = leia.nextInt();
		
		hora = totalseg / 3600;
		min = (totalseg % 3600) / 60;
		seg = (totalseg % 3600) % 60;
		
		System.out.println("O evento durou " + hora + " horas, " + min + " minutos e " + seg + " segundos.");
		
	}
}
