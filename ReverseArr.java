package bigOproblems;

import java.util.Arrays;

public class ReverseArr {
	
	static void reverseArray(int[] arr) {
		for(int i=0; i<arr.length/2;i++) {            // --> o(N/2)
			int other = arr.length-i-1;				  // --> o(1)
			int temp = arr[i];						  // --> o(1)	
			arr[i] = arr[other];					  // --> o(1)
			arr[other] = temp;						  // --> o(1)
		}
		System.out.println(Arrays.toString(arr));	  // --> o(1)
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		reverseArray(array);
		System.out.println("time complexity o(N)"); 
	}

}
