// Q5. Developing a Simple College Management System in Java
// Create a Java program for managing colleges and students. The provided classes model the 
// relationship between colleges and students.
// The College class represents a college with attributes collegeName and collegeLoc. The 
// Student class represents a student with attributes studentId, studentName, and a reference
// to a College object. Enhance the Student class by adding a constructor that assigns a student 
// ID, name, and college information. Additionally, add a method named displayStudentInfo()
// that prints the student's ID, name, and the college information in which they are enrolled.
// In the Main class, instantiate at least two College objects and at least two Student objects. 
// Enroll each student in one of the colleges. Then, display the information of all colleges and all 
// students using the appropriate methods.


package Assign_2;
class college{
    private String collegeName;
    private String collegeLoc;

     college(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
    public String getcllgName(){
         return collegeName;
    }
    public String getcllgLoc(){
        return collegeLoc;
    }

}
class student {
    private int studentId;
    private String studentname;

    college col;

    student(int studentId,String studentname,college col){
        this.studentId=studentId;
        this.studentname=studentname;
        this.col=col;
    }

    public void displayStudentInfo(){
        System.out.println("Id of the student is "+ studentId);
        System.out.println("Name of the student is "+studentname);
        System.out.println("college info of the student is "+ col.getcllgName() + " and " + col.getcllgLoc());
    }

}
public class Q5 {
    public static void main(String[] args) {
        college c1=new college("ITER","Khandagiri");
        
        student s1=new student(18095,"Dibyajyoti",c1);
        
        s1.displayStudentInfo();
        
    }
}

// output:
// Id of the student is 18095
// Name of the student is Dibyajyoti
// college info of the student is ITER and Khandagiri