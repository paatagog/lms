public class LMSTester {
    public static void main(String[] args) {
        LMS testLibrary = new LMS();

        Book tsikara = new Book();
        tsikara.setTitle("წიქარა");
        tsikara.setAuthor("N/A");

        Book oop = new Book();
        oop.setTitle("Object Oriented Programming");
        oop.setAuthor("Paata Gogishvili");

        testLibrary.addBook(tsikara);
        testLibrary.addBook(oop);

        testLibrary.printBooks();

        testLibrary.removeBook(oop);

        testLibrary.printBooks();

    }
}
