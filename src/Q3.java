class Point{
	private int X;
	private int Y;
	
	public Point(int X, int Y) {
		this.setX(X);
		this.setY(Y);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	public Point(Point other) {
		this.X=other.X;
		this.Y=other.Y;
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p=new Point(6, 7);
		System.out.println("Previous X "+p.getX()+"  "+" previous Y "+p.getY());
		p.setX(7);
		p.setY(8);
		Point p2=new Point(p);
		System.out.println("New X "+p.getX()+"  "+"New Y "+p.getY());
	}

}
