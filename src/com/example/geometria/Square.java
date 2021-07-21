package com.example.geometria;

public class Square extends FormaGeometrica{
	private double lato;
	
	//metodo costruttore del quadrato (inizializzo lato)
	public Square(double lato) {
		super(lato,lato);	
		this.lato= lato;}

//metodo per calcolare l' Area, restituisco il risultato 
	@Override
	public double area() {
		double risultato = (Math.pow(this.lato,3));
		return risultato;
	};

//metodo per calcolare il perimetro, restituisco il risultato 
	@Override
	public double perimetro() {
		double perimetro=4*lato;
		return perimetro;}
	

	public double getFaccia() {
		return lato;
	}

	public void setFaccia(double faccia) {
		this.lato = faccia;
	}

	@Override
	public String toString() {
		return "Square [faccia=" + lato + ", getFaccia()=" + getFaccia() + ", area()=" + area() + ", perimetro()="
				+ perimetro() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}