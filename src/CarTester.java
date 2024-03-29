class Car{
	private String make;
	private String model;
	public Car(String make,String model) {
		this.make = make;
		this.model = model;
	}
	public Car() {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
 class CarTester{
	 	public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Car car1  = new Car("Mahindra","Scorpio");
		 Car car2  = new Car();
		 System.out.println("Previous company "+car1.getMake()+"  "+" and its model: "+ car1.getModel());
		 System.out.println(car2.getMake()+"  "+ car2.getModel());
		 
		 car2.setMake("Volkswagen");
		 car2.setModel("Lamborghini");
		 System.out.println("New company "+car2.getMake()+"  "+" and its model: "+ car2.getModel());
	 }
	
}

