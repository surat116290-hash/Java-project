//Q9 /Surat Bista /116290
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LogReader {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //try-catch block
        try {
            File file = new File ("server.log");
            Scanner input = new Scanner(file);

            //using a loop
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.contains ("ERROR")) {
                    list.add(line);
                }
            }
            input.close();

            System.out.println("File processed successfully!");
            System.out.println("Results: " + list);
        }
        catch (Exception e) {
            System.out.println("Error: 'server.log' file not found!");
        }

    }
}