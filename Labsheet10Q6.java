import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Labsheet10Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.next();
        scanner.close();

        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
            reader.close();

            if (count > 0) {
                System.out.println("Word found! It occurs " + count + " time(s) in the file.");
            } else {
                System.out.println("Word not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. Ensure notes.txt exists.");
            e.printStackTrace();
        }
    }
}
