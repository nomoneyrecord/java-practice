import java.util.Scanner;

public class ArrayAverage {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double[] numbers = new double[3];

      numbers[0] = scnr.nextDouble();
      numbers[1] = scnr.nextDouble();
      numbers[2] = scnr.nextDouble();

      System.out.println("Array items: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

      double average = (numbers[0] + numbers[1] + numbers[2]) / numbers.length; 

      System.out.println("Average: " + average);

  }
}