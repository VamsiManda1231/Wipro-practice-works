
public class Upper_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4) {
			System.out.print("Provide exact values");
		}
		String arg1=args[1].toUpperCase();
		String arg2=args[2].toLowerCase();
		System.out.println(arg1);
		System.out.println(arg2);		
		String arg = args[0];
		switch (arg) {
		case "r":
			System.out.println("Red");
			break;
		case "b":
			System.out.println("blue");
			break;
		case "g":
			System.out.println("green");
			break;
		case "o":
			System.out.println("orange");
			break;
		case "y":
			System.out.println("yellow");
			break;
			
		case "w":
			System.out.println("white");
			break;
		}
		String args3=args[3];
		int args3a=Integer.parseInt(args3);
		switch (args3a) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("apr");
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		}
	}
	
}
