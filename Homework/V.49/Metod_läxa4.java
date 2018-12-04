	import java.util.Scanner;

public class Metod_läxa4 {
	  public static void main(String[] args) {
		  
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Skriv normalt");
	        String input = scanner.nextLine().toLowerCase();
	        String done = "";

	        char kon[] = "bcdfghjklmnpqrstvwxz".toCharArray();
	        char rovar[] = input.toCharArray();

	        for(int i = 0; i < rovar.length; i++){
	            String add = "";
	            for(int y = 0; y < kon.length; y++){
	                if(rovar[i] == kon[y]){
	                    add = "o" + Character.toString(rovar[i]); 
	                    break;
	                }
	            }
	            done = done + Character.toString(rovar[i]) + add;
	        }

	        System.out.println(done);

	    }

	}