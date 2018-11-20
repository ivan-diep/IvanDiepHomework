package v46;

import java.util.Scanner;

public class LaxaV46{ 
public static void main(String[] args) {
	
	double tal = 1;
	double summa = 0;

	Scanner input = new Scanner(System.in);

	System.out.println("please type a number: ");
	
	while (tal != 0) {
		 
		tal = input.nextDouble();
		summa +=tal;
	}
	
	System.out.println("the sum of all numbers is" + summa);
	System.out.printf("The sum of all numbers is %.1f", summa);
	
	input.close();
	
	
	}



}
