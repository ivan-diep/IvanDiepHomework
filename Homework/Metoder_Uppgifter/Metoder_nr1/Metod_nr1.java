package Metoder_nr1;

import java.util.Scanner;

public class Metod_nr1 {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  double grader;
	  System.out.println("Hur m�nga grader �r det? Svara i Celsius ");
	  
	  grader = input.nextDouble();
	  welcomeMessage(grader);
		  
}
  
  static void welcomeMessage(double grader) {
		
	  
	  System.out.println("Det �r " + (grader + 273.15) + " Kelvin!");
	  // kan ocks� skriva "grader = grader + 273.15;" ovanf�r, blir samma sak.
		
		
	}
  
  
}
