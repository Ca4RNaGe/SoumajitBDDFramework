package inheritance;

public class TestRectangle {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.calArea("shape", 10, 20);
		
		System.out.println("=======================================");
		Rectangle rect=new Rectangle();
		rect.calArea("Rect", 40, 20);
		
		System.out.println("===================================");
		Shape s2=new Rectangle();
		s2.calArea("rectangle", 33, 10);

	}

}
