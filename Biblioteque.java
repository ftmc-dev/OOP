public class Biblioteque {
    private static int bookId = 1;
    private static String title;
    private static String authorName;
    private static int numberOfPages;
    private static String fingerPrint;

    public Biblioteque(String authorName, String title, int numberOfPages, String fingerPrint) {
        this.bookId = bookId++;
        this.title = title;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.fingerPrint = fingerPrint;
    }

    public void displayBookInformation() {
        System.out.printf("ID: " + this.bookId);
        System.out.println("Title: " + this.title);
        System.out.println("Author Name: " + this.authorName);
        System.out.println("Number of pages: " + this.numberOfPages);
        System.out.println("Fingerprint: " + this.fingerPrint);

    }
    public void displayAuthorInformation() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author Name: " + this.authorName);
    }
    public void displayFingerPrintInformation() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author Name: " + this.authorName);
        System.out.printf("ID: " + this.bookId);

    }
    public static class Books extends Biblioteque{
        public Books(String authorName, String title, int numberOfPages) {
            super(authorName, title, numberOfPages, authorName);
        }
    }
   public static class Authors extends Biblioteque{
       public Authors(String authorName, String title, int numberOfPages) {
           super(authorName, title, numberOfPages, authorName);
       }
   }
    public static class FingerPrint extends Biblioteque{

        public FingerPrint(String authorName, String title, int numberOfPages, String fingerPrint) {
            super(fingerPrint, title, numberOfPages, authorName);
            super.displayFingerPrintInformation();
        }
    }

    public static int getBookId() {
        return bookId;
    }
    public static String getTitle() {
        return title;
    }
    public static String getAuthorName() {
        return authorName;
    }
    public static int getNumberOfPages() {
        return numberOfPages;
    }
    public static String getFingerPrint() {
        return fingerPrint;
    }

    public static void setBookId(int bookId) {
        Biblioteque.bookId = bookId++;
    }
    public static void setTitle(String title) {
        Biblioteque.title = title;
    }
    public static void setAuthorName(String authorName) {
        Biblioteque.authorName = authorName;
    }
    public static void setNumberOfPages(int numberOfPages) {
        Biblioteque.numberOfPages = numberOfPages;
    }
    public static void setFingerPrint(String fingerPrint) {
        Biblioteque.fingerPrint = fingerPrint;
    }
    public static void main(String[] args) {
        Biblioteque library = new Biblioteque("Jean", "Before", 12, "JWOJEIW");
        library.displayBookInformation();
        library.displayAuthorInformation();
    }

    }
