
import java.util.ArrayList;
import java.util.Scanner;

public class rep {

    private static Scanner input;

    public static void main(String[] args) {

    ArrayList<Integer> siffror = new ArrayList<>();
//gör en lista på heltal
    siffror.add(100);
    siffror.add(5);
    siffror.add(6);
    siffror.add(7);
   
        sum(siffror);
    }
    
    private static void sum(ArrayList<Integer> tal) {
    	//lägger ihop alla tal och adderar dom
        int sum = 0;
        for(int i = 0; i <tal.size(); i++) {
            sum = sum + tal.get(i);
        }
        System.out.println(sum);
        //skickar ut resultatet
    }
}