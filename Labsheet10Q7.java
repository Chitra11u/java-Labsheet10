import java.io.File;
import java.util.Scanner;

public class Labsheet10Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        File file = new File(fileName);

        System.out.println("\nFile Information:");
        System.out.println("Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Is a File: " + file.isFile());
            System.out.println("Is a Directory: " + file.isDirectory());
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("Is Writable: " + file.canWrite());
        }
    }
}
