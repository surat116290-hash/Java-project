//Q7 /Surat Bista /116290
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));
        }

        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        catch(InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}