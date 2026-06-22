//Q3 /Surat Bista /116290
public class Main3 {

    static void checkEligibility(int age)
            throws InvalidAgeException {

        if(age < 18)
            throw new InvalidAgeException("Not Eligible");

        System.out.println("Eligible to Vote");
    }

    public static void main(String[] args) {

        try {
            checkEligibility(16);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}