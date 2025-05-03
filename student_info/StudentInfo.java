
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfo {

    public static String findID(String studentName, Scanner infoScnr) throws Exception {
        while (infoScnr.hasNext()) {
            String name = infoScnr.next();
            String id = infoScnr.next();

            if (name.equals(studentName)) {
                return id;
            }
        }
        throw new Exception("Student ID not found for " + studentName);
    }

    public static String findName(String studentID, Scanner infoScnr) throws Exception {

        String name = infoScnr.next();
        String id = infoScnr.next();

        if (id.equals(studentID)) {
            return name;
        }
        throw new Exception("Student name not found for " + studentID);
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String studentName;
        String studentID;
        String studentInfoFileName;
        FileInputStream studentInfoStream = null;
        Scanner studentInfoScanner = null;

        // Read the text file name from user
        studentInfoFileName = scnr.next();

        // Open the text file
        studentInfoStream = new FileInputStream(studentInfoFileName);
        studentInfoScanner = new Scanner(studentInfoStream);

        // Read search option from user. 0: findID(), 1: findName()
        int userChoice = scnr.nextInt();

        // FIXME: findID() and findName() may throw an Exception.
        //        Insert a try/catch statement to catch the exception and output the exception message.
        try {
            if (userChoice == 0) {
                studentName = scnr.next();
                studentID = findID(studentName, studentInfoScanner);
                System.out.println(studentID);
            } else {
                studentID = scnr.next();
                // 🔁 Reopen the file because Scanner was used earlier
                studentInfoStream.close(); // Close old stream
                studentInfoStream = new FileInputStream(studentInfoFileName);
                studentInfoScanner = new Scanner(studentInfoStream);
                studentName = findName(studentID, studentInfoScanner);
                System.out.println(studentName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        studentInfoStream.close();
    }
}
