package T44_5;

public class MainAnimal {

	public static void main(String[] args) {
	
		CachorroClass dog = new CachorroClass("Pipoca", 8, true, "andar", "Shitzu");
		
		dog.infoCachorro();
		
		CavaloClass cavalo = new CavaloClass("Pegasuz", 13, true, "trotar", "marrom");
		
		cavalo.infoCavalo();
		
		PreguiçaClass preguiça = new PreguiçaClass("Adelina", 6, true, "subir em árvores", "marrom");
			
		preguiça.infoPreguiça();

	}

}
