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
		OrdManKanGissaPa.add("koldioxidutsl�pp");

		
		
		
		// denna metod tar en random ord fr�n listan, 7 f�rs�k att gissa p�
		boolean spelet=true;
		while(spelet) { //h�r b�rjar spelet, startas ocks� om h�r.

			// du har 7 gissningar
			int gissningar = 7;
			//anropar "metod" och "slump"
		spelet=metod(slump(OrdManKanGissaPa), gissningar, spelet);
		}
		

	}
        
	
	// denna metoden �r hela spelet, ord �ndras till "*" och du gissar p� bokst�ver, 
	//gissar du r�tt �ndras "*" till bokstaven , gissar du fel r�knas det ner
	//efter du har gissat fel 7 g�nger f�rlorar du, sedan f�r du v�lja om du vill spela om eller inte
	//�ven om du vann.
		public static boolean metod(String ratt_bokstaver, int gissningar, boolean spelet) {
    		Scanner input = new Scanner(System.in);
    		
    		System.out.println("Gissa p� en bokstav, du har bara 7 f�rs�k");
    		
    		
    		
    		ArrayList<Character> SammaGissning=new ArrayList<Character>();
    		
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
    		while (gissningar > 0 && !ratt_bokstaver.equals(String.valueOf(stars))) {
    			char Bokstav = input.next().charAt(0); 

    			
    			if(SammaGissning.contains(Bokstav)) {
    				//om du gissar samma bokstav mer �n en g�ng kommer detta
    				System.out.println("Du har redan skrivit bokstaven");
    				continue;
    			}
    			
    			SammaGissning.add(Bokstav);
    			
    			//byter ut stj�rnorna (*) till de r�tta bokstaven du har skrivit i r�tt index
    			if (ratt_bokstaver.contains(Bokstav + "")) {
    				for (int stj�rna = 0; stj�rna < ratt_bokstaver.length(); stj�rna++) { 
    					if (ratt_bokstaver.charAt(stj�rna) == Bokstav) {
    						stars[stj�rna] = Bokstav;
    					}
    				}
    			}
    				else {
    					//om du gissar fel bokstav s� blir det -1 f�rs�k
    					//s� du kan gissa fel 7 g�nger
    					gissningar--; 
    				}
    			
    			if(ratt_bokstaver.equals(String.valueOf(stars))) { 
                      //checkar om det �r r�tt ord, om det �r s� skrivs detta ut
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
        				System.out.println("okej, hejd�");
        				break;
        			}
    			}
    			
    			
    			System.out.print(stars);
    			System.out.println("      f�rs�k kvar = " + gissningar + "\n");

    			}
    		
    		if(gissningar == 0) {
    			//om du har slut p� f�rs�k s� har du f�rlorat och det r�tta ordet kommer visas
    			
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
    			System.out.println("Du �r skit p� h�nga gubbe!");
    			System.out.println("Det r�tta ordet var:  " + ratt_bokstaver);
    			System.out.println("vill du spela igen? \n");
    			System.out.println("(1) ja     (2) nej \n");
    			String svar = input.next();
    			if(svar.equals("1")) {   //om du skriver 1 s� ska spelet starta om 				
    				spelet = true;
    			}
    			else {
    				spelet =false;
    				System.out.println("okej, hejd�"); //om du skriver n�got annat avslutas spelet
    				
    			}
    		}
			return spelet;
    		
    		}


		//slumpar ord och skickar tillbaka de de ok�nda ordet s� att man kan gissa
    	public static String slump(ArrayList<String> temp) { 
            Random rand = new Random(); 
            return temp.get(rand.nextInt(temp.size()));
    	

		}
    	}
	

    


