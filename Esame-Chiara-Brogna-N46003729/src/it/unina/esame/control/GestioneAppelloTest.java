package it.unina.esame.control;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import it.unina.esame.entity.Appello;
import it.unina.esame.entity.Corso;
import it.unina.esame.entity.Data;
import it.unina.esame.entity.Docente;
import it.unina.esame.entity.Sede;
import it.unina.esame.entity.Studente;
import it.unina.esame.entity.Tipologia;

public class GestioneAppelloTest {

 @Test
 public void test01UnoStudenteAUnAppello() throws Exception {
  GestioneAppello gestione = new GestioneAppello();
  
  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
 gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
  
  gestione.prenotaStudente(s, a);
  
  gestione.stampaStudentiPrenotati(a);
 }
 @Test
 public void test02NessunoStudentePrenotato() throws Exception {
  GestioneAppello gestione = new GestioneAppello();

  
  Docente doc = new Docente("Docente");
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
  gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
  
  
  gestione.stampaStudentiPrenotati(a);
 }
 
 @Test
 public void test03DueStudentiPrenotatiAUnAppello() throws Exception{
  GestioneAppello gestione = new GestioneAppello();
 
  Docente doc = new Docente("Primo");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
	Studente s0 = new Studente("Chiara", "Brogna", "N39", 25);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
  gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c =gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
  
  gestione.prenotaStudente(s, a);
  gestione.prenotaStudente(s0, a);
  
  gestione.stampaStudentiPrenotati(a);
 }
 @Test
 public void test04AppelloChiuso() throws Exception {
 GestioneAppello gestione = new GestioneAppello();

  
  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
  gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
  gestione.AppelloChiuso(a);
  
  gestione.prenotaStudente(s, a);
  gestione.stampaStudentiPrenotati(a);
 }
 @Test
 public void test05StudentePrenotatoDueVolteAdUnAppello() throws Exception {
 GestioneAppello gestione = new GestioneAppello();

  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
  gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
  
  gestione.prenotaStudente(s, a);
  gestione.prenotaStudente(s, a);
  gestione.stampaStudentiPrenotati(a);
 }

 
 @Test
 public void test06DueAppelliPerUnCorsoConUnPrenotato() throws Exception {
 GestioneAppello gestione = new GestioneAppello();
 
  
  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  
  gestione.nuovaData(primaData); //aggiungo data in array date
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello A0 = gestione.creaAppello(gestione.elencoDate(), false, c);
  Appello A1= gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(A0);
  c.addAppello(A1);
  
  gestione.prenotaStudente(s,A0);
  gestione.prenotaStudente(s,A1);
  gestione.stampaStudentiPrenotati(A0);
  gestione.stampaStudentiPrenotati(A1);
 }
 @Test
 public void test07SenzaData() throws Exception {
 GestioneAppello gestione = new GestioneAppello();
  
  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  
  
  Corso c = gestione.creaCorso("corso1", doc, 3);
  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
 
  
  gestione.prenotaStudente(s, a);
  gestione.stampaStudentiPrenotati(a);


}
 @Test
 public void test08PiuDatePerUnAppello() throws Exception {
 GestioneAppello gestione = new GestioneAppello();
  
  Docente doc = new Docente("Docente");
  Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
  Data primaData = new Data(LocalDate.of(2017, 11, 18), Tipologia.Scritta, Sede.Aula);
  Data secondaData= new Data(LocalDate.of(2017,12,18),Tipologia.Al_Calcolatore, Sede.Laboratorio);
  
  
  gestione.nuovaData(primaData);
  gestione.nuovaData(secondaData);
  
  Corso c = gestione.creaCorso("corso1", doc, 3);

  

  
  Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
  

  c.addAppello(a);
 
 
  
  gestione.prenotaStudente(s, a);
  gestione.stampaStudentiPrenotati(a);

}
 @Test
 public void test09UnoStudentePrenotatoAppelloApertoUnoStudentePrenotatoAppelloChiuso() throws Exception{
   GestioneAppello gestione = new GestioneAppello();


   Docente doc = new Docente("Docente");
	Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
	Studente s0 = new Studente("Chiara", "Brogna", "N39", 25);
	Data primaData= new Data(LocalDate.of(2016, 1, 1), Tipologia.Scritta, Sede.Aula);
   gestione.nuovaData(primaData);
   
   Corso c = gestione.creaCorso("corso1", doc, 3);
   
   Appello a = gestione.creaAppello(gestione.elencoDate(), false, c);
   
   c.addAppello(a);
   
   gestione.prenotaStudente(s, a);
   gestione.AppelloChiuso(a);
   gestione.prenotaStudente(s0, a);
   
   gestione.stampaStudentiPrenotati(a);

 }
 
@Test
 
 public void test10UnoStudentePrenotaDueAppelliPerDueCorsi () throws Exception {
   
   GestioneAppello gestione = new GestioneAppello();

 Docente doc = new Docente("Docente");
 Studente s = new Studente("Paolo", "Di Paolo", "N36", 23);
Data primaData= new Data(LocalDate.of(2016, 1, 1), Tipologia.Scritta, Sede.Aula);
 
 gestione.nuovaData(primaData);
 
 Corso c = gestione.creaCorso("corso1", doc, 6);
 Corso c0= gestione.creaCorso("corso2", doc, 3);
 
 Appello A0 = gestione.creaAppello(gestione.elencoDate(), false, c);
 Appello A1 = gestione.creaAppello(gestione.elencoDate(), false, c0);
 c.addAppello(A0);
 c0.addAppello(A1);
 
 gestione.prenotaStudente(s,A0);
 gestione.prenotaStudente(s,A1);
 
 gestione.stampaStudentiPrenotati(A0);
 gestione.stampaStudentiPrenotati(A1);
 

}
}
 


