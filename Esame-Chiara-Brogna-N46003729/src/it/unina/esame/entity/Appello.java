package it.unina.esame.entity;
import java.util.*;

public class Appello {
	ArrayList<Data> appelli;
	boolean Concluso;
	ArrayList<Studente> studentiPrenotati;

	public Appello() {
		appelli= new ArrayList<Data>();
		Concluso=false;
		studentiPrenotati= new ArrayList<Studente>();
	}
	
	public Appello(ArrayList<Data> date, boolean concluso) {
		appelli=date;
		Concluso= concluso;
		studentiPrenotati=new ArrayList<Studente>();
	}
	
	public void aggiungiStudente(Studente s) {
		 studentiPrenotati.add(s);
	}
	public ArrayList<Studente> getStudente(){
		return studentiPrenotati;		
	}
	public ArrayList<Data> getAppelli(){
		return appelli;
	}
	public void setAppello(ArrayList<Data> _appelli) {
		appelli=_appelli;
	}
	public boolean getConcluso() {
		return Concluso;
	}
	public void setConcluso(boolean _concluso) {
		Concluso = _concluso;
	}

	public void addData(Data _data) {
		appelli.add(_data);
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		if(Concluso==true) {
			buff.append("Stato appello: CHIUSO");
		} else {
			buff.append("Stato appello: APERTO");
		}
		return buff.toString();
	}
}
