import java.util.Scanner;
import java.util.Arrays;


public class Hangman{

	
	// en array med ord 
	private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
	
	// Math.random gör att den tar någon av dom orden random, den typ lottar och har ingen bestämd 
	private static String word = words[(int) (Math.random() * words.length)];
	
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Gissa ordet, skriv en bokstav i taget.");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess);
		}
		sc.close();
	}
}