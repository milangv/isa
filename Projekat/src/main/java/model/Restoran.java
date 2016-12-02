package model;

import java.util.ArrayList;

public class Restoran {
	
	public String naziv;
	public String opis;
	public ArrayList<Jelo> jelovnik = new ArrayList<>();
	public ArrayList<Pice> kartaPica = new ArrayList<>();
	
	public Restoran(String naziv) {
		super();
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public ArrayList<Jelo> getJelovnik() {
		return jelovnik;
	}

	public void setJelovnik(ArrayList<Jelo> jelovnik) {
		this.jelovnik = jelovnik;
	}

	public ArrayList<Pice> getKartaPica() {
		return kartaPica;
	}

	public void setKartaPica(ArrayList<Pice> kartaPica) {
		this.kartaPica = kartaPica;
	}
	
	

}
