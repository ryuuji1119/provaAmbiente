/**
 * 
 */
package com.example.linguaggio;

/**
 * @author Alfredo
 *
 */

public class Swapper {
	private static int app;
	/**
	 * @param args
	 */
	public static void swap(int x, int y)
	{
		app=x;
		x=y;
		y=app;
		
		System.out.println("All'interno della funzione");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
	public int changeByValue(int x)
	{
		x=500;
		System.out.println("All'interno della funzione");
		System.out.println("x= "+x);
		return x;
	}
	
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int app;
		System.out.println("x= "+x);
		System.out.println("y= "+y);

		app=x;
		x=y;
		y=app;
		System.out.println("Effetto scambio");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		swap(x,y);
		Swapper s = new Swapper();
		x=s.changeByValue(x);
		
        Calcolatore calcolatore =new Calcolatore(x,y);
        System.out.println("x: "+x);
        System.out.println("y: "+y);


        System.out.println("somma: "+calcolatore.somma(x,y));
        System.out.println("differenza: " +calcolatore.differenza(x,y));
        System.out.println("differenza: " +calcolatore.differenza(x,x));
        System.out.println("differenza: " +calcolatore.differenza(x,null));
        System.out.println("differenza: " +calcolatore.differenza(null,y));



	}

}
