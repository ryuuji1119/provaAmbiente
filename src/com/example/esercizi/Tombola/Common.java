package com.example.esercizi.Tombola;

import java.util.Random;
public class Common {

 	public int random(int val, int x) {
 		  Random generatore = new Random();
 		  int randomNum = generatore.nextInt((val-x)+1)+ x;
 		  return randomNum;
 	}
}
