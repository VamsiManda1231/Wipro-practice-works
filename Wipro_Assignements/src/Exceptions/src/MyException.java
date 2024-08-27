public class MyException extends Exception {
	public MyException(){
		System.out.println("User defined exception thrown");
	}
	public String toString() {
		return "My exception object: age cannot be <18";
	}
}

