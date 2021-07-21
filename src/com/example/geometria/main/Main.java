package com.example.geometria.main;

import com.example.geometria.*;
public class Main {
	public static void main(String[] args ) {
		//Rettangolo
		System.out.println("\n\t ora il Rettangolo");
		Rettangolo r = new Rettangolo(15,20);
		r.area();
		r.perimetro();
		System.out.println(r.toString());

		
		//Cerchio
		System.out.println("\n\t ora il cerchio");
		Cerchio c = new Cerchio(10);
		c.area();
		c.perimetro();
		System.out.println(c.toString());

		
		//Quadrato
		System.out.println("\n\t ora il quadrato");
		Square s = new Square(10);
		s.area();
		s.perimetro();
		System.out.println(s.toString());

		//Ellisse
		System.out.println("\n\t ora l'ellisse");
		Ellisse e = new Ellisse(10,5);
		System.out.println("L'area è "+e.area());
		e.perimetro();
		System.out.println(e.toString());

	}
}