package com.example.linguaggio.matrici;

public class TombolaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tombola tombola = new Tombola();
		Integer x; String s;

		for(int i=0; i<90; i++) {
					if(i%20 == 0 && i > 0) { // ogni 10 numeri estratti
				System.out.println(tombola.tabellone());
			}
		
			x=tombola.estrai();
			System.out.println("Estratto "+x);
			
		}
		System.out.println(tombola.tabellone());
		
	}

}