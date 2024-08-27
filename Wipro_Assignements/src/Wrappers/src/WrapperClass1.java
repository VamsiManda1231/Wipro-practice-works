import java.util.*;
public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Integer range
		        System.out.println("Integer range:");
		        System.out.println("min: " + Integer.MIN_VALUE);
		        System.out.println("max: " + Integer.MAX_VALUE);
		        System.out.println();

		        // Double range
		        System.out.println("Double range:");
		        System.out.println("min: " + Double.MIN_VALUE);
		        System.out.println("max: " + Double.MAX_VALUE);
		        System.out.println();

		        // Long range
		        System.out.println("Long range:");
		        System.out.println("min: " + Long.MIN_VALUE);
		        System.out.println("max: " + Long.MAX_VALUE);
		        System.out.println();

		        // Short range
		        System.out.println("Short range:");
		        System.out.println("min: " + Short.MIN_VALUE);
		        System.out.println("max: " + Short.MAX_VALUE);
		        System.out.println();

		        // Byte range
		        System.out.println("Byte range:");
		        System.out.println("min: " + Byte.MIN_VALUE);
		        System.out.println("max: " + Byte.MAX_VALUE);
		        System.out.println();

		        // Float range
		        System.out.println("Float range:");
		        System.out.println("min: " + Float.MIN_VALUE);
		        System.out.println("max: " + Float.MAX_VALUE);
		        
		        System.out.println();
		        System.out.println();
		        //to print the binary
		        if(args.length==0) {
		        	System.out.println("Provide the args");
		        }
		        try {
		        	int a = Integer.parseInt(args[0]);
		        	System.out.println("The given number:"+a);
		        	System.out.println("The binary number:"+Integer.toBinaryString(a));
		        	System.out.println("The octal number:"+Integer.toOctalString(a));
		        	System.out.println("The Hexadecimal number:"+Integer.toHexString(a));
		        }catch (NumberFormatException e) {
		        	System.out.print("Provide the integer as arg!");
		        }
		        
		        System.out.println();System.out.println();
		        //to print the binary format
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Provide the number:");
		        int a = sc.nextInt();
		        if(a>1 || a<255) {
		        String b = Integer.toBinaryString(a);
		        String c = String.format("%9s", b).replace(' ','0');
		        System.out.println(c);
		        
		        }
		    }
}
