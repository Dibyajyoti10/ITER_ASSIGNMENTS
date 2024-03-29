class Car implements Comparable <Car>{
	private String model;
	private String color;
	private double speed;
	
	Car(String model, String color, double speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public double getSpeed() {
		return speed;
	}
	@Override
	public int compareTo(Car otherCar) {
		return Double.compare(this.speed, otherCar.speed);
	}
	@Override
	public String toString() {
		return "Model of the car: "+model+" , its color is: "+color+" travelling at a speed of: "+speed;
		
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c= new Car("Lambourghini","Red",200.0);
		Car c2=new Car("Porsche","Black",150.0);
		
		System.out.println("Details of Car 1: ");
		System.out.println(c);
		
		System.out.println("Details of car 2: ");
		System.out.println(c2);
		
		int Result = c.compareTo(c2);
		if(Result>0) {
			System.out.println("Car 1 has a greater speed than Car 2.");
            System.out.println("Details of Car with greater speed:" + c);
        } else if (Result < 0) {
            System.out.println("Car 2 has a greater speed than Car 1.");
            System.out.println("Details of Car with greater speed:" + c2);
        } else {
            System.out.println("Both cars have the same speed.");
        }
		}
	}


