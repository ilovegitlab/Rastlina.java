/*
	Ime datoteke: 	Rastlina_metode.java
	Avtor:		Adriana Felicijan
	Vhodni podatki: /
	
*/
//deklariramo javni razred

import java.util.Scanner;
import java.util.ArrayList;


public class Rastlina {
	
	//deklariramo lastnosti razreda
	public boolean jeNaSoncu;
	private String vrstaRastline;
	protected boolean jeZalita;
	protected boolean aliCveti;

	// Javni konstruktor
	// Vhodni parametri: /
	// Potek/opis: ustvari nov objekt tipa Rastlina
	// Vrne vrednost: nov objekt
	public Rastlina(){

	}
	// Javni konstruktor
	// Vhodni parametri: vrsta rastline - v
	// Potek/opis: ustvari nov objekt tipa Rastlina
	// Vrne vrednost: nov objekt
	public Rastlina(String v){
		vrstaRastline = v;
	}

	//javna statična metoda, ki se izvede ob zagonu programa
	public static void main(String[] args) {
		
		System.out.println("Rastlina je tu.");
	}

	//Javna metoda za zalivanje rastline
	//Vhodni parametri: /
	//Potek/opis: spremeni vrednost jeZalita na true
	//Vrne vrednost: true - zalivanje uspešno, false - zalivanje ni uspešno
	public boolean zalij() {
		
		System.out.println("Zalijmo rastlino...");
		//Če je že zalita
		if(!jeZalita) {
			//Vrnemo false
			return false;
		}
		else {
			//zalijemo rastlino
			jeZalita = true;
			//vrnemo true
			return true;
			
		}
	}
	
	//Javna metoda za postavljanje rastline na sonce
	//Vhodni parametri: /
	//Potek/opis: spremeni vrednost jeNaSoncu na true
	//Vrne vrednost: true - postavljanje uspešno, false - postavljanje ni uspešno
	public boolean dajnaSonce() {
		
		System.out.println("Postavimo rastlino na sonce :)");
		//Če je že na soncu
		if(!jeNaSoncu) {
			//Vrnemo false
			return false;
		}
		else {
			//jo damo na sonce
			jeNaSoncu = true;
			//vrnemo true
			return true;
			
		}
	}
	//Javna metoda za cvetenje rastline
	//Vhodni parametri: /
	//Potek/opis: spremeni vrednost aliCveti na true
	//Vrne vrednost: true - cvetenje uspešno, false - cvetenje ni uspešno
	public boolean cveti() {
		
		System.out.println("Rastlina cveti :3");
		//Če že cveti
		if(!aliCveti) {
			//Vrnemo false
			return false;
		}
		else {
			//rastline cveti
			aliCveti = false;
			//vrnemo true
			return true;
			
		}
	}

	}

