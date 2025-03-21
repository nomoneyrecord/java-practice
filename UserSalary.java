import java.util.Scanner;

public class UserSalary {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String nameInput = scnr.nextLine();
      int ageInput = scnr.nextInt();
      scnr.nextLine();
      String salaryInput = scnr.nextLine(); 

      long salary;
      if (salaryInput.contains(",")) {
        salary = Long.parseLong(salaryInput.replace(",", ""));
      } else {
        salary = Long.parseLong(salaryInput);
      }

      String formattedSalary = String.format("$%,d", salary);

      System.out.println(nameInput + " is " + ageInput + " and makes " + formattedSalary + ".");
  }
}