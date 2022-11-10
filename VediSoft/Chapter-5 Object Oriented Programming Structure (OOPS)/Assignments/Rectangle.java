import java.util.Scanner;
class Rectangle extends Point {
	protected int width;
	protected int height;

	public Rectangle() {
		super(10,10);
		width = 10;
		height = 10;
	}
	
//	public Rectangle(int x, int y) {
//		super(x, y);
//		width = 10;
//		height = 10;
//	}

	public Rectangle(int width, int height) {
		super(10,10);
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p) {
		super(p.getX(), p.getY());
		width = 10;
		height = 10;
	}

	public Rectangle(Point p, int width, int height) {
		super(p.getX(), p.getY());
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Width : ");
		width = in.nextInt();
		System.out.println("Enter Height : ");
		height = in.nextInt();
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Width = " +width);
		System.out.println("Height = " +height);
	}

	public int getArea() {
		return width * height;
	}

	public int getPerimeter() {
        	return 2 * (width + height);
    	}

	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(10,20,30,40);
		Point p = new Point(5,6);
		Rectangle r2 = new Rectangle(p,30,40);
		
		r1.showData();
		r2.showData();

		r.acceptData();

		System.out.println("Area = " +r.getArea());
		System.out.println("Perimeter = " +r.getPerimeter());
	}

}