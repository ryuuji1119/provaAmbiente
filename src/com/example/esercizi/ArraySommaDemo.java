package com.example.esercizi;

public class ArraySommaDemo {

	public ArraySommaDemo() {

	}

	public double[] generaArray5() {
		double Vettore[] = new double[5];
		for (int i = 0; i < 5; i++) {
			Vettore[i] = Math.random() * 1000;

		}
		return Vettore;
	}

	public void visualizzaArray(double Vettore[]) {
		for (int i = 0; i < 5; i++) {
			System.out.println("elemento " + i + ": " + Vettore[i]);
		}
	}

	public double SommaArray(double Vettore[]) {
		double somma = 0;
		for (double valore: Vettore) {
			somma += valore;
		}
		return somma;
	}

	public double SommaArraydispari(double Vettore[]) {
		double somma = 0;
		for (int i = 0; i < 5; i = i + 2) {
			somma = Vettore[i] + somma;
		}
		return somma;
	}
	// 1) generare un array di 5 posizioni double
	// 2) inizializzare l'array a valori random double moltiplicati per 1000
	// 3) stampare la somma dei valori contenuti negli elementi

	public static void main(String[] args) {
		ArraySommaDemo a = new ArraySommaDemo();
		double s;
		double[] V = new double[5];
		V = a.generaArray5();
		a.visualizzaArray(V);
		s = a.SommaArray(V);
		System.out.println("La somma: " + s);
		s = a.SommaArraydispari(V);
		System.out.println("La somma dei dispari: " + s);

	}
}