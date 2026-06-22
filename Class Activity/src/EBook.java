//Q13 /Surat Bista /116290
public class EBook implements Searchable {
    private String title;

    //Using a constructor
    public EBook(String title) {
        this.title = title;
    }

    //A custom search logic for ebook
    public void search (String k) {
        System.out.println("Searching the book " + title + " for " + k);
    }
}
