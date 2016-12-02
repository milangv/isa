package model;

public class Jelo {
	
	private String naziv;
	private String opis;
	private Double cena;
	
	
	public Jelo(String naziv) {
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
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	
	

}
