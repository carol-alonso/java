package T44_2;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de op��es carinhosas");
		System.out.println("\n1-N�o desistta dos seus sonhos...");
		System.out.println("\n2-Voc� � capaz...");
		System.out.println("\n3-Seja perseverante...");
		System.out.println("\n4-Seus sonhos s�o possiveis...");
		System.out.println("\n5-Persista, Resista e n�o desista...");
		System.out.println("\nDigite sua op��o: ");
		op = leia.nextInt();
		
		switch(op){
			
		
		case 1:
			System.out.println("\n1-N�o desista dos seus sonhos...");
			break;
		case 2:
			System.out.println("\n2-Voc� � capaz...");
			break;
		case 3:	
			System.out.println("\n3-Seja perseverante...");
			break;
		case 4:	
			System.out.println("\n4-Seus sonhos s�o possiveis...");
			break;
		case 5:	
			System.out.println("\n5-Persista, Resista e n�o desista...");
			break;
			
		default:
			System.out.println("Op��o invalida.");
			
				
				
		}
	}
}