//Q1. Write a Java code snippet that comprises a Car class and a CarTester class. The Car class 
//should define private fields for make and model, along with a parameterized constructor and 
//getter/setter methods for these attributes. In the CarTester class, instantiate two instances of 
//the Car class: myCar1 with a specified make and model, and myCar2 with null values. After 
//instantiation, the CarTester class should retrieve and print the initial make and model of both 
//cars. Then, it should set new values for myCar2 using setter methods and print the updated 
//make and model.

package Assign_2;
class car{
    private String model; //model or name of the car
    private int make;   //model number

    car(String model, int make){
        this.model=model;
        this.make=make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
     public int getMake() {
         return make;
     }
     public void setMake(int make) {
         this.make = make;
     }   
    }


public class Q1 {
    public static void main(String[] args) {
        car c=new car("Audi", 10);
         System.out.println("The model of the car is: "+c.getModel());
         System.out.println("The model number of the car is: "+c.getMake());

        car c2 =new car(null,0);
        c2.setModel("XUV");
        c2.setMake(11);
        System.out.println("The new model of the car is: "+c2.getModel());
         System.out.println("The new model number of the car is: "+c2.getMake());
    }
   
}
