package it.unina.esame;


import java.time.LocalDate;
import java.util.ArrayList;
import it.unina.esame.control.*;
import it.unina.esame.entity.*;

public class Main {

	public static void main(String[] args) {
		GestioneAppello gestione= new GestioneAppello();
		ArrayList<Data> dateAppelli = new ArrayList<>();
		
		Docente doc = new Docente("Docente");
		Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
		Studente s0 = new Studente("Chiara", "Brogna", "N39", 25);
		Data primaData= new Data(LocalDate.of(2016, 1, 1), Tipologia.Scritta, Sede.Aula);
		
		dateAppelli.add(primaData); //aggiungo data in array date
		
		Corso c = gestione.creaCorso("corso1", doc, 3);
		

		
		Appello a = gestione.creaAppello(dateAppelli, false, c);
		
		System.out.println(a);
		

		c.addAppello(a);
		
		gestione.prenotaStudente(s, a);
		gestione.prenotaStudente(s0, a);
		
		
		gestione.stampaStudentiPrenotati(a);
	}

} 
