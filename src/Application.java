@SuppressWarnings("ALL")
class Application {
    public static void main (String[] args) {
        //CZĘŚĆ PIERWSZA ZADANIA
        Book book1 = new Book("Temp","Temp");
        Book[] books = book1.genereteBooks(300000);
        BooksOnList booksList = new BooksOnList(books);
        booksList.fillTheList();
        booksList.addFirst();
        booksList.addLast();
        booksList.deleteFirst();
        booksList.deleteLast();

        //CZĘŚĆ DRUGA ZADANIA
        System.out.println("\n\n");
        HashMapKey key = new HashMapKey("temp");
        HashMapKey[] keys = key.generateKeys(300000);
        HashMapOfBooks mapOfBooks = new HashMapOfBooks(keys, books);
        mapOfBooks.fillTheMap();
        mapOfBooks.findTheBook(50);
        mapOfBooks.addingBook();
        mapOfBooks.deletingBook(50);
    }
}