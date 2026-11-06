import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labsheet10Q2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            System.out.println("Contents of student.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file student.txt does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
