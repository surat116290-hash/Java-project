//Q2 /Surat Bista /116290
import java.util.ArrayList;

public class StudentGradeFilter {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(95);
        scores.add(75);
        scores.add(30);

        for(int score : scores) {
            if(score >= 90) System.out.println("Distinction");
            else if(score >= 40) System.out.println("Pass");
            else System.out.println("Fail");

        }
    }
}