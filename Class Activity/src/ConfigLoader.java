//Q14 /Surat Bista /116290
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConfigLoader {
    public static void main(String[] args) {
        try {
            readConfig();   // Try to read the file
        } catch (FileNotFoundException e) {
            createDefaultConfig();
        }
    }

    static void readConfig() throws FileNotFoundException {
        File file = new File("config.txt");
        Scanner input = new Scanner(file); // Opening file to read

        System.out.println("Config data: " + input.nextLine());
        input.close();
    }

    static void createDefaultConfig() {
        System.out.println("File missing! Creating default....");
        try {
            PrintWriter writer = new PrintWriter("config.txt"); // Create new file
            writer.println("default_settings");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not create file!!");
        }
    }
}