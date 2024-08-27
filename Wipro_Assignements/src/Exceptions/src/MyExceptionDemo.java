public class MyExceptionDemo {
	
	public static void main(String[] args) throws MyException {
		try {
			int age =Integer.parseInt(args[0]);
			if(age<18)
				throw new MyException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception: "+e);
		}
		catch(MyException e) {
			System.out.println("Exception: "+e);
		}
		
		System.out.println("All Ok!");
		}
		
	}	

