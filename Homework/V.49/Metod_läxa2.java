import java.util.Scanner;
public class Metod_l�xa2 {

	

	    public static void main(String[] args)
	  
	    {
	        System.out.println("Skriv ditt namn");

	        Scanner scan = new Scanner(System.in);
	        String bakl�nges;
	        bakl�nges = reverse(scan.nextLine());
	        System.out.println(bakl�nges);
	    }
	    public static String reverse(String str)
	    {
	        String r = "";
	        for (int i=str.length()-1; i>=0; i--)
	            r = r + str.charAt(i);
	        System.out.print("Ditt namn bakl�nges �r ");
	        return r;
	        
	    }
	}
