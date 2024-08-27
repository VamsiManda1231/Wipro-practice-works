
public class ConcatinateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = args[0];
		String b = args[1];
		if((a.charAt(a.length()-1)==b.charAt(0))) {
			String c =a.concat(b.substring(1));
		}
		String c = a.concat(" ").concat(b).toLowerCase();
		System.out.println(c);
	}

}
