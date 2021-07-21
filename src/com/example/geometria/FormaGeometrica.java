package com.example.geometria;

abstract class FormaGeometrica {
private double lato;
private double lato2;
	
	public FormaGeometrica(double lato, double lato2) {
		this.lato = lato;
		this.lato2 = lato2;
	}
	
	abstract double area();;
	abstract double perimetro();

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [lato=" + lato + "lato2=" + lato2 +", area()=" + area() + ", perimetro()="
				+ perimetro() + ", getLato()=" + getLato() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}
