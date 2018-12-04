	import java.util.Scanner;

public class Metod_läxa3 {

	    public static void main(String[] args){
	    	
	    
	    
	    {
	    	System.out.println("Skriv en mening sen en bokstav, bokstaven du väljer visar"
	        		+ " hur många det är i meningen");
	    	
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
		    System.out.println("bokstaven" + str + "förekommer" + c + " gång(er) i ordet");

	    }
	  
        
	    return counter;
	    }
	}

