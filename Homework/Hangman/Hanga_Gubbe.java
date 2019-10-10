
import java.util.Arrays;
import java.util.Scanner;

public class Hanga_Gubbe{
    public static void main(String[] args) {
        String[] words = {"are", "you", "dumb", "or", "smart"};
        // random ord som genereras
        int randomWordNumber = (int) (Math.random() * words.length);

        // en array som tar in bokstäver man gissade på
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;


        do {
        // forsätta så länge enteredletters är true
        // om enterletters är false då har man skrivit alla bokstäver
            System.out.println(enteredLetters);
        switch (enterLetter(words[randomWordNumber], enteredLetters)) {
            case 0:
                triesCount++;
                break;
            case 1:
                triesCount++;
                break;
            case 2:
                break;
            case 3:
                wordIsGuessed = true;
                break;
        }

        }

        while (! wordIsGuessed);
        System.out.println("\nThe word is " + words[randomWordNumber] +
            " You missed " + (triesCount -findEmptyPosition(enteredLetters)) +
            " time(s)");

    }
/*     return 0 om bokstaven man skrev in inte är med i ordet
     return 1 om bokstaven är skriven för första gången
     return 2 om bokstaven är redan skriven
     return 3 om alla gissade boksäver är rätt */
    public static int enterLetter(String word, char[] enteredLetters)    {
        System.out.print("(Guess) Enter a letter in word ");

        //  din gissning på ordet är rätt
        if (! printWord(word, enteredLetters))
            return 3;
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().charAt(0);
        if (inEnteredLetters(userInput, enteredLetters)) {
            System.out.println(userInput + " is already in the word");
            return 2;
        }
        else if (word.contains(String.valueOf(userInput))) {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }
        else {
            System.out.println(userInput + " is not in the word");
            return 0;
            }
    }

    // Sqwsxwxkriv ut ordet med asterisktecken, return true om asterisk skrevs ut annars false 