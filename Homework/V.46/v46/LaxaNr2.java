package v46;

import java.util.Scanner;

public class LaxaNr2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String ord = "HEJ";
		String slut= "avslutat";
		//string för att det är bokstäver inte siffror
		System.out.println("please type words and exit when you are done: ");
			
		while (!ord.equals("exit")) {
		ord = input.nextLine();
		//skriver ord och när du skriver "exit" så stannar det
		
		if (ord.equals("exit")) {
			System.out.println(slut);
		
		}
		}
		
		}
}


