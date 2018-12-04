import java.util.Scanner;
public class Metod_läxa1 {
	
	

	    public static void main(String[] args) {

	        {

	        }
	        
	        System.out.println("skriv in radien på klotet");
	        double volym;
	        Scanner scan = new Scanner(System.in);
	        volym = volume(scan.nextDouble());
	     
	        }

	    public static double volume(double radius){
	        radius = Math.pow(radius, 3) * 4 * Math.PI;
	        radius = radius / 3;
	        System.out.println("Volymen på klotet är " + radius);
	        return radius;
	        }

	}

