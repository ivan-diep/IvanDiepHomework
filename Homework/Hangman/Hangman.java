import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        String[] words = {"apa", "hund", "katt", "orm", "igelkott"};
        // random ord som genereras
        int randomWordNumber = (int) (Math.random() * words.length);
 
     // en array som tar in bokstäver man har gissat på
        int gissningar = 0;// räknar ner hur många gissningar du har gjort
        char[] SkrivnaBokstaver = new char[words[randomWordNumber].length()]; // sparar bokstäverna du gissar
        boolean OrdSomBlevGissad = false;//räknar ner bokstäver du har gissat på
    
    
    do {
        // forsätter så länge skrivna bokstäver är sant, om skrivna bokstäver är false då har man skrivit alla bokstäver
            System.out.println(SkrivnaBokstaver);
        switch (SkrivnaBokstaver(words[randomWordNumber], SkrivnaBokstaver)) {
            case 0:
                gissningar++;
                break;
            case 1:
            	gissningar++;
                break;
            case 2:
                break;
            case 3:
                OrdSomBlevGissad = true;
                break;
        }
        
    } while (OrdSomBlevGissad); //detta kommer om du gissade fel och förlora
        System.out.println("ordet är " + words[randomWordNumber] +
            " du missade " + (gissningar -findEmptyPosition(SkrivnaBokstaver)) +
            " gång (er)");
    
    
    
    
    }
}
    

