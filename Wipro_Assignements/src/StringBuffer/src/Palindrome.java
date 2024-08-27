
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length==0) {
			System.out.println("Provide the exact args");
		}
		String a = args[0];
		StringBuffer sb = new StringBuffer(a);
		String r = sb.reverse().toString();
		if(a.equals(r)) {
			System.out.println(a+" is palindrome");
		}else {
			System.out.println(a+" is not palindrome");
		}
	}

}
