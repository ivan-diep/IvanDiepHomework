
import java.util.Random;
import java.util.Scanner;

public class GissaTalSpel_Lektion2 {

	private static final String Break = null;

	public static void main(String[] args) {

		Random rand = new Random();
		int NummerAttGissa = rand.nextInt(100);
		int Gissningar = 0;

		Scanner input = new Scanner(System.in);

		int Gissa = 0;
		
		boolean running = true;
		while (running == true) {
			System.out.println("Välkommen till Ivans Gissa tal spel, välj en nivå!");
			System.out.println("(1) - Nivå 1 (lätt)");
			System.out.println("(2) - Nivå 2 (medium)");
			System.out.println("(3) - Nivå 3 (svår)");
			System.out.println("(4) - Lämna");
			System.out.println();
	
			int choice = input.nextInt();

	

			guess(choice, NummerAttGissa, Gissa, Gissningar);
}
	}

public static void guess(int choice, int NummerAttGissa, int Gissa, int Gissningar) {
	//MEtos så ja slipper skriva om koden flera gånger när jag ändå kommer använda samma kod.

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	if(choice == 1) {	
		NummerAttGissa = rand.nextInt(100);
		System.out.println("Du valde nivå 1! Gissa ett tal mellan 0-100");

	}
	
	if(choice == 2) {	
		NummerAttGissa = rand.nextInt(500);
		System.out.println("Du valde nivå 2! Gissa ett tal mellan 0-500");

	}
	
	if(choice == 3) {	
		NummerAttGissa = rand.nextInt(1000);
		System.out.println("Du valde nivå 3! Gissa ett tal mellan 0-1000");

	}
	
	if(choice == 4) {	
		System.out.println("Hej då.");

	}
	
	
		
	
	Boolean win = false;
	while (win == false) {

		Gissa = input.nextInt();
		Gissningar++;
		// Här kommer en text som står "Gissa ett tal melllan 0-100", sen personen får
		// gissa

		if (Gissa == NummerAttGissa) {
			win = true;
			// Du gissar
		}

		else if (Gissa < NummerAttGissa) {
			System.out.println("Ditt tal är för litet, gissa igen");
			// gissar du för lågt tal så kommer detta ut
		}

		else if (Gissa > NummerAttGissa) {
			System.out.println("Ditt tal är för hög, gissa igen ");
			// gissar du för högt tal så kommer detta ut
		}
	}

	System.out.println("Grattis du gissa rätt!");
	System.out.println("Nummert var " + NummerAttGissa);
	System.out.println("Det tog " + Gissningar + " gissningar");
	}





}

