
import java.util.ArrayList;
import java.util.Scanner;

public class SecureDoor {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		ArrayList<String> hus = new ArrayList<>();//sparar namn som ar i huset
		ArrayList<String> handelser = new ArrayList<>();//sparar handelser
		
		boolean playing = true; // litet b för att det är primitiv datatyp

		System.out.println("hur manga ska ga igenom dorren?");
		int lines = input.nextInt();
		//hur manga som gar igenom dorren
		
		input.nextLine(); //buffer
		
		
		for (int i = 0; i < lines; i++) {
		String blip = input.nextLine(); //tar in namn
		
		//den tar ut sjalva namnen
		int nameIndex = 0;
		if(blip.startsWith("entry")) {
			nameIndex = 6; //tar bort "entry" i konsolen och skriver bara det som ar 6 bokstaver efter entry
			String onlyName = blip.substring(nameIndex);
			String logItem = onlyName + " entered"; 
			
			if(hus.contains(onlyName)){//kollar om namnet redan finns i huset
				logItem += " (ANOMALY)";// lagger till anomaly om namnet redan finns
			}

			handelser.add(logItem);
			hus.add(onlyName); 
			
		}else if(blip.startsWith("exit")){
			nameIndex = 5;//tar bort "exit" i konsolen och skriver bara det som ar 5 bokstaver efter exit
			String onlyName = blip.substring(nameIndex);
			
			String logItem = onlyName + " exited"; //skriver namn plus exited

			if(!hus.contains(onlyName)) {//kollar om namnet inte finns i huset, ! betyder inte

				logItem += " (ANOMALY)";// lagger till anomaly om namnet inte finns
				hus.remove(onlyName);
			}


			handelser.add(logItem);
		} 
		else {
			//om man inte skriver entry eller exit sa ar det fel, sa kommer detta komma
			i--;
			System.out.println("Fel");
		}
	
				
		}	
		System.out.println(handelser);	
		System.out.println(hus);
		
	}
	}