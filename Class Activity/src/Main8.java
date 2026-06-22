//Q8 /Surat Bista /116290
public class Main8 {
    static void main(String[] args) {

        //Creating array of Electronics
        Electronics [] inventory = {new Electronics(100.0), new Electronics(500.0)};

        //Loop to apply discount
        for (Electronics e : inventory) {
            e.applyDiscount(10.0);
        }
    }
}