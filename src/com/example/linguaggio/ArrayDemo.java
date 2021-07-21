package com.example.linguaggio;

import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int [] arr1 = new int[10];
		int arr2 [] = new int[10];
		int arr3 [] = {12, 55, -7, 78};
		
		System.out.println( "arr1.length="+arr1.length );
		System.out.println( "arr2.length="+arr2.length );
		System.out.println( "arr3.length="+arr3.length );
		
//		System.out.println( "arr3[arr3.length]="+arr3[arr3.length] );
		
//		System.out.println( "arr3[0]="+arr3[0] );
//		System.out.println( "arr3[1]="+arr3[1] );
//		System.out.println( "arr3[2]="+arr3[2] );
//		System.out.println( "arr3[3]="+arr3[3] );
		
		for(int indice=0; indice<arr3.length; indice = indice + 1) {
			System.out.println( "arr3["+indice+"]="+arr3[indice] );
		}
		
		System.out.println("------------------------------------------------");
		
		for(int indice=0; indice<arr1.length; indice = indice + 1) {
			arr1[indice] = indice;
		}
		
		for(int indice=0; indice<arr1.length; indice = indice + 1) {
			System.out.println( "arr1["+indice+"]="+arr1[indice] );
		}
		
		System.out.println("------------------------------------------------");
		Random random = new Random();
		
		for(int indice=0; indice<arr2.length; indice++) {
			arr2[indice] = random.nextInt();
		}
		for(int indice=0; indice<arr2.length; indice++) {
			System.out.println( "ar2["+indice+"]="+arr2[indice] );
		}
		
		
		/*******************/
		int x = 0;
		x = x + 1;
		x += 1;
		x *= 10;
		x++;
		
	}
}