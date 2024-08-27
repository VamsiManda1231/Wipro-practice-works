
public class InheritanceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x = new A();
		B z = new B();
		x.m=10; x.n=20;
		System.out.println("The state of A: ");
		x.display1();
		z.n=10; z.m=19; z.c=12;
		System.out.println("The state of B: ");
		z.display1();
		z.display2();
		System.out.println("The sum is: ");
		z.sum();
	}

}
