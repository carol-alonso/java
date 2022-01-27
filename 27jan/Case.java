package T44_2;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opções carinhosas");
		System.out.println("\n1-Não desistta dos seus sonhos...");
		System.out.println("\n2-Você é capaz...");
		System.out.println("\n3-Seja perseverante...");
		System.out.println("\n4-Seus sonhos são possiveis...");
		System.out.println("\n5-Persista, Resista e não desista...");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		switch(op){
			
		
		case 1:
			System.out.println("\n1-Não desista dos seus sonhos...");
			break;
		case 2:
			System.out.println("\n2-Você é capaz...");
			break;
		case 3:	
			System.out.println("\n3-Seja perseverante...");
			break;
		case 4:	
			System.out.println("\n4-Seus sonhos são possiveis...");
			break;
		case 5:	
			System.out.println("\n5-Persista, Resista e não desista...");
			break;
			
		default:
			System.out.println("Opção invalida.");
			
				
				
		}
	}
}