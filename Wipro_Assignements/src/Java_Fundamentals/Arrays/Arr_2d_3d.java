
public class Arr_2d_3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to reverse the elements in 2d array
		if (args.length != 4) {
            System.out.println("Please provide exactly 4 integers as command line arguments.");
        }
		
        int[][] arr = {
            {Integer.parseInt(args[0]), Integer.parseInt(args[1])},
            {Integer.parseInt(args[2]), Integer.parseInt(args[3])}
        };
        System.out.println("Original 2D Array:");
        printArray(arr);

        int temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;
        System.out.println("\nReversed 2D Array:");
        printArray(arr);
    }
    // Method to print the 2D array
	public static void printArray(int[][] arr) {
        for (int row=0;row<arr.length;row++) {
            for (int col=0;col<arr[row].length;col++) {
                System.out.print(arr[row][col] + " ");
            	}
            System.out.println();
        	}
		} 
}	
   
