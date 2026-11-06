import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Labsheet10Q5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("source.txt");
            FileWriter writer = new FileWriter("backup.txt");
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            reader.close();
            writer.close();
            
            System.out.println("File successfully copied from source.txt to backup.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred during the copy operation.");
            e.printStackTrace();
        }
    }
}
