
import java.util.Scanner;

public class arrayer3 {
          public static void main(String[] args) {
        	  Scanner input = new Scanner(System.in);
        	  
        	  
        	  int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
        
          countInt(numbers);
          
          }
          
          public static void countInt(int[] numbers) {
        	  int counter = 0;
        	  int counter1 = 0;
        	  int counter2 = 0;
        	  int counter3 = 0; 
        	  int counter4 = 0;
        	  int counter5 = 0;
        	  int counter6 = 0;
        	  int counter7 = 0;
        	  int counter8 = 0;
        	  int counter9 = 0;
        	  
        	    for(int i = 0; i < numbers.length; i++) {
        	    	
        	    	if (numbers[i] == 0) {
        	    		
        	    		counter++;
        	    	}
        	    }
        	    

        	    for(int i = 0; i < numbers.length; i++) {
        	    	
        	    	if (numbers[i] == 1) {
        	    		
        	    		counter1++;
        	    	}
        	    }
        	    

        	    
        	    for(int i = 0; i < numbers.length; i++) {
        	    	
        	    	if (numbers[i] == 2) {
        	    		
        	    		counter2++;
        	    	}
        	    }

 for(int i = 0; i < numbers.length; i++) {
        	    	
        	    	if (numbers[i] == 3) {
        	    		
        	    		counter3++;
        	    	}
        	    }

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 4) {
 		
 		counter4++;
 	}
 }
 

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 5) {
 		
 		counter5++;
 	}
 }

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 6) {
 		
 		counter6++;
 	}
 }

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 7) {
 		
 		counter7++;
 	}
 }

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 8) {
 		
 		counter8++;
 	}
 }

 for(int i = 0; i < numbers.length; i++) {
 	
 	if (numbers[i] == 9) {
 		
 		counter9++;
 	}
 }
 
 System.out.println(counter + " st 0:or");
 System.out.println(counter1 + " st 1:or");
 System.out.println(counter2 + " st 2:or");
 System.out.println(counter3 + " st 3:or");
 System.out.println(counter4 + " st 4:or");
 System.out.println(counter5 + " st 5:or");         
 System.out.println(counter6 + " st 6:or");         
 System.out.println(counter7 + " st 7:or"); 
 System.out.println(counter8 + " st 8:or");
 System.out.println(counter9 + " st 9:or");
          }
}