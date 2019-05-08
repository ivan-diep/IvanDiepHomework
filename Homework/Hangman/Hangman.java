import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman{


	public static void main(String[] args) {
		//en arraylist med ord som kommer komma upp i consolen som man får gissa på
		ArrayList<String> OrdManKanGissaPa = new ArrayList<String>();
		OrdManKanGissaPa.add("apa");
		OrdManKanGissaPa.add("fisk");
		OrdManKanGissaPa.add("skola");
		OrdManKanGissaPa.add("kronhus");
		OrdManKanGissaPa.add("eclipse");
		OrdManKanGissaPa.add("kärnfysik");
		OrdManKanGissaPa.add("aftonbladet");
		
		
		// du har 7 gissningar
		int gissningar = 7; 
		
		// denna metod tar en random ord från listan, 7 försök att gissa
		metod(slump(OrdManKanGissaPa), gissningar);
		

	}
        
		public static void metod(String ratt_bokstaver, int gissningar) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Gissa på en bokstav, du har bara 7 försök");
    		
    		
    		
    		ArrayList<Character> l=new ArrayList<Character>();
    		
    		//det blir stjärnor på bokstäver man inte har gissat på
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
    		System.out.println("      Försök kvar = " + gissningar );

    		
    		
    		// här gissar du en bokstav, du kan gissa tills du har 0 försök kvar
    		while (gissningar > 0) {
    			char x = input.next().charAt(0); 

    			
    			if(l.contains(x)) {
    				//om du skriver samma bokstav kommer detta
    				System.out.println("Du har redan skrivit bokstaven");
    				continue;
    			}
    			
    			l.add(x);
    			
    			//byter ut stjärnorna (*) till de rätta bokstaven du har skrivit i rätt index
    			if (ratt_bokstaver.contains(x + "")) {
    				for (int y = 0; y < ratt_bokstaver.length(); y++) { 
    					if (ratt_bokstaver.charAt(y) == x) {
    						stars[y] = x;
    					}
    				}
    			}
    				else {
    					//om du gissar fel bokstav så blir det -1 försök
    					gissningar--; 
    				}
    			
    			if(ratt_bokstaver.equals(String.valueOf(stars))) { 
                      //checkar om det är rätt ord, om det är så skrivs detta ut
    				System.out.println(stars);
    				System.out.println("Grattis du vann!");
    				break;
    			}
    			
    			
    			System.out.print(stars);
    			System.out.println("      försök kvar = " + gissningar);

    			}
    		
    		if(gissningar == 0) {
    			//om du har slut på försök så har du förlorat och det rätta ordet kommer visas
    			System.out.println("Du är skit på hänga gubbe!");
    			System.out.println("Det rätta ordet var:  " + ratt_bokstaver);
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

