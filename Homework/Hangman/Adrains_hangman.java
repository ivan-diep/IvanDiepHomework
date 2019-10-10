import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Adrains_hangman {
	
	public static void main(String[] args) {
		ArrayList<String> djur = new ArrayList<>();

		djur.add("apa");
		djur.add("fisk");
		djur.add("");
		djur.add("apa");
		djur.add("apa");
		djur.add("apa");


		
		//String ord = "hello world"; // Meningen som spelaren ska gissa p�
		int liv = 11; // Hur m�nga f�rs�k spelaren f�r p� sig att gissa fram till Meningen
		metod(slump(list1), liv);
	}
	
	public static void metod(String ratt_ord, int liv) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("lets play hangman choose a letter");
		
		
		
		ArrayList<Character> l=new ArrayList<Character>();

		char[] fyllning = new char[ratt_ord.length()]; // Detta �r fyllningen f�r bokst�verna som �nnu inte har gissats r�tt
													// p�
		int i = 0;

		while (i < ratt_ord.length()) {
			fyllning[i] = '*';
			
			if (ratt_ord.charAt(i) == ' ') {
				fyllning[i] = ' ';

			}
			i++;
		}
		System.out.print(fyllning);
		System.out.println("      �terst�ende liv = " + liv);

		while (liv > 0) {
			char x = input.next().charAt(0); // spelarens ins�ttning av bokstav och s� l�nge livet inte n�r 0 kan
												// spelaren forts�tta chansa
			if(l.contains(x)) {
				
				System.out.println("Redan ins�tt");
				continue;
			}
			
			l.add(x);
			
			
			if (ratt_ord.contains(x + "")) {
				for (int y = 0; y < ratt_ord.length(); y++) { //den h�r loppen kollar alla index f�r bokst�verna och byter ut * mot bokstaven
					if (ratt_ord.charAt(y) == x) {
						fyllning[y] = x;
					}
				}
			}
				else {
					liv--; //Om det gissade bokstaven inte finns med i indexet tas ett liv bort
				}
			
			if(ratt_ord.equals(String.valueOf(fyllning))) { //Kollar ifall fyllningen �r lika med ordet
				
				System.out.println(fyllning);
				System.out.println("Grattis du vann!!");
				break;
			}
			
			
			System.out.print(fyllning);
			System.out.println("      �terst�ende liv = " + liv);

			}
		
		if(liv == 0) {
			System.out.println("Du f�rlora hahaha!");
			System.out.println("Det r�tta ordet var:  " + ratt_ord);
		}
		
		}

	public static String slump(ArrayList<String> temp) {
        Random rand = new Random(); 
        return temp.get(rand.nextInt(temp.size()));
	}

	

}