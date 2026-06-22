//Q5 /Surat Bista /116290
public class Main5 {
    public static void main(String[] args) {

        ElectronicDevice[] devices = {
                new Printer(),
                new Scanner()
        };

        for(ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}