package com.example.esercizi.Tombola;

public class TombolaConArray {

	// 1) array di 90 elementi (sacchetto dei numeri) che contiene
	// valori da 1 a 90
	// 2) effettuare 90 estrazioni casuali in modo da estrarre tutti i
	// numeri della tombola
	// vincolo) 1 numero non può essere estratto 2 volte
	public static void main(String[] args) {
		Tabellone t = new Tabellone();
		// t.getNextNumber();
		System.out.println("-----");
		int[] array = new int[90];
		array = t.tabellone2();
		for (int i = 0; i < 90; i++) 
			System.out.println("Il " + i + " numero estratto: " + array[i]);
		Cartella c = new Cartella();
		Cartella c2 = new Cartella();
		boolean f;
		boolean tomb;
		c.visualizza();
		c2.visualizza();
		for (int i = 0; i < 90; i++) { //richiamo 90 volte AL MASSIMO i metodi della cartella

			f = c.signed(i, array);
			if (f)
				System.out.println("cartella1 : ");
			tomb = c.Controllo();
			if (tomb)
				break; //esco se ho fatto tombola
			f = c2.signed(i, array);
			if (f)
				System.out.println("cartella2 : ");
			tomb = c2.Controllo();
			if (tomb)
				break;

		}
	}
}