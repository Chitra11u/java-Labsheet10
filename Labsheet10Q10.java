import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("employees.txt", true);
            System.out.print("Enter Employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String empName = scanner.nextLine();
            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();
            System.out.print("Enter Salary: ");
            String salary = scanner.nextLine();

            writer.write(empId + "," + empName + "," + dept + "," + salary + "\n");
            writer.close();
            System.out.println("Employee record added successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the record.");
            e.printStackTrace();
        }

        System.out.print("\nEnter Employee ID to search: ");
        String searchId = scanner.nextLine();
        scanner.close();

        File file = new File("employees.txt");
        if (!file.exists()) {
            System.out.println("Employee record not found.");
            return;
        }

        boolean found = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details[0].equals(searchId)) {
                    System.out.println("\nEmployee Record Found:");
                    System.out.println("ID: " + details[0]);
                    System.out.println("Name: " + details[1]);
                    System.out.println("Department: " + details[2]);
                    System.out.println("Salary: " + details[3]);
                    found = true;
                    break;
                }
            }
            reader.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while searching the file.");
            e.printStackTrace();
        }
    }
}
