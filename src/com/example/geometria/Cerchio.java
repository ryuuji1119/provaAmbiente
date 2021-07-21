package com.example.geometria;

public class Cerchio extends FormaGeometrica{
	private double raggio;
	
	//metodo costruttore (inizializzo raggio)
	public Cerchio(double raggio) {
		super(raggio,raggio);
	this.raggio=raggio;
	}
	
//metodo per calcolare l' Area, restituisco il risultato 
	@Override
	public double area() {
		double area= raggio*raggio*Math.PI;
		return area;
	}

//metodo per calcolare il perimetro, restituisco il risultato 
	@Override
	public double perimetro() {
		double perimetro=2*Math.PI*raggio;
		return perimetro;
	}


	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", area()=" + area() + ", perimetro()=" + perimetro() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
