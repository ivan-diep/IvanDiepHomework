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
		OrdManKanGissaPa.add("koldioxidutsläpp");

		
		
		
		// denna metod tar en random ord från listan, 7 försök att gissa på
		boolean spelet=true;
		while(spelet) { //här börjar spelet, startas också om här.

			// du har 7 gissningar
			int gissningar = 7;
			//anropar "metod" och "slump"
		spelet=metod(slump(OrdManKanGissaPa), gissningar, spelet);
		}
		

	}
        
	
	// denna metoden är hela spelet, ord ändras till "*" och du gissar på bokstäver, 
	//gissar du rätt ändras "*" till bokstaven , gissar du fel räknas det ner
	//efter du har gissat fel 7 gånger förlorar du, sedan får du välja om du vill spela om eller inte
	//även om du vann.
		public static boolean metod(String ratt_bokstaver, int gissningar, boolean spelet) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Gissa på en bokstav, du har bara 7 försök");
    		
    		
    		
    		ArrayList<Character> SammaGissning=new ArrayList<Character>();
    		
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
    		while (gissningar > 0 && !ratt_bokstaver.equals(String.valueOf(stars))) {
    			char Bokstav = input.next().charAt(0); 

    			
    			if(SammaGissning.contains(Bokstav)) {
    				//om du gissar samma bokstav mer än en gång kommer detta
    				System.out.println("Du har redan skrivit bokstaven");
    				continue;
    			}
    			
    			SammaGissning.add(Bokstav);
    			
    			//byter ut stjärnorna (*) till de rätta bokstaven du har skrivit i rätt index
    			if (ratt_bokstaver.contains(Bokstav + "")) {
    				for (int stjärna = 0; stjärna < ratt_bokstaver.length(); stjärna++) { 
    					if (ratt_bokstaver.charAt(stjärna) == Bokstav) {
    						stars[stjärna] = Bokstav;
    					}
    				}
    			}
    				else {
    					//om du gissar fel bokstav så blir det -1 försök
    					//så du kan gissa fel 7 gånger
    					gissningar--; 
    				}
    			
    			if(ratt_bokstaver.equals(String.valueOf(stars))) { 
                      //checkar om det är rätt ord, om det är så skrivs detta ut
    				System.out.println(stars);
    				System.out.println(" ");
        			System.out.println("             __");
        			System.out.println("            /   \\");
        			System.out.println("           |     |");
        			System.out.println("            \\_ _/");
        			System.out.println("             _|_");
        			System.out.println("            / | \\");
        			System.out.println("             / \\ ");
        			System.out.println("            /   \\");
    				System.out.println("Grattis du vann, gubben lever!");
    				System.out.println("vill du spela igen? \n");
        			System.out.println("(1) ja     (2) nej \n");
        			String svar = input.next();
        			if(svar.equals("1")) {    				
        				spelet = true;
        			}
        			else {    				
            				spelet = false;
        				System.out.println("okej, hejdå");
        				break;
        			}
    			}
    			
    			
    			System.out.print(stars);
    			System.out.println("      försök kvar = " + gissningar + "\n");

    			}
    		
    		if(gissningar == 0) {
    			//om du har slut på försök så har du förlorat och det rätta ordet kommer visas
    			
    			System.out.println("   ____________");
    			System.out.println("   |          _|_");
    			System.out.println("   |         /   \\");
    			System.out.println("   |        |     |");
    			System.out.println("   |         \\_ _/");
    			System.out.println("   |          _|_");
    			System.out.println("   |         / | \\");
    			System.out.println("   |          / \\ ");
    			System.out.println("   |         /   \\");
    			System.out.println("___|___            ");
    			System.out.println("Du är skit på hänga gubbe!");
    			System.out.println("Det rätta ordet var:  " + ratt_bokstaver);
    			System.out.println("vill du spela igen? \n");
    			System.out.println("(1) ja     (2) nej \n");
    			String svar = input.next();
    			if(svar.equals("1")) {   //om du skriver 1 så ska spelet starta om 				
    				spelet = true;
    			}
    			else {
    				spelet =false;
    				System.out.println("okej, hejdå"); //om du skriver något annat avslutas spelet
    				
    			}
    		}
			return spelet;
    		
    		}


		//slumpar ord och skickar tillbaka de de okända ordet så att man kan gissa
    	public static String slump(ArrayList<String> temp) { 
            Random rand = new Random(); 
            return temp.get(rand.nextInt(temp.size()));
    	

		}
    	}
	

    


