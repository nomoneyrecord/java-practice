import java.util.Scanner;

public class InputValidator {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();

      int concatTotal = (num1 * 100) + (num2 * 10) + num3; 

      if (num1 < 0 || num2 < 0 || num3 < 0) {
        System.out.println("Invalid input!");
      } else if (concatTotal % 3 != 0) {
        System.out.println(concatTotal + " is not divisible by 3!");
      } else {
        System.out.println(concatTotal + " is divisible by 3!");
      }

      scnr.close();
  }
}