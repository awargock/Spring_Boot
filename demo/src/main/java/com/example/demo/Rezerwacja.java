package com.example.demo;

public class Rezerwacja {

	private int numer;
	private String termin;
	
	public Rezerwacja() {
	}
	
	public Rezerwacja(int numer, String termin) {
		this.numer = numer;
		this.termin = termin;
	}
	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
	public String getTermin() {
		return termin;
	}
	public void setTermin(String termin) {
		this.termin = termin;
	}
	
}
