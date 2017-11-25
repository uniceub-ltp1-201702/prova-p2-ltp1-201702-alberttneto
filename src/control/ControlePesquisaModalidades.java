package control;

import java.util.ArrayList;

import model.BD;
import model.Esporte;
import view.ViewExibeEsportes;
import view.ViewExibeModalidades;
import view.ViewSolicitaEsporte;

public class ControlePesquisaModalidades {

	//Atributos
	private BD bd;
	private ViewExibeEsportes vee;
	
	public ControlePesquisaModalidades(BD bd){
		
		this.bd = bd;
		this.vee = new ViewExibeEsportes();
	}
	
	//Metodo para pesquisar modalidades
	public void pesquisaModalidade(){
		
		
		//Criar a view solicita esporte
		ViewSolicitaEsporte vse = new ViewSolicitaEsporte();

		//Recuperar o esporte digitado
		String esporte = vse.getEsporte();
		
		//Retorna modalidade de acordo com o esporte
		ArrayList<String> mod =  this.bd.modalidadePorEsporte(esporte);
		
		ViewExibeModalidades vem = new ViewExibeModalidades(mod);
		

	}
}

