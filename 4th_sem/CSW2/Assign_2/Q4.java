// Q4. Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class 
// defines private fields model and price, alongside setter methods for each attribute. 
// Additionally, it overrides the toString() method to return a string representation of the laptop's 
// model and price. In the Main class, create an instance of Laptop, setting its model using the 
// setter method. Then, print the laptop object using the toString() method. Describe the 
// functionality of the toString() method in the Laptop class and explain how it is utilized in the 
// Main class.


package Assign_2;
class Laptop{
    private String model;
    private int price;

    Laptop(String model, int price){
        this.model=model;
        this.price=price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return model+" "+ price;
        
    }
}
public class Q4 {
    public static void main(String[] args) {
        Laptop l=new Laptop(null, 0);
        l.setModel("HP G8 Notebook");
        l.setPrice(48000);
        System.out.println("The model of the Laptop is: "+l.getModel()+" and its price is: "+l.getPrice());
        Laptop l2 =new Laptop(null, 0);
        l2.setModel("Macbook Air m3");
        l2.setPrice(150000);
        System.out.println("The model of the 2nd Laptop is: "+l2.getModel()+" and its price is: "+l2.getPrice());

    }
}
