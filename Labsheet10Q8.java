import java.io.FileReader;
import java.io.IOException;

public class Labsheet10Q8 {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        try {
            FileReader reader = new FileReader("input.txt");
            int character;
            while ((character = reader.read()) != -1) {
                char ch = Character.toLowerCase((char) character);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else if (ch >= 'a' && ch <= 'z') {
                    consonants++;
                } else if (ch >= '0' && ch <= '9') {
                    digits++;
                } else if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r') {
                    spaces++;
                }
            }
            reader.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("An error occurred. Make sure input.txt exists.");
            e.printStackTrace();
        }
    }
}
