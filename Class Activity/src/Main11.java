//Q11 /Surat Bista /116290
import java.util.ArrayList;

public class Main11 {
    static void main(String[] args) {

        //Creating a array list
        ArrayList<Vehicle> fleet = new ArrayList<>();

        //adding vehicles into the fleet list
        fleet.add(new Bike());
        fleet.add(new Bus());
        fleet.add(new Bike());

        //Loop through each vehicle inside the fleet list
        for (Vehicle v : fleet) {
            System.out.println(v.calculateFee());
        }
    }
}