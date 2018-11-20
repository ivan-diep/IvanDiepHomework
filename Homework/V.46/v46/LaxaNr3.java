package v46;

import java.util.Scanner;

public class LaxaNr3 {
 public static void main (String[] args) {
	 
		Scanner input = new Scanner(System.in);

	 
	 	double tal = 1;
	 	double product = 1;
	 	double count = 0;
	 	
	 	System.out.println("skriv in dina tal: " );
		
	 	while(product <= 100000) {
	 	
	 	tal = input.nextDouble();
	 	product = product * tal;
	 	count = count + 1;
	 	
	 	if (count == 10){
	 		break;
	 	}
	 	
	 	System.out.println(product);
		
		
 }
 
 		
 }
}
