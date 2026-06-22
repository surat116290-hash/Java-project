//Q5 /Surat Bista /116290
abstract class ElectronicDevice {
    abstract void powerOn();
}

class Printer extends ElectronicDevice {
    void powerOn() {
        System.out.println("Printer ON");
    }
}

class Scanner extends ElectronicDevice {
    void powerOn() {
        System.out.println("Scanner ON");
    }
}

