// 3. Write a Java code snippet that comprises of a Car class and a CarApp
// class. The Car class should define private fields for ModalNo(int), 
// name(string) and stock(int). Define a parameterised constructor and 
// override the compareTo method as public int compareTo(Car car) to 
// sort the car on basis of the total number of stock. Create an ArrayList of 
// Car objects and print the updated the sorted list.
// For example the list of sorted Car Objects
// 2013 creta 10 
// 2020 MG 13
// 2018 Kia 20
// 2017 Audi 45
// 2015 BMW 55

import java.util.*;
class Car implements Comparable<Car>{
    private int ModelNo;
    private String name;
    private int stock;

    Car(int ModelNo, int stock,String name){
        this.name=name;
        this.ModelNo=ModelNo;
        this.stock=stock;
    }
    public int getModelNo() {
        return ModelNo;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public int compareTo(Car car){
        return this.stock- car.stock;
        
    }
    public String toString(){
        return ModelNo +" "+ name+ " "+ stock;
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> c = new ArrayList<>();
        c.add(new Car(2004, 10, "BMW"));
        c.add(new Car(2013, 10, "Creta"));
        c.add(new Car(2020, 13, "MG"));
        c.add(new Car(2018, 20, "KIA"));
        c.add(new Car(2017, 45, "AUDI"));
        Collections.sort(c);
        System.out.println("List of sorted Car objects: ");
        for(Car car : c){
            System.out.println(car);
        }
    }
}
