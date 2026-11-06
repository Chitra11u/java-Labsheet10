import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labsheet10Q3 {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            reader.close();

            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. Make sure data.txt exists.");
            e.printStackTrace();
        }
    }
}
