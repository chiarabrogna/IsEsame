package it.unina.esame.entity;

public class Studente {
	protected String nomeStudente;
	protected String cognomeStudente;
	protected String matricola;
	protected int 	pin;

public  Studente() {
	this.nomeStudente="";
	this.cognomeStudente="";
	this.matricola="N/A";
	this.pin=0;
	
}
public Studente(String 	_nomeStudente, String _cognomeStudente, String _matricola, int _pin) {
	this.nomeStudente=new String(_nomeStudente);
	this.cognomeStudente=new String (_cognomeStudente);
	this.matricola=new String(_matricola);
	pin=_pin;
	
}

public void setNomeStudente(String _nomeStudente) {
	  nomeStudente = _nomeStudente;
	 }
	 
	 
	 public String getNomeStudente(String _nomeStudente) {
	  return nomeStudente;
	 }
	 
	 public void setCognomeStudente(String _cognomeStudente) {
	  cognomeStudente = _cognomeStudente;
	 }
	 
	 
	 public String getCognomeStudente(String _cognomeStudente) {
	  return cognomeStudente;
	 }
	 
	 public void setMatricola(String _matricola) {
	  matricola = _matricola;
	 }
	 
	 
	 public String getMatricola(String _nomeStudente) {
	  return matricola;
	 }
	 
	 public void setPin(int _pin) {
	  pin = _pin;
	 }
	 
	 
	 public String getPin(int _pin) {
	  return matricola;
	 }
	 public String toString() {
		 return"nome: "+ nomeStudente+" " + "cognome: "+ cognomeStudente+" " +"matricola: "+ matricola+" "+ "pin: "+ pin;}
		 
}

