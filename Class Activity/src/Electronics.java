//Q8 /Surat Bista /116290
public class Electronics implements Discountable{
    double price;

    public Electronics (double price) {
        this.price = price;
    }

    public void applyDiscount (double pct) {
        price = price - (price * (pct / 100.0));
        System.out.println("\nNew price after discount: $" + price);
    }
}