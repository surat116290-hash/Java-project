//Q4 /Surat Bista /116290
import java.io.*;

public class DailySalesLog {
    public static void main(String[] args) {

        double[] sales = {1000,1200,900,1500,2000,1800,1700};

        try {
            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("weekly_sales.txt"));

            for(double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }

            bw.close();
            System.out.println("File Saved");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}