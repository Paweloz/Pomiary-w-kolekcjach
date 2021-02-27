import java.util.*;
class Book {
    private String title;
    private String author;
    //Konstruktor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    //Generowanie określonej ilości książek
    public Book[] genereteBooks(int quantity){
        String abc ="abcdefghijklmnopqrstuvwxyz";
        int size = abc.length();
        String tempTitle="";
        String tempAuthor="";
        Book[] books = new Book[quantity];
        Random titleGen =new Random();
        Random authorGen = new Random();
        for(int i=0;i<quantity;i++){
            for(int n=0;n<7;n++){
                tempTitle += abc.charAt(titleGen.nextInt(size));
                tempAuthor += abc.charAt(authorGen.nextInt(size));
            }
            books[i] = new Book(tempTitle, tempAuthor);
            tempTitle="";
            tempAuthor="";
        }
        System.out.println("Zostało wygenerowanych "+books.length+" książek");
        return books;
    }

    //Must have
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    @Override
    public String toString(){
        return "[ \"Książka : \""+title+"\" Autor : \""+author+" ]";
    }
    @Override
    public boolean equals(Object o){
        Book book = (Book) o;
        return (this.title.equals(book.getTitle()) && this.author.equals(book.getAuthor()));
    }
    @Override
    public int hashCode(){
        return 17 * title.hashCode() + 31*author.hashCode();
    }
}