package control;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlePrincipal {
	
	//Atributos
	private BD bd;
	private ViewPrincipal vp;
	private ControlePesquisaModalidades cpm;
	
	
	//Metodo construtor
	public ControlePrincipal(){
		//Instanciar o objeto BDSimulado
		this.bd = new BD();
		
		//Instanciar a viewPrincipal
		this.vp = new ViewPrincipal();
		
		//Criar controles
		this.cpm = new ControlePesquisaModalidades(this.bd);
		
		//Exibir a janela de opções pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}
	

	//Metodo para tratar a opção do usuario
	public void tratarOpcao(String opcao){
		while (true) {
			switch (opcao) {
			case "1": this.cpm.pesquisaModalidade();
					break;
					
			case "4": JOptionPane.showMessageDialog(null, "Até breve!! ");
					return;
					
					
			default: JOptionPane.showMessageDialog(null, "Favor digitar um valor valido.");
				break;
			}
			
			//Exibir a janela de opções novamente
			opcao = this.vp.getOpcao();
			
		}	
	}	
}
