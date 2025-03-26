import java.util.Scanner;

public class NumProcessor {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 

      int smallest = Integer.MAX_VALUE; 
      int sumTotal = 0; 

      while (true) {
        int number = scnr.nextInt();

        if (number < 0) {
          break;
        }

        sumTotal += number; 

        if (number < smallest) {
          smallest = number; 
        }

      }

      System.out.println("Smallest: " + smallest);
      System.out.println("Sum: " + sumTotal);

      scnr.close();
  }
}