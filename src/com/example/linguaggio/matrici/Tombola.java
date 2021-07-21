package com.example.linguaggio.matrici;

import java.util.Random;

/**
 * Crea un tabellone della tombola Metodi: Costruttore => inizializzare Integer
 * estrai() void reset() String tabellone()
 * 
 * @author corso
 *
 */
public class Tombola {

	private static final int COLONNE_TABELLONE = 10;
	private static final int RIGHE_TABELLONE = 9;
	private static final int DIMENSIONE_TOMBOLA = RIGHE_TABELLONE * COLONNE_TABELLONE;
	private Integer[][] estrazioni = null;

	private Integer indiceOrdineDiEstrazione = 0;
	private Integer[] estrazioniInOrdineDiEstrazione = null;

	private OrganizzazioneMatriceUtility utility = OrganizzazioneMatriceUtility
			.createUtility(OrganizzazioneMatrice.ROW_MAJOR);

	public Tombola() {
		this.init();
	}

	private void init() {
		this.estrazioni = new Integer[RIGHE_TABELLONE][COLONNE_TABELLONE];
		this.indiceOrdineDiEstrazione = 0;
		this.estrazioniInOrdineDiEstrazione = new Integer[DIMENSIONE_TOMBOLA];
		for (int i = 0; i < RIGHE_TABELLONE; i++) {
			for (int j = 0; j < COLONNE_TABELLONE; j++) {
				this.estrazioni[i][j] = 0;
			}
		}
	}

	public void reset() {
		this.init();
	}

	private Random random = new Random();

	public Integer estrai() {
		int estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
		int index = estratto - 1;
		int[] rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
		int row = rowColumn[0];
		int column = rowColumn[1];
		while (estrazioni[row][column] != 0) {
			estratto = random.nextInt(DIMENSIONE_TOMBOLA) + 1;
			index = estratto - 1;
			rowColumn = this.utility.getRowColumnFromIndexV1(index, RIGHE_TABELLONE, COLONNE_TABELLONE);
			row = rowColumn[0];
			column = rowColumn[1];
		}
		estrazioni[row][column] = estratto;
		estrazioniInOrdineDiEstrazione[indiceOrdineDiEstrazione++] = estratto;
		return estratto;
	}

	/*
	 * private String rimpiazzo(String sb, Integer x) { String nuova; String
	 * valoreInteger=(" "+x+" "); nuova=sb.replace(valoreInteger," X "); return
	 * nuova; }
	 */
	public String tabellone() {
		// newline ==> '\n'
		StringBuilder sb = new StringBuilder(); // StringBuffer()
		// si riempie

		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 10; i++) {
				sb.append(" " + (converti(estrazioni[j][i])) + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private String converti(int valore) {
		if (valore == 0) {
			return "  ";
		}
		if (valore < 10) {
			return " " + valore;
		}
		return "" + valore;
	}
}