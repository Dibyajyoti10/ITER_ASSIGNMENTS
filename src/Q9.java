interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails();
}

// Student class
class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class
class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class implementing EnrollmentSystem interface
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println("Student " + student.getStudentName() + " enrolled in course " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println("Student " + student.getStudentName() + " dropped from course " + course.getCourseName());
        } else {
            System.out.println("Student " + student.getStudentName() + " is not enrolled in course " + course.getCourseName());
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("\nEnrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println("Student: " + enrolledStudents.get(i).getStudentName() +
                    ", Course: " + enrolledCourses.get(i).getCourseName());
        }
    }
}

// Main class
public class Q9 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();

        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");

        Course course1 = new Course(101, "Introduction to Java");
        Course course2 = new Course(102, "Database Management");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails();
    }
}