//Q12 /Surat Bista /116290
import java.util.Random;

public class SurveyAnalyzer {
    public static void main(String[] args) {
        //Generating 50 survey responses from integers 1 to 5
        int[] responses = new int[50];
        Random rand = new Random();

        for (int i = 0; i < responses.length; i++) {
            responses[i] = rand.nextInt(5) + 1; // Produces 1-5
        }
        // Frequency Array
        int[] freq = new int[6];

        //  Counting occurrences
        for (int r : responses) {
            freq[r]++;
        }

        // Printing the results
        for (int i = 1; i <= 5; i++) {
            System.out.println ("Rating " + i + ": " + freq[i] + " times");
        }
    }
}