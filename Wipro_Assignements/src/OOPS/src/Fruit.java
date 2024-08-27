
public class Fruit {
	private String name;
	private String taste;
	private String size;
	
	public Fruit(String name, String taste, String size) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	//using setters and getters
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	public String getTaste() {
		return taste;
	}
	void setTaste(String taste) {
		this.taste=taste;
	}
	public String getSize() {
		return size;
	}
	void setSize(String size) {
		this.size=size;
	}
	public void eat() {
        System.out.println("The " + name + " is " + taste + ".");
	}
}
class Apple extends Fruit{
	 Apple(String size){
		super("apple","sweet",size);
	}
	public void eat() {
		System.out.println("The " + getName() + " is " + getTaste() + " and " + getSize() + " in size.");	
		}
}

class Orange extends Fruit{
	Orange(String size) {
		super("Orange","sour",size);
	}
	public void eat() {
		System.out.println("The " + getName() + " is " + getTaste() + " and " + getSize() + " in size.");	}

}
