
import java.util.Scanner; 

public class Person {
  private String name;
  private int age;
  private String salaryInput;

  public Person(String name, int age, String salaryInput) {
    this.name = name; 
    this.salaryInput = salaryInput; 

    if(age < 0){
      this.age = 0; 
      System.out.println("Invalid age, set to 0.");
    } else {
      this.age = age;
    }
  }

  public Person(){
    this.name = "Unknown";
    this.age = 0; 
    this.salaryInput = "0";
  }

  public void setName(String name){
    this.name = name; 
  }

  public String getName(){
    return name; 
  }

  public void setAge(int age){
    this.age = age; 
  }

  public int getAge(){
    return age; 
  }

  public void setSalary(String salaryInput){
    this.salaryInput = salaryInput; 
  }

  public String getSalary(){
    return salaryInput; 
  }

  public String formatSalary(String salaryInput) {
    long salary = Long.parseLong(salaryInput.replace(",", "")); // Remove any commas first
    return String.format("$%,d", salary); // Ensure proper formatting with commas
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in); 

    System.out.println("Enter full name: ");
    String name = scnr.nextLine(); 

    System.out.println("Enter age: ");
    int age = scnr.nextInt();
    scnr.nextLine();

    System.out.println("Enter salary: ");
    String salaryInput = scnr.nextLine(); 

    Person person = new Person(name, age, salaryInput); 

    String formattedSalary = person.formatSalary(person.getSalary());

    System.out.println("Profile summary: " + person.getName() + ", Age: " + person.getAge() + ", Salary: " + formattedSalary);

    scnr.close();

  }
}