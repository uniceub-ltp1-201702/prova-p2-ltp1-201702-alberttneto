package view;

import javax.swing.JOptionPane;

public class ViewSolicitaEsporte {
	
	//Atributos
	private String esporte;

	//Metodo construtor
	//Caixa que recebe esporte
	public ViewSolicitaEsporte(){
		this.esporte =
				JOptionPane.showInputDialog("Digite o esporte: ");
	}
	
	//Metodo get
	public String getEsporte(){
		return esporte;
	}
}
