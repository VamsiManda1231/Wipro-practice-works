
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		for(int row=1;row<=9;row++){
			for(int space=10-row;space>0;space--){
				System.out.print(" ");
		    }
		    for(int num=1;num<=row;num++){
		    	System.out.print(num);
		    }
		    for(int num=row-1;num>0;num--){
		        System.out.print(num);
		    }
		    System.out.println();
		}
		for(int row=10;row<=20;row++){
		    for(int space=0;space<row-10;space++){
		        System.out.print(" ");
		    }
		    for(int num=1;num<=20-row;num++){
		        System.out.print(num);
		    }
		    for(int num=20-row-1;num>=1;num--){
		        System.out.print(num);
		    }
		    System.out.println("");
		}
    }
}
