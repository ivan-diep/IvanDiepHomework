import java.util.ArrayList;

public class rep_2 {

    public static void main(String[] args) {
    	// Skapar en metod som tar in en sträng och returnerar den baklänges


        String word = "navI";
        ArrayList<String> list = new ArrayList<String>();
        String result = reverse(word, word.length() - 1, list);
        System.out.println(result);

    }

    public static String reverse(String word, int index, ArrayList<String> letter) {
        String result = "";
        letter.add(word.charAt(index) + "");

        if (index != 0) {

            reverse(word, --index, letter);

        }
        result = letter.toString();
        return result;

    }

}
