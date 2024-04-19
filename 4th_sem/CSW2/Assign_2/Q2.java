//Q2. Design a Java class called Rectangle with private attributes length and width. Include a 
//constructor to initialize these attributes, as well as setter and getter methods for each attribute. 
//Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a 
//main method to create an object of the Rectangle class, set values for its attributes, and display 
//the area and perimeter


package Assign_2;
class Rectangle{
    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return length*width;
    }
    public int getPerimeter(){
        return 2*(length + width);
    }
}
public class Q2 {
    public static void main(String[] args) {
     Rectangle r =new Rectangle(5, 4);   
     System.out.println("The area of the Rectangle is: "+r.getArea());
     System.out.println("The perimeter of the Rectangle is: "+r.getPerimeter());
    r.setLength(6);
    r.setWidth(5);
    System.out.println("The new area of the Rectangle is: "+r.getArea());
     System.out.println("The new perimeter of the Rectangle is: "+r.getPerimeter());
    }
}

//output:
//The area of the Rectangle is: 20
//The perimeter of the Rectangle is: 18
//The new area of the Rectangle is: 30
//The new perimeter of the Rectangle is: 22

