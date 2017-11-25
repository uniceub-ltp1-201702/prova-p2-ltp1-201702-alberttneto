package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ViewExibeModalidades {

	//Metodo construtor
	public ViewExibeModalidades(ArrayList<String>esporte){
		
		//Verificar se o esporte existe
		if (esporte == null) {
			JOptionPane.showMessageDialog(null, "Esporte não existe!! Tente outro.");
		}else{
			//Exibir modalidades
			JOptionPane.showConfirmDialog(null, esporte);
		}
	}
}
