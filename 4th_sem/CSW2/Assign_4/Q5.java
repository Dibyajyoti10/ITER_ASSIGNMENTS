// 5. Create a Class Book that has id, name, author and quantity for each book 
// issued. The Book class should define a parameterised constructor. Design
// a class Library that create a HashMap of books which contains an entry 
// of key as Integer and value as Book object. Instantiate atleast two Book
// objects and display the collection of books in the HashMap. Use proper 
// method of HashMap class to return the following things 
// (a.)Check if a particular book name is present in the map
// (b.) remove the value associated with a particular key value which will
// remove the book entry.

import java.util.*;
class Book{
    private String name;
    private String author;
    private int id;
    private int quantity;

    Book(String name, String author, int id,int quantity){
        this.name=name;
        this.author=author;
        this.id=id;
        this.quantity=quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
        
    }
}
class Library{
    private HashMap<Integer, Book> books;
    public Library(){
        books=new HashMap<>();

    }
    public void addBook(int id, Book book){
        books.put(id, book);
    }
    public void displayBooks(){
        System.out.println("Library books: ");
        for(Map.Entry<Integer, Book> m : books.entrySet()){
            System.out.println("ID: "+m.getKey()+" , "+ m.getValue());
        }
    }
    public boolean containsBook(String bookName){
        for(Book book : books.values()){
            if(book.getName().equals(bookName)){
                return true;
            }
        }
        return false;
    }
    public void removeBook(int id){
        if(books.containsKey(id)){
            books.remove(id);
            System.out.println("Book with id: "+id+" removed from the library.");

        }
        else{
            System.out.println("Book with id: "+id+" not found in the library.");
        }
    }
}
public class Q5 {
    public static void main(String[] args) {
        Library lib= new Library();
        Book b1= new Book("wings Of Fire", "DR. A.P.J. Abdul kalam", 101, 10);
        Book b2= new Book("Undefined one-sided love", "Dibyajyoti Rautaray", 102, 100);
        lib.addBook(1, b1);
        lib.addBook(2, b2);
        lib.displayBooks();
        String searchBookName = "Undefined one-sided love";
        if(lib.containsBook(searchBookName)){
            System.out.println("The book: "+ searchBookName+" is present in the Library.");

        }
        else{
            System.out.println("The book: "+ searchBookName+" is not found in the Library.");
        }
        int removeId=1;
        lib.removeBook(removeId);
        lib.displayBooks();
    }

}
