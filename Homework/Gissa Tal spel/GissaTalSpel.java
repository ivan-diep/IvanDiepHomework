
import java.util.Random;
import java.util.Scanner;

public class GissaTalSpel {

	public static void main(String[] args) {

		Random rand = new Random();
		int NummerAttGissa = rand.nextInt(100);
		int Gissningar = 0;

		Scanner input = new Scanner(System.in);

		int Gissa = 0;

		Boolean win = false;
		System.out.println("Gissa ett tal mellan 0-100");
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
