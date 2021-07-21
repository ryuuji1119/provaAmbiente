package com.example.geometria;

public class Ellisse extends FormaGeometrica{
private double a;
private double b;
	public Ellisse(double a, double b) {
	super(a,b);
	this.a=a;
	this.b=b;
	
}
	//metodo per calcolare Area, restituisco il risultato 
	@Override
	public double area() {
		double area=Math.PI*a*b;
		return area;
	}
	//metodo per calcolare il perimetro, restituisco il risultato 
	@Override
	public double perimetro() {
		double perimetro= 2*(Math.PI*Math.sqrt((a*a+b*b)/2));
		return perimetro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append(", area()=");
		builder.append(area());
		builder.append(", perimetro()=");
		builder.append(perimetro());

		builder.append("]");
		return builder.toString();
	}



}
