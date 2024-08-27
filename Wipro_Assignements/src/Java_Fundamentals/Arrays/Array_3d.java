
public class Array_3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print the largest element in the 3d array
		int[][]arr= {
			{Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])},
			{Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5])},
			{Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8])},
		};
		int largest=arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>largest) {
					largest=arr[row][col];
				}
			}
		}
		System.out.print("The largest element is: "+largest);
	}

}
