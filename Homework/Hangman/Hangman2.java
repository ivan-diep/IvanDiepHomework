import java.util.Arrays;
import java.util.Scanner;

public class Hangman2 {
	public static void main(String[] args) {
		//en lista med ord
        String[] words = {"Hej", "d�", "Jag", "apa", "smart"};
        // random ord som plockas fr�n arrayern
        int randomWordNumber = (int) (Math.random() * words.length);
        
}
	
	Scanner input = new Scanner(System.in);
	// h�r gissar du och blir det r�tt fors�tter du, blir det fel s� samlar det me
	while (count < 7 && prick.contains("*")) {
		System.out.println("Gissa ordet");
		System.out.println();
		String guess = input.next();
		hang(guess);
	}
	sc.close();
}
}