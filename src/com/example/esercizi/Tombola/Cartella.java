package com.example.esercizi.Tombola;

public class Cartella {
	private int[] numeri; // numeri contenuti in questa cartella
	final private boolean[] row_signed; // true se il numero corrispondente è segnato
	final private boolean[] row2_signed; // true se il numero corrispondente è segnato
	final private boolean[] row3_signed; // true se il numero corrispondente è segnato
	private int[] row1 = new int[5];
	private int[] row2 = new int[5];
	private int[] row3 = new int[5];
	private boolean ambo = false;
	private boolean terna = false;
	private boolean quaterna = false;
	private boolean quintina = false;
	private boolean tombola = false;
	Tabellone t = new Tabellone();

	public Cartella() {
		row_signed = new boolean[5];
		row2_signed = new boolean[5]; // default tutti false
		row3_signed = new boolean[5];

		inizializzaCartella();

	}
//inizializzo la Cartella con valori random su 3 righe differenti (3 x 5)
	private void inizializzaCartella() {
		Common c = new Common();
		do {
			row1[0] = c.random(10, 1);
			row3[0] = c.random(10, 1);
			row2[0] = c.random(10, 1);
		} while ((row1[0] == row2[0]) || (row1[0] == row3[0]));
		do {
			row1[1] = c.random(30, 10);
			row3[1] = c.random(30, 10);
			row2[1] = c.random(30, 10);
		} while ((row1[1] == row2[1]) || (row1[1] == row3[1]));
		do {
			row1[2] = c.random(50, 30);
			row3[2] = c.random(50, 30);
			row2[2] = c.random(50, 30);
		} while ((row1[2] == row2[2]) || (row1[2] == row3[2]));
		do {
			row1[3] = c.random(60, 50);
			row3[3] = c.random(60, 50);
			row2[3] = c.random(60, 50);
		} while ((row1[3] == row2[3]) || (row1[3] == row3[3]));
		do {
			row1[4] = c.random(90, 70);
			row3[4] = c.random(90, 70);
			row2[4] = c.random(90, 70);
		} while ((row1[4] == row2[4]) || (row1[4] == row3[4]));


	}
	//visualizzo la cartella
	public void visualizza() {
		System.out.println("Cartella: ");

		for (int i = 0; i < 5; i++)
			System.out.print(row1[i] + " ");
		System.out.println(" ");
		for (int i = 0; i < 5; i++)
			System.out.print(row2[i] + " ");
		System.out.println(" ");
		for (int i = 0; i < 5; i++)
			System.out.print(row3[i] + " ");

		System.out.println(" ");

	}
	//metodo per verificare se è stato fatto ambo, terno.. ecc su UNA riga 
	public int verificaPremio(boolean[] row_signed) { //riga inserita richiamando la funzione
		int verificaP = 0;
		
		for (int j = 0; j < 5; j++) { 
			if (row_signed[j])
				verificaP++; 
			if ((verificaP == 2) && (!ambo)) { //se sono due segnati e ambo non è stato fatto
				System.out.println("Ambo");
				ambo = true;
			}
			if ((verificaP == 3) && (!terna)) { //se sono tre segnati e terno non è stato fatto

				terna = true;
				System.out.println("terna");
			}
			if ((verificaP == 4) && (!quaterna)) { //se sono 4 segnati e quaterna non è stato fatto

				quaterna = true;

				System.out.println("quaterna");
			}
			if ((verificaP == 5) && (!quintina)) { //se sono 5 segnati e cinquina non è stato fatto
				System.out.println("quintina");
				quintina = true;
			}
		}
		return verificaP; //ritorno il contatore dei numeri segnati sulla riga (da 0 a 5)
	}
	//
	public boolean Controllo() { //controllo che richiama il metodo verificaPremio su
			//ogni riga della cartella
		int v1, v2, v3;
		v1 = verificaPremio(row_signed);
		v2 = verificaPremio(row2_signed);
		v3 = verificaPremio(row3_signed);
		if ((v1 == 5) && (v2 == 5) && (v3 == 5)) { //se ci sono 5 elementi su tutte le righe
			System.out.println("TOMBOLAAA!!");
			tombola = true;
		}
		return tombola; //ritorno il valore true di tombola
	}

	
	//metodo per segnare i valori usciti
	public boolean signed(int i, int Numeri[]) {
		// inizializzo

		// richiamo la pesca dei numeri
		int j;
		//controllo se è uscito il numero nella prima riga
		for (j = 0; j < 5; j++) {
			if (row1[j] == Numeri[i]) {
				row_signed[j] = true;
				return true;
			}
		}
		//controllo se è uscito il numero nella seconda riga

		for (j = 0; j < 5; j++) {
			if (row2[j] == Numeri[i]) {
				row2_signed[j] = true;
				return true;
			}
		}
		//controllo se è uscito il numero nella terza riga

		for (j = 0; j < 5; j++) {
			if (row3[j] == Numeri[i]) {
				row3_signed[j] = true;
				return true;
			}

		}
		return false;
	}
}