package main;

import control.ControlePrincipal;
import model.BD;

public class Principal {


	public static void main(String[] args) {
		
		BD bd = new BD();
		
		bd.carregarEsportes();
		

		
		ControlePrincipal cp = new ControlePrincipal();

	}

}
