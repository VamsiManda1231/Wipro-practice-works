
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String args1=args[0];
		int args1a=Integer.parseInt(args1);
		for(int row=1;row<=args1a;row++) {
			for(int i=0;i<row;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//to reverse a given number
		String args2=args[1];
		int args2a=Integer.parseInt(args2);
		int rev=0;
		while(args2a!=0) {
			int res=args2a%10;
			rev = rev*10+res;
			args2a=args2a/10;
		}
		System.out.println("The reversed number is "+rev);
		System.out.println();
		System.out.println();
		
		//to check palindrome
		String args3=args[2];
		int args3a=Integer.parseInt(args3);
		int temp=args3a;
		int rev2=0,r;
		while(args3a!=0) {
			 r=args3a%10;
			 rev2=rev2*10+r;
			args3a=args3a/10;
		}
		if(temp==rev2) {
			System.out.println(temp+" is a palindrome!");			
		}else {
			System.out.println(temp+" is not a palindrome!");
			}	
	}
}
