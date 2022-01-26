/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/

package T44;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int dia,mes,ano,totalDia;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva os anos: ");
        ano = leia.nextInt();
        System.out.println("Escreva os meses: ");
        mes = leia.nextInt();
        System.out.println("Escreva os dias: ");
        dia = leia.nextInt();

        ano = ano * 365; //convertendo os anos em dias
        mes = mes * 30; //convertendo os meses em dias

        totalDia = ano + mes + dia;

        System.out.println("Fazem " + totalDia + " dias que você nasceu!");

    }

}