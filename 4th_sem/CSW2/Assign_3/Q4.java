//	Q4. Write a program to create a Student class with members name, rn, and
//	totalMark. Create an array of student objects and search a student object
//	using linear search from the array.
//	Note: Overload compareTo method of Comparable interface.

//code

class STUDENT2 implements Comparable <STUDENT2> {
    private String name;
    private int rn;
    private int totalMark;

    STUDENT2(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rn;
    }
    public int getTotalMark() {
        return totalMark;
    }
    @Override
    public int compareTo(STUDENT2 otherSTUDENT2) {
        return Integer.compare(this.rn, otherSTUDENT2.rn);
    }

    @Override
    public String toString() {
        return "Name of the student: " + name + ", Roll Number: " + rn + ", Total Marks secured: " + totalMark;
    }
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		STUDENT2[] s = new STUDENT2[3];
	        s[0] = new STUDENT2("Dibyajyoti", 52, 85);
	        s[1] = new STUDENT2("Jagan", 53, 75);
	        s[2] = new STUDENT2("Mohan", 54, 80);
	        int search = 52; // Example roll number to search
	        boolean found = false;
	        for (STUDENT2 stu : s) {
	            if (stu.getRollNumber() == search) {
	                System.out.println("Student found:");
	                System.out.println(stu);
	                found = true;
	                break;
	            }
	        }
	        if (found==false) {
	            System.out.println("Student with roll number " + search + " not found.");
	        }
	    }
	
	}


