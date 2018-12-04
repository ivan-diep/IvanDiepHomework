import java.util.Scanner;
public class Metod_läxa2 {

	

	    public static void main(String[] args)
	  
	    {
	        System.out.println("Skriv ditt namn");

	        Scanner scan = new Scanner(System.in);
	        String baklänges;
	        baklänges = reverse(scan.nextLine());
	        System.out.println(baklänges);
	    }
	    public static String reverse(String str)
	    {
	        String r = "";
	        for (int i=str.length()-1; i>=0; i--)
	            r = r + str.charAt(i);
	        System.out.print("Ditt namn baklänges är ");
	        return r;
	        
	    }
	}
