import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        String[] words = {"apa", "hund", "katt", "orm", "igelkott"};
        // random ord som genereras
        int randomWordNumber = (int) (Math.random() * words.length);
 
     // en array som tar in bokst�ver man har gissat p�
        int gissningar = 0;// r�knar ner hur m�nga gissningar du har gjort
        char[] SkrivnaBokstaver = new char[words[randomWordNumber].length()]; // sparar bokst�verna du gissar
        boolean OrdSomBlevGissad = false;//r�knar ner bokst�ver du har gissat p�
    
    
    do {
        // fors�tter s� l�nge skrivna bokst�ver �r sant, om skrivna bokst�ver �r false d� har man skrivit alla bokst�ver
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
        
    } while (OrdSomBlevGissad); //detta kommer om du gissade fel och f�rlora
        System.out.println("ordet �r " + words[randomWordNumber] +
            " du missade " + (gissningar -findEmptyPosition(SkrivnaBokstaver)) +
            " g�ng (er)");
    
    
    
    
    }
}
    

