
import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoor {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		ArrayList<String> hus = new ArrayList<>();
		boolean playing = true;

		System.out.println("hur m�nga ska g� igenom d�rren?");
		int lines = input.nextInt();
		//hur m�nga som g�r igenom d�rren
		
		input.nextLine(); //buffer
		
		
		for (int i = 0; i < lines; i++) {
		String blip = input.nextLine(); //tar in namn
		System.out.println(blip);
		
		//den tar ut sj�lva namnen
		int nameIndex = 0;
		if(blip.startsWith("entry")) {
			nameIndex = 6; 
			
		}else if(blip.startsWith("exit")){
			nameIndex = 5;
			
			
		}
		String onlyName = blip.substring(nameIndex);
		System.out.println(onlyName);
		
		
		
		if(hus.contains(onlyName)) {
			//System.out.print("anomaly!");
		}else {
			
		}
		
		}
	}
	
}


//Kollar ifall personen finns

//skriver ner vilka som g�r in
// anomaly om personen redan finns)

//Ifall personen g�r ut fr�n byggnaden stryks personen fr�n listan (+ anomaly om personen inte finns)