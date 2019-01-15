
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);

		boolean running = true;
		// antingen false eller true fråga
		while (running == true) {
			//Gör en while loop
			System.out.println("Welcome to movie inspiration database! Please choose a genre!");
			System.out.println("(1) - Thriller");
			System.out.println("(2) - Comedy");
			System.out.println("(3) - Romance");
			System.out.println("(4) - Fantasy");
			System.out.println("(5) - Quit");
			System.out.println();
	
			int choice = input.nextInt();
	
			String genre;
	
			switch (choice) {
			case 1:
				genre = "Thriller";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. A quit place, av John Krasinski");
				System.out.println("2. The dark night, av Christopher Nolan");
				System.out.println("3. The silence of the lamb, av Jonathan Demme");
				System.out.println("Did you like the movies? If you did not.. ");
				System.out.println("Type 6 for going back to main menu to se more movies");
				System.out.println();
				choice = input.nextInt();
				// om du inte skriver 6, programmet kommer stoppas
				//om du skriver in 6, programmet kommer starta om i menu
				if(choice != 6){
					running = false;
					break;
				}
				break;
				
			case 2:
				genre = "Comedy";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. Deadpool 2, av David Leitch");
				System.out.println("2. Dum och dummare, av Peter Farelly");
				System.out.println("3. Bridesmaid, av Paul Feig");
				System.out.println("Did you like the movies? If you did not.. ");
				System.out.println("Type 6 for going back to main menu to se more movies");
				System.out.println();
				choice = input.nextInt();
				if(choice != 6){
					running = false;
					break;
				}

				break;
			case 3:
				genre = "Romance";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. The notebook, av Nick Cassavetes");
				System.out.println("2. The holidays, av Nancy Meyrs");
				System.out.println("3. Love Simon, av Greg Berlanti");
				System.out.println("Did you like the movies? If you did not.. ");
				System.out.println("Type 6 for going back to main menu to se more movies");
				System.out.println();
				choice = input.nextInt();
				if(choice != 6){
					running = false;
					break;
				}
				break;
			case 4:
				genre = "Fantasy";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
				System.out.println("2. Aquaman, av James Wan");
				System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
				System.out.println("Did you like the movies? If you did not.. ");
				System.out.println("Type 6 for going back to main menu to se more movies");
				System.out.println();
				choice = input.nextInt();
				if(choice != 6){
					running = false;
					break;
				}
				break;
			case 5:
				System.out.println("You did not choose a genre. If you want to go back to menu type 6.");
				choice = input.nextInt();

				if(choice != 6){
					running = false;
					break;
				}
				break;
			default:
				genre = "invalid";
				System.out.println("You have made a " + genre + " choice! Too bad for you!");
				System.out.println();
				break;
			}
		}

		input.close();
	}

}