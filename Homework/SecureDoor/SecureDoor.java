
import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoor {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		ArrayList<String> hus = new ArrayList<>();
		boolean playing = true;

		System.out.println("hur många ska gå igenom dörren?");
		int lines = input.nextInt();
		//hur många som går igenom dörren
		
		input.nextLine(); //buffer
		
		
		for (int i = 0; i < lines; i++) {
		String blip = input.nextLine(); //tar in namn
		System.out.println(blip);
		
		//den tar ut själva namnen
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

//skriver ner vilka som går in
// anomaly om personen redan finns)

//Ifall personen går ut från byggnaden stryks personen från listan (+ anomaly om personen inte finns)