import java.util.*;
class BooksOnList{
    Book[] books;
    List<Book> listOfBooks = new LinkedList<>();
    //Konstruktor
    public BooksOnList(Book[] books){
        this.books=books;
    }
    //Wypełnianie listy 
    public void fillTheList(){
        for(int i=0;i<books.length;i++){
            listOfBooks.add(books[i]);
        }
        System.out.println(books.length + " książek zostało dodanych na listę \n");
    }
    //Dodawanie pierwszego elementu na listę
    public void addFirst(){
        System.out.println(".............. DODAWANIE NA POCZĄTKU LISTY .............. ");
        Book firstExample = new Book("First book","author");
        long timeBefore = System.nanoTime();
        listOfBooks.add(0,firstExample);
        long timeAfter = System.nanoTime();
        long addingFirstTime = timeAfter -timeBefore;
        System.out.println( listOfBooks.get(0) + " została dodana na początku listy"+
                "\nAktualna ilość książek na liście : "+listOfBooks.size()+"\n"+
                "Czas operacji wyniósł : "+addingFirstTime+" nanosekund\n");

    }
    //Dodawanie ostatniego elementu na liste
    public void addLast(){
        System.out.println(".............. DODAWANIE NA KOŃCU LISTY .............. ");
        Book secondExample = new Book("Last book","author");
        int index = listOfBooks.size();
        long timeBefore = System.nanoTime();
        listOfBooks.add(index,secondExample);
        long timeAfter = System.nanoTime();
        long addingLastTime = timeAfter -timeBefore;

        System.out.println( listOfBooks.get(listOfBooks.size()-1) + " została dodana na końcu listy"+
                "\nAktualna ilość książek na liście : "+listOfBooks.size()+"\n"+
                " Czas operacji wyniósł : "+addingLastTime+" nanosekund\n");
    }
    //Usuwanie pierwszego elementu z listy
    public void deleteFirst(){
        System.out.println(".............. USUWANIE Z POCZĄTKU LISTY .............. ");
        Book deleteFirst = listOfBooks.get(0);
        long timeBefore = System.nanoTime();
        listOfBooks.remove(deleteFirst);
        long timeAfter = System.nanoTime();
        long deletingFirstTime = timeAfter -timeBefore;
        System.out.println( deleteFirst + " została usunięta z początku listy"+
                "\nAktualna ilość książek na liście : "+listOfBooks.size()+"\n"+
                "Czas operacji wyniósł : "+deletingFirstTime+" nanosekund\n");
    }
    //Usuwanie ostatniego elementu z listy
    public void deleteLast(){
        System.out.println(".............. USUWANIE Z KOŃCA LISTY .............. ");
        Book deleteLast = listOfBooks.get(listOfBooks.size()-1);
        long timeBefore = System.nanoTime();
        listOfBooks.remove(deleteLast);
        long timeAfter = System.nanoTime();
        long deletingLastTime = timeAfter -timeBefore;
        System.out.println( deleteLast + " została usunięta z końca listy"+
                "\nAktualna ilość książek na liście : "+listOfBooks.size()+"\n"+
                "Czas operacji wyniósł : "+deletingLastTime+" nanosekund\n");
    }
}