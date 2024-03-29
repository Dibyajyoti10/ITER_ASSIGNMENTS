class Laptop{
	private String model;
	private double price;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		System.out.println("The model of the Laptop is "+model+" and its price is "+price);
		return model;
	}
}
class Main{
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop lap=new Laptop();
		lap.setModel("HP G8 Notebook");
		lap.setPrice(54000.00);
		lap.toString();

	}


}