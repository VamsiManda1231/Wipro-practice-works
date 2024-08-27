import java.util.*;
public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rs = Runtime.getRuntime();
		System.out.println("Free memory in java garbage collectipon: "+rs.freeMemory());
		rs.gc();
		System.out.println("Free memory after Garbage collection: "+rs.freeMemory());
	}

}
