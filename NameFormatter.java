import java.util.Scanner;

public class NameFormatter {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 

      String fullName = scnr.nextLine();

      String[] nameParts = fullName.split(" ");

      String firstName = "";
      String lastInitial = "";
      String middleInitial = "";

      if(nameParts.length == 3) {
        firstName = nameParts[0];
        middleInitial = nameParts[1].substring(0, 1) + "."; 
        lastInitial = nameParts[2].substring(0, 1) + "."; 
        System.out.println(lastInitial + ", " + firstName + " " + middleInitial);
      } 
      else if (nameParts.length == 2) {
        firstName = nameParts[0];
        lastInitial = nameParts[1].substring(0, 1) + ".";
        System.out.println(lastInitial + ", " + firstName);
      }

      scnr.close();
  }
}