	import java.util.Scanner;

public class Metod_l�xa3 {

	    public static void main(String[] args){
	    	
	    
	    
	    {
	    	System.out.println("Skriv en mening sen en bokstav, bokstaven du v�ljer visar"
	        		+ " hur m�nga det �r i meningen");
	    	
	        Scanner input = new Scanner(System.in);
	        char c;
	        String str;
	        
	        
	        str = input.nextLine();
	        c = input.nextLine().charAt(0);

	    } 
	    }
	    public static int count(String str, char c){
	    	
	    int counter = 0;
	    for (int i = 0; i < str.length(); i++) {
	    	
	        if(str.charAt(i) == c)
	            counter++;
		    System.out.println("bokstaven" + str + "f�rekommer" + c + " g�ng(er) i ordet");

	    }
	  
        
	    return counter;
	    }
	}

