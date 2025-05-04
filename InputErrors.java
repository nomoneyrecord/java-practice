import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputErrors {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max = Integer.MIN_VALUE;
      int count = 0;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      try {
         
         val1 = scnr.nextInt();
         count++;
         max = val1; 
         
         val2 = scnr.nextInt();
         count++;
         if (val2 > val1){
            max = val2; 
         }
         
         val3 = scnr.nextInt();
         count++;
         if (val3 > val2) {
            max = val3;
         }
         
         System.out.println(max);
         
      } catch (NoSuchElementException e) {
         System.out.println(count + " input(s) read:");
         if(count == 0) {
            System.out.println("No max");
         } else {
          System.out.println("Max is " + max);    
         }
      }
      
   }
}
