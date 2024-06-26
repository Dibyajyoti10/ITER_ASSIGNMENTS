abstract class LibraryResource{
	private String title;
	private String author;
	
	public LibraryResource(String title,String author){
		this.setTitle(title);
		this.setAuthor(author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}
	public abstract void displayDetails();
		
	}
class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
     System.out.println("The book "+getTitle()+" was written by "+getAuthor()+" contains pages of "+getPageCount());

    }
}

	class Magazine extends LibraryResource {
	    private String issueDate;

	    public Magazine(String title, String author, String issueDate) {
	        super(title, author);
	        this.issueDate = issueDate;
	    }

	    public String getIssueDate() {
	        return issueDate;
	    }

	    public void setIssueDate(String issueDate) {
	        this.issueDate = issueDate;
	    }

	    @Override
	    public void displayDetails() {
			System.out.println("The magazine "+getTitle()+" was written by "+getAuthor()+" issued on "+getIssueDate());

	    }
	}
	class DVD extends LibraryResource {
	    private int duration;

	    public DVD(String title, String author, int duration) {
	        super(title, author);
	        this.duration = duration;
	    }

	    public int getDuration() {
	        return duration;
	    }

	    public void setDuration(int duration) {
	        this.duration = duration;
	    }

	    @Override
	    public void displayDetails() {
			System.out.println("The DVD "+getTitle()+" was composed by "+getAuthor()+" is of "+getDuration()+" minutes");

	    }
	}


public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b=new Book("Wings of Fire","APJ Abdul Kalam",500);
		Magazine m=new Magazine("India Today","Palme Dutt","March 4");
		DVD d =new DVD("openheimer","J.R. Openheimer",250);
		b.displayDetails();
		m.displayDetails();
		d.displayDetails();
		
	}

}
