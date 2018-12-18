
public class arrayer5 {

    public static void main(String[] args) {
     

        // 100 tal i intervallet [0-9]
        int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

        countTal(numbers);
    }

    public static void countTal (int [] numbers) {

        int counter2 = 0;

        int counter4 = 0;

        int counter6 = 0;

        int counter8 = 0;




 

    for (int i = 0; i < numbers.length; i++) {

        if (numbers[i] == 2){

            counter2++;
        }
    }


    for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] == 4){

    counter4++;
            }

    }

    for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] == 6){

    counter6++;
                    }
    }
    for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] == 8){

    counter8++;
    }}


System.out.println(counter2 + counter4 + counter6 + counter8);


    }
}