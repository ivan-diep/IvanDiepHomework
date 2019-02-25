
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
			System.out.println("V�lkommen till Ivans Gissa tal spel, v�lj en niv�!");
			System.out.println("(1) - Niv� 1 (l�tt)");
			System.out.println("(2) - Niv� 2 (medium)");
			System.out.println("(3) - Niv� 3 (sv�r)");
			System.out.println("(4) - L�mna");
			System.out.println();
	
			int choice = input.nextInt();

	

			guess(choice, NummerAttGissa, Gissa, Gissningar);
}
	}

public static void guess(int choice, int NummerAttGissa, int Gissa, int Gissningar) {
	//MEtos s� ja slipper skriva om koden flera g�nger n�r jag �nd� kommer anv�nda samma kod.

	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	if(choice == 1) {	
		NummerAttGissa = rand.nextInt(100);
		System.out.println("Du valde niv� 1! Gissa ett tal mellan 0-100");

	}
	
	if(choice == 2) {	
		NummerAttGissa = rand.nextInt(500);
		System.out.println("Du valde niv� 2! Gissa ett tal mellan 0-500");

	}
	
	if(choice == 3) {	
		NummerAttGissa = rand.nextInt(1000);
		System.out.println("Du valde niv� 3! Gissa ett tal mellan 0-1000");

	}
	
	if(choice == 4) {	
		System.out.println("Hej d�.");

	}
	
	
		
	
	Boolean win = false;
	while (win == false) {

		Gissa = input.nextInt();
		Gissningar++;
		// H�r kommer en text som st�r "Gissa ett tal melllan 0-100", sen personen f�r
		// gissa

		if (Gissa == NummerAttGissa) {
			win = true;
			// Du gissar
		}

		else if (Gissa < NummerAttGissa) {
			System.out.println("Ditt tal �r f�r litet, gissa igen");
			// gissar du f�r l�gt tal s� kommer detta ut
		}

		else if (Gissa > NummerAttGissa) {
			System.out.println("Ditt tal �r f�r h�g, gissa igen ");
			// gissar du f�r h�gt tal s� kommer detta ut
		}
	}

	System.out.println("Grattis du gissa r�tt!");
	System.out.println("Nummert var " + NummerAttGissa);
	System.out.println("Det tog " + Gissningar + " gissningar");
	}





}

