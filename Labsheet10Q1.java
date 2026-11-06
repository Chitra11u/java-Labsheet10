import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Labsheet10Q1 {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter("student.txt");
            writer.write("Student Name: John Doe\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: Computer Science\n");
            writer.write("Semester: 4th\n");
            writer.close();

            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
