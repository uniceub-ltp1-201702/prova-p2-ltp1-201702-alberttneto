package model;

public class Esporte {
	
	//Atributos
	private String Esporte;
	private String modalidade;
	
	//Metodo get e set
	public String getEsporte() {
		return Esporte;
	}
	public void setEsporte(String esporte) {
		Esporte = esporte;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	//Metodo construtor
	public Esporte(String esporte, String modalidade) {
		super();
		Esporte = esporte;
		this.modalidade = modalidade;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Esporte [Esporte=" + Esporte + ", modalidade=" + modalidade + "]";
	}
	
	//Transforma esporte em linha
	public String toLinha(){
		return getEsporte() + ";" + getModalidade();
	}
	
	
	

	
}
