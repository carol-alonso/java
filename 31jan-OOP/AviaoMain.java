package T44_4;

public class AviaoMain {

	public static void main(String[] args) {
		
		AviaoClass aviao = new AviaoClass(500, "Henrico", "Ant�nia", "Europa");
		
		System.out.println("O avi�o cont�m " +aviao.getAssentos() + " assentos." + "\nO piloto"
				+ " da atual viagem se chama " + aviao.getPiloto() + " e o co-piloto, " 
				+ aviao.getCopiloto()+ "." + "\nNesse momento, estamos indo em dire��o � "
				+ aviao.getViagem() + ".");

	}

}
