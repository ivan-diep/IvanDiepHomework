import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman{


	public static void main(String[] args) {
		//en arraylist med ord som kommer komma upp i consolen som man f�r gissa p�
		ArrayList<String> OrdManKanGissaPa = new ArrayList<String>();
		OrdManKanGissaPa.add("apa");
		OrdManKanGissaPa.add("fisk");
		OrdManKanGissaPa.add("skola");
		OrdManKanGissaPa.add("kronhus");
		OrdManKanGissaPa.add("eclipse");
		OrdManKanGissaPa.add("k�rnfysik");
		OrdManKanGissaPa.add("aftonbladet");
		
		
		// du har 7 gissningar
		int gissningar = 7; 
		
		// denna metod tar en random ord fr�n listan, 7 f�rs�k att gissa
		metod(slump(OrdManKanGissaPa), gissningar);
		

	}
        
		public static void metod(String ratt_bokstaver, int gissningar) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Gissa p� en bokstav, du har bara 7 f�rs�k");
    		
    		
    		
    		ArrayList<Character> l=new ArrayList<Character>();
    		
    		//det blir stj�rnor p� bokst�ver man inte har gissat p�
    		char[] stars = new char[ratt_bokstaver.length()]; 
    		int i = 0;

    		while (i < ratt_bokstaver.length()) {
    			stars[i] = '*';
    			
    			if (ratt_bokstaver.charAt(i) == ' ') {
    				stars[i] = ' ';

    			}
    			i++;
    		}
    		System.out.print(stars);
    		System.out.println("      F�rs�k kvar = " + gissningar );

    		
    		
    		// h�r gissar du en bokstav, du kan gissa tills du har 0 f�rs�k kvar
    		while (gissningar > 0) {
    			char x = input.next().charAt(0); 

    			
    			if(l.contains(x)) {
    				//om du skriver samma bokstav kommer detta
    				System.out.println("Du har redan skrivit bokstaven");
    				continue;
    			}
    			
    			l.add(x);
    			
    			//byter ut stj�rnorna (*) till de r�tta bokstaven du har skrivit i r�tt index
    			if (ratt_bokstaver.contains(x + "")) {
    				for (int y = 0; y < ratt_bokstaver.length(); y++) { 
    					if (ratt_bokstaver.charAt(y) == x) {
    						stars[y] = x;
    					}
    				}
    			}
    				else {
    					//om du gissar fel bokstav s� blir det -1 f�rs�k
    					gissningar--; 
    				}
    			
    			if(ratt_bokstaver.equals(String.valueOf(stars))) { 
                      //checkar om det �r r�tt ord, om det �r s� skrivs detta ut
    				System.out.println(stars);
    				System.out.println("Grattis du vann!");
    				break;
    			}
    			
    			
    			System.out.print(stars);
    			System.out.println("      f�rs�k kvar = " + gissningar);

    			}
    		
    		if(gissningar == 0) {
    			//om du har slut p� f�rs�k s� har du f�rlorat och det r�tta ordet kommer visas
    			System.out.println("Du �r skit p� h�nga gubbe!");
    			System.out.println("Det r�tta ordet var:  " + ratt_bokstaver);
    		}
    		
    		}

    	public static String slump(ArrayList<String> temp) {
            Random rand = new Random(); 
            return temp.get(rand.nextInt(temp.size()));
    	}

    	
    	public static void hangmanImage() {
    		if (gissningar == 1) {
    			System.out.println("Wrong guess, try again");
    			System.out.println();
    			System.out.println();
    			System.out.println();
    			System.out.println();
    			System.out.println("___|___");
    			System.out.println();
    		}
    		if (count == 2) {
    			System.out.println("Wrong guess, try again");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("___|___");
    		}
    		if (count == 3) {
    			System.out.println("Wrong guess, try again");
    			System.out.println("   ____________");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   | ");
    			System.out.println("___|___");
    		}
    		if (count == 4) {
    			System.out.println("Wrong guess, try again");
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("   |");
    			System.out.println("___|___");
    		}
    		if (count == 5) {
    			System.out.println("Wrong guess, try again");
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |           |");
    			System.out.println("   |           |");
    			System.out.println("   |");
    			System.out.println("___|___");
    		}
    		if (count == 6) {
    			System.out.println("Wrong guess, try again");
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |           |");
    			System.out.println("   |           |");
    			System.out.println("   |          / \\ ");
    			System.out.println("___|___      /   \\");
    		}
    		if (count == 7) {
    			System.out.println("GAME OVER!");
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |          _|_");
    			System.out.println("   |         / | \\");
    			System.out.println("   |          / \\ ");
    			System.out.println("___|___      /   \\");
    			System.out.println("GAME OVER! The word was " + word);
    		}
	

    
}

