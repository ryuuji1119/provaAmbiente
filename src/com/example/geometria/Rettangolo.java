package com.example.geometria;

public class Rettangolo extends FormaGeometrica{
//variabili globali private
	private int base;
	private int altezza;
//metodo costruttore del rettangolo (inizializzo base e altezza)
	public Rettangolo (int base, int altezza){
		super(base,altezza);
		this.base=base;
		this.altezza=altezza;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", getBase()=" + getBase() + ", getAltezza()="
				+ getAltezza() + ", area()=" + area() + ", perimetro()=" + perimetro() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
//metodo per calcolare Area, restituisco il risultato 
	@Override
 public double area() {
		double area = base * altezza;
		return area;
	}
//metodo per calcolare il perimetro, restituisco il risultato 

	@Override
	public double perimetro() {
		double perimetro= base * 2 + altezza *2;
		return perimetro;
	}

}
