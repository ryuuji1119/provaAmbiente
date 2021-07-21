package com.example.esercizi.Tombola;

public class Tabellone {
	//variabili di istanza che riuso all'interno delle funzioni
	private int numeriUsciti[] = new int[90];
	private int generatore;

	public Tabellone() {
	}

	//Nel ciclo mi richiamo ogni volta la funzione random e faccio un controllo sull'array
	//Se non è presente, lo aggiungo
	//E così finché non lo riempio
	public void getNextNumber() {
		//dichiaro variabili e oggetti iniziali
		int index = 1;
		boolean isNew = false;
		int num = 0;
		Common ran = new Common();

		//in un ciclo, dove index è il numero di valori diversi (max 90) genero i valori randomici
		//e se non è presente nell'array, lo aggiungo incrementando il secondo indice
		while (index < 91) {
				generatore = ran.random(89,0);

				numeriUsciti[num] = generatore;
				for (int i = 0; i < numeriUsciti.length - 1; i++) {
					if (numeriUsciti[i] == generatore)

						isNew = false;
					else
						isNew = true;
				}
				
				//verifico se sia presente
				if (!isNew)
					System.out.println(num + " già presente");

			System.out.println("Il " + index + " numero estratto è " + numeriUsciti[num]);
			index++;
		} // end while
	}// end funzione

	
	//Creare un array numerato da 1 a 90 e quando usce un numero mettere 0 al suo posto
	
	public int[] rand(int [] numeriUsciti) {
		Common ran = new Common();
		int uscitiC [] = new int[90];
		int i = 0, num;
		while (i < 90) {
			generatore = ran.random(89,0);
			num = generatore;
			if (numeriUsciti[num] == num) {
				uscitiC[i]=num;
				numeriUsciti[num] = -1;
				i++;
	}
		}
		return uscitiC;
	}
	
	public int [] tabellone2() {
		int i;
		for (i = 0; i < 90; i++)
			numeriUsciti[i] = i;
		Tabellone t = new Tabellone();
		numeriUsciti=t.rand(numeriUsciti);
			

//		} // end while


		return numeriUsciti;
	}
	

}