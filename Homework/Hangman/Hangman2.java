import java.util.Arrays;
import java.util.Scanner;

public class Hangman2 {
	public static void main(String[] args) {
		//en lista med ord
        String[] words = {"Hej", "då", "Jag", "apa", "smart"};
        // random ord som plockas från arrayern
        int randomWordNumber = (int) (Math.random() * words.length);
        
}
	
	Scanner input = new Scanner(System.in);
	// här gissar du och blir det rätt forsätter du, blir det fel så samlar det me
	while (count < 7 && prick.contains("*")) {
		System.out.println("Gissa ordet");
		System.out.println();
		String guess = input.next();
		hang(guess);
	}
	sc.close();
}
}