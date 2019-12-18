package it.unina.esame.control;
import java.util.ArrayList;
import it.unina.esame.entity.*;


public class GestioneAppello {
	ArrayList<Corso> elencoCorsi;
	ArrayList<Data> listaDate;
	
	//costruttore
	public GestioneAppello() {	
	elencoCorsi=new ArrayList<>();
	listaDate=new ArrayList<>();
		
	}
	
	// creo il corso
	public Corso creaCorso(String _corso, Docente _docente, int _cfu) {
		Corso nuovoCorso=new Corso(_corso, _docente,_cfu);
		return nuovoCorso;
			}
	
	// creo l'appello
	public Appello creaAppello(ArrayList<Data> date, boolean concluso, Corso corso) {
		Appello nuovoAppello= new Appello(date, concluso);
		if(elencoCorsi.contains(corso)) {
			corso.addAppello(nuovoAppello);
		}else {
			elencoCorsi.add(corso);
			corso.addAppello(nuovoAppello);
		}		
		corso.addAppello(nuovoAppello);
		return nuovoAppello;
		}
	
	//si aggiunge una data in appello
	public void nuovaData(Data data) {
		this.listaDate.add(data);
	}
	
	//il ritorno è un'array con le date inizializzate prima 
	public  ArrayList<Data> elencoDate(){
		return this.listaDate;
	}
	//prenotazione di uno studente ad un appello
	public void prenotaStudente(Studente s, Appello a) {
		if(listaDate.isEmpty()) {
			System.out.println("Non c'è una data per l'appello");
		}
	else if(a.getConcluso()==true) {
			System.out.println("L'appello è concluso");
		}else if(!a.getStudente().contains(s)) {
		a.aggiungiStudente(s);
	}else {
		System.out.println("Studente già prenotato al appello");
	}
		
	}
	
	//stampa degli studenti prenotati
	public void stampaStudentiPrenotati(Appello a) {
		ArrayList<Studente> studenti= new ArrayList<>(a.getStudente());
		if(studenti.isEmpty()) {
			System.out.println("Nessuno studente prenotato");
		}
		for(int i=0;i<studenti.size();i++) {
			System.out.println(studenti.get(i));
		}
	}
	
	//chiude l'appello 
	public void AppelloChiuso(Appello a) {
		a.setConcluso(true);
	}
}
