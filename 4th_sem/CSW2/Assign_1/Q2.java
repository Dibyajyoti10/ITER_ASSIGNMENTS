//Q2)Write a program to create an employee application that supports basic
//operations like setting employee details and displaying employee details.
//Note: Tell the student to solve this question using the process of Q1.

    
package Assign_1;

class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double salary;
    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Dibyajyoti Rautaray", 18095, "cse", 50000.0);
        System.out.println(emp.getName());
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getSalary());
    }
}


//output:
//Dibyajyoti Rautaray
//18095
//cse
//50000.0
