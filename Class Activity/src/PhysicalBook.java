//Q13 /Surat Bista /116290
public class PhysicalBook implements Searchable {
    private String title;

    //Using a constructor
    public PhysicalBook(String title) {
        this.title = title;
    }
    //A custom search logic for physical book
    public void search(String k) {
        System.out.println("Searching the physical book " + title + " for " + k);
    }
}