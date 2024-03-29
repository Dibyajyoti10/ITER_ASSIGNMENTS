class College{
	private String CollegeName;
	private String CollegeLoc;
	
	public College(String CollegeName,String CollegeLoc) {
		this.CollegeName=CollegeName;
		this.CollegeLoc=CollegeLoc;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public String getCollegeLoc() {
		return CollegeLoc;
	}
}
class Student{
	private int StudentId;
	private String StudentName;
	private College college;
	
	public Student(int StudentId, String StudentName,String string) {
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.college=college;
	}
	public void displayStudentInfo() {
		System.out.println("The name of the student is "+StudentName+" with id "+
				StudentId +" of college "+college.getCollegeName()+
				" and its location is at "+college.getCollegeLoc());
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c=new College("ITER", "BBSR");
		Student s=new Student(18095,"Dibyajyoti","ITER");
		System.out.println("College Name: "+c.getCollegeName()+" and its location: "+c.getCollegeLoc());
		s.displayStudentInfo();
	}

}
