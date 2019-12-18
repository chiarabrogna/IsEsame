package it.unina.esame.entity;

public class Docente {
	protected String NomeDocente;
	
	public Docente() {
		this.NomeDocente="";
	}
	public Docente(String Docente) {
		this.NomeDocente= new String(Docente);
	}
	public String getNomeDocente() {
		return NomeDocente;
	}
	public void setNomeDocente(String Docente) {
		NomeDocente=Docente;
	}
	
}
