// Q3. Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a 
// parameterized constructor to initialize these attributes. Implement a copy constructor to 
// create a new point object with the same attribute values. Ensure that modifications made to one 
// object do not affect the other. Utilize getter and setter methods to retrieve and update the 
// attribute values


package Assign_2;
class point{
    int valX;
    int valY;

    point(int valX, int valY){
        this. valX=valX;
        this.valY=valY;
        System.out.println("The value of X and Y before copying: "+valX+" , "+valY);
    }
    public int getValX() {
        return valX;
    }
    public void setValX(int valX) {
        this.valX = valX;
    }
    public int getValY() {
        return valY;
    }
    public void setValY(int valY) {
        this.valY = valY;
    }
    point(point p){
        System.out.println("The value of X and Y after copying: "+p.getValX()+" , "+p.getValY());

    }
}
public class Q3 {
    public static void main(String[] args) {
        point p1=new point(9, 7);
        point p2=new point(p1);
    }
}


// output:
// The value of X and Y before copying: 9 , 7
// The value of X and Y after copying: 9 , 7