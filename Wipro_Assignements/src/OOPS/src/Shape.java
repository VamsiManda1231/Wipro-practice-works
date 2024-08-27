
public class Shape {
	
	void draw() {
		System.out.println("Drawing shape");
	}
	void erase() {
		System.out.println("Erasing shape");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
class Traingle extends Shape{
	void draw() {
		System.out.println("Drawing Traingle");
	}
	void erase() {
		System.out.println("Erasing Traingle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape st = new Square();
		Shape t = new Traingle();
		Shape c = new Circle();
		
		st.draw();
		t.draw();
		c.draw();
		
		st.erase();
		c.erase();
		t.erase();
	}

}
