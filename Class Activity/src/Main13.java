//Q13 /Surat Bista /116290
public class Main13 {
    static void main(String[] args) {

        //Creating library objects
        Searchable dB = new EBook("Java Programming");
        Searchable pB = new PhysicalBook("Introduction to Religion");

        //Executing search function on objects
        dB.search("Java");
        pB.search("History");
    }
}