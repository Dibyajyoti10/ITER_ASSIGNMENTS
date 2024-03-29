//Q2

class Book {
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public String toString() {
        return "Book ID is: " + bookId + " and Book Name: " + bookName + " its Price: " + price;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return bookId == other.bookId && Double.compare(other.price, price) == 0 && bookName.equals(other.bookName);
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }
}

public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Book1", 200.00);
        Book book2 = new Book(102, "Book2", 150.00);

        System.out.println("Details of Book 1:");
        System.out.println(book1);

        System.out.println("Details of Book 2:");
        System.out.println(book2);

        // Comparing books based on price
        if (book1.getPrice() > book2.getPrice()) {
            System.out.println("Book 1 is more expensive than Book 2");
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println("Book 2 is more expensive than Book 1");
        } else {
            System.out.println("Both books have the same price");
        }
    }
}