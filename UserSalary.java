
import java.util.Scanner;

public class UserSalary {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String nameInput = scnr.nextLine();
        int ageInput = scnr.nextInt();
        scnr.nextLine();
        String salaryInput = scnr.nextLine();

        System.out.println(nameInput + " is " + ageInput + " and makes " + "$" + salaryInput + ".");

        scnr.close();
    }
}
