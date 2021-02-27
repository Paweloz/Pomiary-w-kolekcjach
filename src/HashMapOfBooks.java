import java.util.*;

class HashMapOfBooks{
    Book[] books;
    HashMapKey[] keys;
    Map<HashMapKey,Book> hashMapOfBooks = new HashMap<>();

    public HashMapOfBooks(HashMapKey[] keys,Book[] books){
        this.books=books;
        this.keys=keys;
    }

    //Wypełnienie mapy zadaną ilością elementów
    public void fillTheMap(){
        Book tempBook=null;
        HashMapKey tempKey=null;
        for(int i=0;i<books.length;i++){
            tempBook = books[i];
            for(int n=0;n<keys.length;n++){
                tempKey = keys[i];
            }
            hashMapOfBooks.put(tempKey,tempBook);
            tempBook=null;
            tempKey=null;
        }
    }
    //Wyszukiwanie książki o określonym kluczu
    public void findTheBook(int keyNumber){
        long timeBefore = System.nanoTime();
        Book tempBook = hashMapOfBooks.get(keys[keyNumber]);
        long timeAfter = System.nanoTime();
        long findingTime=timeAfter-timeBefore;
        System.out.println("Znalezioną wybraną książkę : "+ tempBook+" w czasie : "+
                findingTime+" nanosekund\n");

    }
    //Dodawanie nowej książki do hashmapy
    public void addingBook(){
        HashMapKey newKey = new HashMapKey("klucz");
        Book book1 = new Book("New Book","Author");
        long timeBefore = System.nanoTime();
        hashMapOfBooks.put(newKey,book1);
        long timeAfter = System.nanoTime();
        long addingTime = timeAfter-timeBefore;
        System.out.println( "Książka :"+hashMapOfBooks.get(newKey)+
                " została dodana do mapy w czasie : "+addingTime+" nanosekund\n");
    }
    //Wyszukiwanie książki o określonym kluczu i usuwanie jej
    public void deletingBook(int keyIndex){
        HashMapKey tempKey=null;
        Book tempBook=null;
        for(Map.Entry<HashMapKey, Book> entry : hashMapOfBooks.entrySet()){
            HashMapKey key = entry.getKey();
            if(keys[keyIndex].equals(key)){
                tempBook = entry.getValue();
                tempKey = key;
            }
        }
        long timeBefore = System.nanoTime();
        hashMapOfBooks.remove(tempKey);
        long timeAfter = System.nanoTime();
        long deletingTime=timeAfter-timeBefore;
        System.out.println("Książka :"+ tempBook +
                " została usunięta w czasie "+ deletingTime+" nanosekund\n");
    }


}