
public class Hangman {
	 public static void main(String[] args) {
	        String[] words = {"writer", "that", "program"};
	        // Tar en random ord från arrayern
	        //Math.random för att de ska ta en random ord.
	        int randomWordNumber = (int) (Math.random() * words.length);
	        // En array som tar in det du skriver
	        char[] enteredLetters = new char[words[randomWordNumber].length()];
	        
	        int triesCount = 0; // antal försöker
	        boolean wordIsGuessed = false;
	        do {
	        // infinitely iterate through cycle as long as enterLetter returns true
	        // om enterLetter blir false så betyder det att man har gissar alla ord
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
	        } while (! wordIsGuessed);
	        System.out.println("ordet är " + words[randomWordNumber] +
	            " fel bokstav " + (triesCount -findEmptyPosition(enteredLetters)) +
	            " gånger");
	    }
}
