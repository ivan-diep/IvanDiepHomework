package Metoder_nr1;


	import java.util.Scanner;

	public class Metod_nr2 {

	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
			String name;
			String name2;
			double age;
			double age2;
			
			System.out.println("Hej, vad heter du och din kompis?");
			name = input.nextLine();
			name2 = input.nextLine();
			welcomeMessage(name, name2);
			
			System.out.println("Hur gamla är ni båda?");
			
			age = input.nextDouble();
			age2 = input.nextDouble();
			welcomeMessage(age, age2);
		}
		
		
		static void welcomeMessage(String name, String name2) {
			
			System.out.println("Hej " + name + " och " + name2 + ", Välkomna hit!");
			
			
			
		}
	static void welcomeMessage(double age, double age2) {
		System.out.println("Ni är " + (age + age2) + " år tilsammans!");
			
			
			
			
		}
	  }


