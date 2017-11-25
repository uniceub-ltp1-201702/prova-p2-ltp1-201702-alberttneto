package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	//Atributo
	private String opcao; 
	
	//Metodo que vai exibir a lista de opçoes
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma opção:\n" +
						"1 - Pesquisar modalidades de um determinado esporte\n" +
						"2 - \n" +
						"3 - \n" +
						"4 - Sair\n");
	
		return this.opcao;
	}
}
