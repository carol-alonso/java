package T44_4;

public class AviaoClass {

	private int assentos;
	private String piloto;
	private String copiloto;
	private String viagem;
	
	public AviaoClass(int assentos, String piloto, String copiloto, String viagem) {
		super();
		this.assentos = assentos;
		this.piloto = piloto;
		this.copiloto = copiloto;
		this.viagem = viagem;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(String copiloto) {
		this.copiloto = copiloto;
	}

	public String getViagem() {
		return viagem;
	}

	public void setViagem(String viagem) {
		this.viagem = viagem;
	}
	
	
	
}
