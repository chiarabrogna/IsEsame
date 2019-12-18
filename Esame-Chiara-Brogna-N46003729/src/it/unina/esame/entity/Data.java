package it.unina.esame.entity;
import java.util.*;
import java.time.LocalDate;

public class Data {
	protected LocalDate data ;
	protected Tipologia tipoProva;
	protected Sede	sede;
public Data(LocalDate _data,Tipologia _tipoProva, Sede _sede) {
	this.data=_data;
	tipoProva=_tipoProva;
	sede=_sede;	
}
public LocalDate getData() {
	return data;
}
public Tipologia getTipologia() {
	return tipoProva;
}
public Sede getSede() {
	return sede;
}
}
