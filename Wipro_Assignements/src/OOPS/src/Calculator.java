
public class Calculator {
	//static method to calculate the int power
	public static int powerInt(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	//static method to calculate double power 
	public static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//passing the values to the method arguments	
		int resultint = Calculator.powerInt(3, 2);
		System.out.println(resultint);
		double resultdouble = Calculator.powerDouble(4.0,2.0);
		System.out.println(resultdouble);
	}

}
