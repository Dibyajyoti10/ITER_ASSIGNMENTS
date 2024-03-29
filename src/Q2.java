class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double calculatePerimeter() {
		return 2*length*width;
		
	}
	public double calculateArea() {
		return length*width;
		
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle R=new Rectangle(5.0,4.0);
		System.out.println("Previous length "+R.getLength()+"  "+"Previous width "+R.getWidth());
		System.out.println("Perimeter: "+R.calculatePerimeter());
		System.out.println("Area: "+R.calculateArea());
		R.setLength(6.0);
		R.setWidth(5.0);
		System.out.println("New length "+R.getLength()+"  "+"New width "+R.getWidth());
		System.out.println("New Perimeter: "+R.calculatePerimeter());
		System.out.println("New Area: "+R.calculateArea());
	}

}
