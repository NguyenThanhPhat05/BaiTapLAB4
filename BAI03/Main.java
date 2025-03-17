package BAI03;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape("blue", false);
		System.out.println(shape);
		
		Circle circle = new Circle(2.0, "green", true);
		System.out.println(circle);
		System.out.println("Dien tich: " + circle.getArea());
		System.out.println("Chu vi:" + circle.getPerimeter());;
		
		Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
		System.out.println(rectangle);
		System.out.println("Dien tich:" + rectangle.getArea());
		System.out.println("Chu vi:" + rectangle.getPerimeter());
		
		Square square = new Square(2.5, "purple", true);
		System.out.println(square);
		System.out.println("Dien tich:" + square.getArea());
		System.out.println("Chu vi:" + square.getPerimeter());
	}
}
