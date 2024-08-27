
public class FlowControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=4) {
			System.out.println("Provide exactly required args!!");
		}
		String args1=args[0];
		int args1a=Integer.parseInt(args1);
		if(args1a>=0) {
			System.out.println(args1+" It is positive");
		}else {
			System.out.println(args1+" It is negative");
		}
		String args2=args[1];
		int args2a=Integer.parseInt(args2);
		if(args2a%2==0) {
			System.out.println(args2a+" is even number");
		}else {
			System.out.println(args2a+" is odd number");
		}
		String args3=args[2];
		int args3a=Integer.parseInt(args3);
		String args4=args[3];
		int args4a=Integer.parseInt(args4);
		int last=args4a%10;
		if(args3a==last) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		for(int i=0;i<5;i++) {
				System.out.println();
		}
		if(args.length==0) {
			System.out.println("No Values!!");
		}else {
			for(int i=0;i<args.length;i++) {
				System.out.print(args[i]+", ");
			}
			System.out.println("Number of arguments: "+args.length);
		}

	}

}
