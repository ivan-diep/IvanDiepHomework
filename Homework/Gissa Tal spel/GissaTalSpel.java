
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
