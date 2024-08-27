import java.util.Arrays;

public class Arr_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstarray= {1,3,4,2,9,5};
		for(int i=0;i<=firstarray.length-1;i++) {
		System.out.print(firstarray[i]+",");
		}
		System.out.println();
		System.out.println();
		
		//to print sum and average of elements in the array
		int sum=0;
		int avg=0;
		for(int i=0;i<firstarray.length;i++) {
			sum+=firstarray[i];
			avg= sum/firstarray.length;
			}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+avg);
		System.out.println();
		System.out.println();
		
		//to find the min and max of the array
		int min=0,max=0;
		for(int i=0;i<firstarray.length;i++) {
			if(max>firstarray[i]) {
				max=firstarray[i];
			}
			
			if(min<firstarray[i]) {
				min=firstarray[i];
			}
		}
		System.out.println("The max number is "+max);
		System.out.println("The min number is "+min);
		System.out.println();
		System.out.println();
		
		//check if the element is present in the array
		String args1=args[0];
		int args1a=Integer.parseInt(args1);
		int index=-1;
		for(int i=0;i<firstarray.length;i++) {
			if(args1a==firstarray[i]) {
				index = i;
				break;
			}
		}if(index!=-1) {
				System.out.println("The index of the given element is "+index);
			}else {
				System.out.println(-1);
			}
		System.out.println();
		System.out.println();
		
		//to print the characters correspondent to the ascii values in the array
		int[] ascii={65,55,67,97,98,48,49,50};
		System.out.println("The ascii values are: "+" ");
		for(int i=0;i<=ascii.length;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nThe corresponding character values are: ");
		for(int i:ascii) {
			char character=(char) i;
			System.out.print(character+" ");
		}
		System.out.println();
		System.out.println();
		
		//to find the largest and smallest 2 elements in the array
		Arrays.sort(firstarray);
		int n=firstarray.length;
		System.out.println("The two largest elements are "+firstarray[n-1]+","+firstarray[n-2]);
		System.out.println("The two smallest elements are "+firstarray[0]+","+firstarray[1]);
		System.out.println();
		System.out.println();
		
		//to print the sorted array
		System.out.print("The sorted array is: ");
		for(int i=0;i<firstarray.length;i++) {
			System.out.print(firstarray[i]+" ");	
		}
		System.out.println();
		System.out.println();
		
		//to remove the duplicates in the arrays
		int[] arr=new int[] {3,1,2,2,3,5,4};
		Arrays.sort(arr);
		int j=0;
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!= arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++] = arr[arr.length-1]; 
		for (int i=0; i<j; i++){  
            arr[i] = temp[i];
		}
		System.out.println("No. of unique elements are "+j);
		System.out.print("The unique elements are: ");
		for(int i=0;i<j;i++) {
		System.out.print(+arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		/*to print the sum of the elements in the array except the elements in 
		between 6 and 7 if they are in succeeding order*/
		int[] arr1 = new int[] {1, 2, 6, 3, 9, 7, 4};
        int sum1 = 0;
        boolean skip = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 6) {
                skip = true;
            }
            if (!skip) {
                sum1 += arr1[i];
            }
            if (arr1[i] == 7 && skip) {
                skip = false;
            }
        }
        System.out.println("Sum of elements: " + sum1);
        System.out.println();
           
        //print true if every element in array are 1 and 4
        int[] arr3=new int[] {1,1,4,4,1,4};
        for(int i=0;i<arr3.length;i++) {
        	if( arr3[i]==4 || arr[i]==1) {
        		System.out.println(true);
        		break;
        	}else {
        		System.out.println(false);
        	}
        }
        System.out.println();
        
        //to print all the evens first and then all the odds
        int[] arr4=new int[] {1,3,4,2,7,8,5,0};
        System.out.println("To print the evens first and odds next: ");
        for(int i=0;i<arr4.length;i++) {
        	if(arr4[i]%2==0) {
        		 System.out.print(arr4[i]+" ");	
        	}
        }
        for(int i=0;i<arr4.length;i++) {
        if(arr4[i]%2!=0) {
        	System.out.print(arr4[i]+" ");
        	}
        }
        System.out.println();
        System.out.println();
        
        //to print 0 in place of 10s in the array
        int[] arr5=new int[] {1,10,3,10,10,9,6,10,5};
        System.out.print("{");
        for(int i=0;i<arr5.length;i++) {
        	if(arr5[i]%10!=0) {
        		System.out.print(arr5[i]+",");
        	}
        }
        for(int i=0;i<arr5.length;i++) {
        	if(arr5[i]%10==0) {
        		System.out.print(0+",");
        	}
        }
        System.out.print("}");
        System.out.println();
        System.out.println();
        
        /*forming new array from the middle elements present in the array 
          excluding first and last elements*/
        int[] arr6=new int[] {4,3,5};
        int[] arr7=new int[] {6,7,8};
        System.out.print("The first array: ");
        for(int i=0;i<arr6.length;i++) {
        System.out.print(arr6[i]+" ");
        }
        System.out.println("\nThe second array: ");
        for(int i=0;i<arr7.length;i++) {
        System.out.print(arr7[i]+" ");
        }
        System.out.print("\nThe middle elements are: "+"\n{");
        for(int i=1;i<arr6.length-1;i++) {
        		System.out.print(arr6[i]+",");
        	}
        for(int i=1;i<arr7.length-1;i++) {
    		System.out.print(arr7[i]);
        }
        System.out.print("}");
        System.out.println();
        System.out.println();    
	}
}
