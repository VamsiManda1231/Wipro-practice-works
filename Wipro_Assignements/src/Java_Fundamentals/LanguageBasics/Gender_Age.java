
public class Gender_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("Give exact values");
		}
		String age=args[0];
		String gender1=args[1];
		int age1=Integer.parseInt(age);
		if(gender1=="Female") {
			if(age1<=58) {
				System.out.println("Percentage of Intrest is 8.2%");
			}else {
				System.out.println("Percentage of Intrest is 9.2%");
			}
		}
		if(gender1=="Male") {
			if(age1<=58) {
			System.out.print("Percentage of Intrest is 8.4%");
		}else {
			System.out.println("Percentage of Intrest is 10.5%");
			}
		}
	}
}
