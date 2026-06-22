//Q1 /Surat Bista /116290
class ColdBox extends StorageUnit implements Refrigerated {
    public void adjustTemp(int t) {
        System.out.println("Temperature adjusted to " + t + "°C");
    }
}
