
public class Character_Variables {
	public static void main(String args[]) {
		if(args.length==0) {
			System.out.print("No values!!");
			return;
		}
		String x =args[0];
		String y =args[1];
		if(x.compareTo(y)<0) {
			System.out.print(x+","+y);
		}else {
			System.out.print(y+","+x);
		}
	}
	
	

}
