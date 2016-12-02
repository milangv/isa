package model;

import java.util.Date;

public class Radnik {

	public String ime;
	public String prezime;
	public Date datum;
	public double velicinaObuce;
	
	public Radnik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public double getVelicinaObuce() {
		return velicinaObuce;
	}

	public void setVelicinaObuce(double velicinaObuce) {
		this.velicinaObuce = velicinaObuce;
	}
	
	
	
}
