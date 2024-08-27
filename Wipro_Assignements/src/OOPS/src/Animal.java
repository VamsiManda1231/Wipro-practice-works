
public class Animal {
	public String eat(String a) {
		return a;
	}
	public String sleep(String a) {
		return a;
	}
}
//creating boird class inherited from animal
class Birds extends Animal{
	//overriding the parent class methods
	public String eat(String a) {
		return a;
	}
	public String sleep(String a) {
		return a;
	}
	public String fly(String a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instances for methods in animal class
		Animal x = new Animal();
		Birds y = new Birds();
		String x1 = x.eat("The animal eats");
		String x2 = x.sleep("The animal sleeps");
		//instances for methods in bird class
		String y1=y.eat("The bird eats");
		String y2=y.sleep("The bird sleeps");
		String y3=y.fly("The bird flys");
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
	}

}
