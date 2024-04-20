// Q6. Library System Assignment:
// Task: Develop a Java program for a library system incorporating encapsulation, abstraction, 
// and inheritance.
// i. LibraryResource Class:
//  - Abstract class with private attributes for title and author.
//  - Constructor, getters, setters, and an abstract method displayDetails().
// ii. Book Class:
//  - Subclass of LibraryResource with additional attribute pageCount.
//  - Constructor, getters, setters, and displayDetails() method override.
// iii. Magazine Class:
//  - Subclass of LibraryResource with additional attribute issueDate.
//  - Constructor, getters, setters, and displayDetails() method override.
// iv. DVD Class:
//  - Subclass of LibraryResource with additional attribute duration.
//  - Constructor, getters, setters, and displayDetails() method override.
// v. LibrarySystem Class (Main):
//  - Instantiate various library resources (e.g., Book, Magazine, DVD).
//  - Call displayDetails() for each instance to show resource information

package Assign_2;
abstract class LibraryResource{
    private String title;
    private String author;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    abstract void displayDetails();
}
class Book extends LibraryResource{
    int pageCount;

    Book(int pageCount){
        this.pageCount=pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("The number of pages in the book are: "+pageCount); 
    };

}
class Magazine extends LibraryResource{

    String issueDate;

    Magazine(String issueDate){
        this.issueDate=issueDate;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    @Override
    void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("The date of issuing the book is: "+issueDate);
    }
    
}
class DVD extends LibraryResource{
    int duration;

    DVD(int duration){
        this.duration=duration;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    void displayDetails() {
        // TODO Auto-generated method stub
        System.out.println("The duration of taking the book is: "+duration+" hours.");
    }
    
}
public class Q6 {
    public static void main(String[] args) {
        // LibraryResource l= new LibraryResource() ;
        // l.setTitle("Wings of Fire");
        // l.setAuthor("DR. A.P.J. Abdul kalam");
        // l.displayDetails();
        // System.out.println("The name of the book is: "+l.getTitle()+" and its author is: "+l.getAuthor());
        Book b=new Book(150);
        Magazine m= new Magazine("15-11-2024");
        DVD d=new DVD(3600);
        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}


//output
//The number of pages in the book are: 150
//The date of issuing the book is: 15-11-2024
//The duration of taking the book is: 3600 hours.
