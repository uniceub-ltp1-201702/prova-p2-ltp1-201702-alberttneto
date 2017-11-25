package model;

public class Medalha {
	
	//Atributos
	private String pais;
	private int mO;
	private int mP;
	private int mB;
	private int posR;
	
	//Metodo get e set
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getmO() {
		return mO;
	}
	public void setmO(int mO) {
		this.mO = mO;
	}
	public int getmP() {
		return mP;
	}
	public void setmP(int mP) {
		this.mP = mP;
	}
	public int getmB() {
		return mB;
	}
	public void setmB(int mB) {
		this.mB = mB;
	}
	public int getPosR() {
		return posR;
	}
	public void setPosR(int posR) {
		this.posR = posR;
	}
	
	//Metodo construtor
	public Medalha(String pais, int mO, int mP, int mB, int posR) {
		super();
		this.pais = pais;
		this.mO = mO;
		this.mP = mP;
		this.mB = mB;
		this.posR = posR;
	}
	
	//Metodo to int
	@Override
	public String toString() {
		return "Medalha [pais=" + pais + ", mO=" + mO + ", mP=" + mP + ", mB=" + mB + ", posR=" + posR + "]";
	}
	//Transformar medalhas em linha
	public String toLinha(){
		return getPais() + ";" + getmO() + ";" + getmP() + ";" + getmB() + ";" + getPosR();
	}
	
	
	
	
	

}
