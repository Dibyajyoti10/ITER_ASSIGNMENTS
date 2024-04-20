// Q8. Write a Java program that illustrates the concepts of interfaces, method overriding, and 
// method overloading. Begin by defining an interface named Vehicle with two abstract methods: 
// accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement 
// the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print 
// appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the 
// Bicycle class, override the same methods to display messages specific to a bicycle's 
// acceleration and braking. Additionally, implement method overloading in both classes by 
// providing multiple versions of the accelerate() method, each accepting different parameters 
// such as speed and duration. Finally, create a Main class to instantiate objects of both Car and 
// Bicycle classes, test their overridden methods, and demonstrate method overloading by 
// invoking different versions of the accelerate() method

package Assign_2;
interface Vehicle{
    abstract void accelerate();
    abstract void brake();

}
class Car implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("car accelerate");
    }
    @Overload
    public void accelerate(int duration){
        System.out.println("car running for the duration "+duration+" hours");
    }

    @Override
    public void brake() {
        System.out.println("Applying brake in car");
    }
    
}
class Bicycle implements  Vehicle{
    public void accelerate(){
        System.out.println("Accelerating the bicycle");
    }
    public void accelerate(int speed){
        System.out.println("The speed of the bicycle is: "+speed);
    }

    @Override
    public void brake() {
       System.out.println("Applying brake to the cycle");
    }

}
public class Q8 {
    public static void main(String[] args) {
        Car c=new Car();
        Bicycle b=new Bicycle();
        c.accelerate();
        c.accelerate(5);
        c.brake();
        b.accelerate();
        b.accelerate(50);
        b.brake();

    }
}



//output
// accelerating the car
// car runing for the duration 5 hours
// applying break in car
// accelerating the bicycle
// The speed of the bicycle is 50
// applying break in cycle