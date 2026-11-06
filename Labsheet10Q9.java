import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("student_records.txt");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student " + i + ":");
                System.out.print("Roll Number: ");
                String rollNo = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Course: ");
                String course = scanner.nextLine();
                System.out.print("Marks: ");
                String marks = scanner.nextLine();

                writer.write("Roll No: " + rollNo + ", Name: " + name + ", Course: " + course + ", Marks: " + marks + "\n");
            }
            writer.close();
            System.out.println("\nRecords successfully stored in student_records.txt.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        scanner.close();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"));
            String line;
            System.out.println("Reading Student Records from File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
