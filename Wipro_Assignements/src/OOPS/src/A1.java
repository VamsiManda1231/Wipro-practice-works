
public class A1 {
	A1(){
		System.out.println("A!'s no args");
	}A1(int a){
		System.out.println("A1's 1 args"+a);
	}
}
class B1 extends A1{
	B1(){ 
		System.out.println("B1's no args");
	}
	B1(int b){
		
		System.out.println("B1's 1 args"+b);
	}
}
class C1 extends B1{
	C1(){ super(5000);
		System.out.println("C1's no args");
	}
	C1(int c){
		super(1000);
		System.out.println("C1's 1 args"+c);
	}
}
class Testing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 x = new C1(10);
	}

}
