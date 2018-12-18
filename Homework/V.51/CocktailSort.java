

public class CocktailSort {

    public static void main(String[] args) {

        // skapar en int array av storleken 20
        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {

            // fyller arrayen med 20 slumpm�ssiga heltal mellan 0 och 20
            randomNumbers[i] = (int) (Math.random() * 20) + 1;
        }

        // skriver ut arrayen
        printIntArray(randomNumbers);

        // anroper bubblesort-metoden och skriver ut antal iterationer
        System.out.println("It took " + cocktailSort(randomNumbers) + " iterations to sort the int array using" +
                " bubble sort algorithm.\n");

        // skriver ut en sorterad array
        printIntArray(randomNumbers);
    }

    /**
     * Metoden sorterar heltal i storleksordning med hj�lp av bubble sort algoritmen
     * @param randomNumbers
     * @return counter
     */

    static int cocktailSort(int[] randomNumbers) {

        // initierar n�dv�ndiga variabler
        boolean swapped = true;
        int counter = 0;

        // loopen k�rs tills hela arrayen kollas igenom utan att n�gra tal byter plats med varandra
        do {

            swapped = false;
//loopar igenom hela arrayen 1 g�ng
            for (int i = 0; i < randomNumbers.length - 1; i++) {

                // j�mf�r tv� tal bredvid varandra och byter plats p� dem om det h�gra talet �r st�rre �n det v�nstra
                if (randomNumbers[i] > randomNumbers[i + 1]) {
                    int temp = randomNumbers[i + 1];
                    randomNumbers[i + 1] = randomNumbers[i];
                    randomNumbers[i] = temp;
                    System.out.println(randomNumbers[i] + " med " + randomNumbers[i+1]);
                    swapped = true; // har �tminstone ett byte skett under k�rningen s� �ndras swapped v�rde till true
                }
                // h�ller koll p� antalet iterationer
                counter++;
            }

            for (int i = randomNumbers.length -1; i > 0;  i--) {
                 if (randomNumbers[i] < randomNumbers[i - 1]) {
                     int temp = randomNumbers[i - 1];
                     randomNumbers[i - 1] = randomNumbers[i];
                     randomNumbers[i] = temp;
                     swapped = true;
                     System.out.println(randomNumbers[i] + " med " + randomNumbers[i-1]);
                 }


                     counter++;


            };



        } while (swapped); // do-while loopen k�rs alltid minst en g�ng

        return counter; // returnerar antalet iterationer
    }

    /**
     * Metoden skriver ut en int array, sorterad eller osorterad
     * @param randomNumbers
     */
    static void printIntArray(int[] randomNumbers) {

        for (int j :
                randomNumbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
    }
}

