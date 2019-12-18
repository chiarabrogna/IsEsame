package it.unina.esame.entity;

import java.util.ArrayList;

public class Corso {
	protected String NomeCorso;
	protected Docente NomeDocente;
	protected int CFU;
	protected ArrayList<Appello> appelli;

public Corso() { //COSTRUTTORE SENZA PARAMETRI
	this.NomeCorso="";
	this.NomeDocente= new Docente();
	this.CFU=0;
	ArrayList<Appello> appelli= new ArrayList<Appello>();
	
}

public Corso(String Corso,Docente _Docente,int _CFU) {//COSTRUTTORE CON PARAMETRI 
	this.NomeCorso= new String(Corso);
	NomeDocente=_Docente;
	CFU=_CFU;
	this.appelli = new ArrayList<Appello>();
}

public String getNomeCorso() {
	return NomeCorso;
}

public void setNomeCorso(String Corso) {
	NomeCorso=Corso;
}

public Docente getDocente() {
	return NomeDocente;
	
}

public void setDocente(Docente _Docente) {
	NomeDocente=_Docente;
}

public int getCFU() {
	return CFU;
	
}
public String toString() {
	 return"nome: "+"cognome: "+"corso: "+"CFU: ";

}
public void addAppello(Appello appello) {
	appelli.add(appello);
}

}