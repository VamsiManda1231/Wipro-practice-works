
public class String_Args {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=5) {
			System.out.print("Print exactly two arguments!!");
		}
		String args1=args[0];
		String args2=args[1];
		System.out.println(args[0]+" "+"Technologies"+" "+args[1]);
		String args3=args[2];
		System.out.println("Welcome "+args[2]);
		String args4=args[3];
		int args4a=Integer.parseInt(args4);
		String args5=args[4];
		int args5a=Integer.parseInt(args5);
		int sum=args4a+args5a;
		System.out.println("The sum of "+args4a+" and "+args5a+" is "+sum);

	}

}
