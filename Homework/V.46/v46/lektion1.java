package v46;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
		int tal1 = 0;
		int summa = 0;
		double decimal = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Please type numbers and when you are done, type 0: ");
	
	for (int i = 1; i <= 10; i++)
	
		tal1 = input.nextInt();
		
	if(tal1 == 0); // om du skriver in 0, så stoppar det
	
	if (tal1 < 0) {
		System.out.println("Your number in negative. Please type again! ");
		int i = 0;
		i--;
	}
	
	
	
	
	}
	

	
}