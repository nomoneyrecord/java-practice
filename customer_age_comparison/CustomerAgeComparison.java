import java.util.Scanner;

public class CustomerAgeComparison {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Customer customer1 = new Customer();
      Customer customer2 = new Customer();

      String name1 = scnr.nextLine();
      int age1 = scnr.nextInt();
      scnr.nextLine();
      String name2 = scnr.nextLine();
      int age2 = scnr.nextInt();

      customer1.setName(name1);
      customer1.setAge(age1);
      customer2.setName(name2);
      customer2.setAge(age2);

      System.out.println("Customer that is older: ");

      if (customer1.getAge() > customer2.getAge()) {
        customer1.printInfo();
      } else {
        customer2.printInfo();
      }

      scnr.close();
  }
}