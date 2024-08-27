
public class For_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to print numbers frm 1 to 10 in a row with tab space
		for(int i=0;i<=10;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println();
		
		//primes between 23 and 57
		for(int i=23;i<57;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println();
		
		//to check if a number is prime or not
		String args1=args[0];
		int args1a=Integer.parseInt(args1);
		boolean flag=false;
		if(args1a==0) {
			System.out.println("Enter valid number");
		}
		for(int i=2;i<=args1a;i++) {
			if(args1a%i==0) {
				flag = true;
				}
			}
		if(!flag) {
			System.out.println(args1a+" is not a prime");
		}else {
			System.out.println(args1a+" is a prime");
		}
		System.out.println();
		System.out.println();
		
		//primes between 10 and 99
		for(int i=10;i<=99;i++) {
			for(int j=2;j<=99;j++) {
				if(i%j==0) {
					System.out.println(i+" is a prime");
					break;
				}
			}
		}
		System.out.println();
		System.out.println();
		
		//sum of digits in a given number
				int num=12345;
				int sum=0;
				while(num!=0) {
					sum=sum+num%10;
					num=num/10;
				}
				System.out.println("Sum is "+sum);
	}
}

