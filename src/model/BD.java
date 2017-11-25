package model;

import java.util.ArrayList;
import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	
	//Atributos
	private ArrayList<Medalha> medalhas; 
	private ArrayList<Esporte> esportes;
	private String fileName = "esportes.txt";
	private String fileName2 = "medalhas.txt";
	private DocumentReader dr;
	private DocumentWriter dw;
	
	//Metodo construtor
	public BD(){
		
		//Instanciar os ArrayList
		this.medalhas = new ArrayList<Medalha>();
		this.esportes = new ArrayList<Esporte>();
		
		//Instanciar o Docoment Reader
		this.dr = new DocumentReader();
		//Instanciar o DocumentWrite
		this.dw = new DocumentWriter();
	}
	
	//Ler linhas do arquivo Medalhas
	public void carregarMedalhas(){
		
		ArrayList<String> linhas = this.dr.read(this.fileName);
		
		//Percorrer arraylist
		for (int i = 0; i < medalhas.size(); i++) {
			
			// Separa a linha em um array de String
			String[] linhaMedalha = linhas.get(i).split(";");
			// Cria a medalha com os dados da linha
			Medalha m = new Medalha(linhaMedalha[0], Integer.parseInt(linhaMedalha[1]), Integer.parseInt(linhaMedalha[2]), 
					Integer.parseInt(linhaMedalha[3]), Integer.parseInt(linhaMedalha[4]));
			//Coloca a medalha no Arraylist
			this.medalhas.add(m);
			
		}
	}
	//Ler linhas do arquivo Esporte
	public void carregarEsportes(){
		
		ArrayList<String> linhas = this.dr.read(this.fileName2);
		
		//Percorrer arraylist
		for (int i = 0; i < esportes.size(); i++) {
			
			// Separa a linha em um array de String
			String[] linhaEsporte = linhas.get(i).split(";");
			// Cria o esporte com os dados da linha
			Esporte e = new Esporte(linhaEsporte[0], linhaEsporte[1]);
			//Coloca o esporte no Arraylist
			this.esportes.add(e);
	
		}
	}
	
	//Metodo que grava medalha 
	public void gravarMedalha(Medalha m){
		
		//Colocar a medalha no arraylist
		this.medalhas.add(m);
		//Gravar a medalha no arquivo
		this.dw.write(this.fileName, m.toLinha());
	}
	//Metodo que grava esporte 
	public void gravarEsporte(Esporte e){
		
		//Colocar a medalha no arraylist
		this.esportes.add(e);
		//Gravar a medalha no arquivo
		this.dw.write(this.fileName, e.toLinha());
	}
	
	//Metodo que retorna modalidades de um determinado esporte
	public ArrayList<String> modalidadePorEsporte(String esportes){
		
		
		ArrayList<String> resultado = new ArrayList<String>();
		
		for (int i = 0; i < this.esportes.size(); i++) {
			if (this.esportes.get(i).getModalidade().equals(esportes)) {
				
			}
			

				
				resultado.add(this.esportes.get(i).getModalidade());
			
		}
		return resultado;
	}
	
	public ArrayList<Medalha> getMedalha(){
		return medalhas;
	}
	
	public ArrayList<Esporte> geEsportes(){
		return esportes;
	}
}
