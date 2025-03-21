import java.util.Scanner; 

public class TablesNeeded {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int tableSize = 10;
      int guests = scnr.nextInt();
      int tablesFilled = guests / tableSize; 

      System.out.print("Tables filled: " + tablesFilled);
  }
}