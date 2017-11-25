package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Esporte;

public class ViewExibeEsportes {

	
	public void exbirEsportes(ArrayList<Esporte> esportes){
		
		String todosEsportes = " ";
		
		for (int i = 0; i < esportes.size(); i++) {
			todosEsportes = todosEsportes + esportes.get(i).toString() + "\n";
			
		}
		
		JOptionPane.showConfirmDialog(null, todosEsportes);
		
		
	}
}
