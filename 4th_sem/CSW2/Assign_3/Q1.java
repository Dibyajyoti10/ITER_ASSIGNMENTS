//	Q1 Write a program to create a Student class that has members, name, roll
//	number, and age. Design the Student class in such a way that it can take
//	the roll number as an integer or string. Create a driver class that creates
//	student objects and invokes the methods.

//code
class Student{
	 String name;
	 String rollno;
	 int age;
	
	public Student(String name, int age, Object rollno) {
		this.name=name;
		this.age=age;
		this.rollno=rollno.toString();
	}
	public void displayDetails() {
		System.out.println("Name of the student is : "+name+ " his roll number is: "+rollno+" and of age: "+age);
	}
	
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("Dibyajyoti",19,52);
		Student s2=new Student("Amir",19,53);
		
		s.displayDetails();
		s2.displayDetails();
	}

	
	

	}
