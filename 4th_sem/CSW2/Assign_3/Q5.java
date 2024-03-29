//	Q5. Write a program to create a Student class with members name, rn, and
//	total mark. Create an array of student objects and sort it using Bubble
//	sort according to its rn.
//	Note: Overload compareTo method of Comparable interface.

//code

class Student1 implements Comparable <Student1> {
    private String name;
    private int rn;
    private int totalMark;

    Student1(String name, int rn, int totalMark) {
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
    public int compareTo(Student1 otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn);
    }
    @Override
    public String toString() {
        return "Name of the student: " + name + ", Roll Number: " + rn + ", Total Marks secured: " + totalMark;
    }
    public static void bubbleSort(Student1[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    Student1 temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Student1[] students = new Student1[5];
	        students[0] = new Student1("Dibyajyoti", 52, 85);
	        students[1] = new Student1("Rahul", 50, 75);
	        students[2] = new Student1("Nabin", 62, 90);
	        students[3] = new Student1("Rudra", 60, 80);
	        students[4] = new Student1("Surya", 31 , 95);

	        Student1.bubbleSort(students);
	        System.out.println("Sorted Students (by roll number):");
	        for (Student1 student : students) {
	            System.out.println(student);
	        }
	    }
	}
	
