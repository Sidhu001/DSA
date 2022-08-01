package bigOproblems;

public class arrayPairs {
	
	static void printPairs(int[] array) {
		for(int i=0; i<array.length;i++) {             //----> o(n)
			for(int j=0;j<array.length;j++) {          //----> o(n)
				System.out.println(array[i]+ " , "+ array[j]);     //----> o(1)
			}
		}
	}
	
	static void printPairsWithoutGoingLeft(int[] array) {
		for(int i=0; i<array.length;i++) {             //----> o(n)
			for(int j=i+1;j<array.length;j++) {          //----> o(n)
				System.out.println(array[i]+ " , "+ array[j]);     //----> o(1)
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,5};
		printPairs(arr);
		System.out.println("Time complexity is o(n^2)");
		printPairsWithoutGoingLeft(arr);
		/*
		 * 	//// 1ST METHODE
		 * 	1. Counting the iterations
		 *  inner loop starts from i+1
		 *  1st iteration -> n-1  (n = No of elements in array)
		 *  2nd iteration -> n-2
		 *  3rd iteration -> n-3  
		 *  time complexity = n-1 + n-2 + n-3 + .. + 2 + 1
		 *  				= 1+2+..+(n-3)+(n-2)+(n-1)
		 *  				= n(n-1)/2
		 *  				= n^2/2 - n/2   (Remove non dominant terms)
		 *  				= n^2	
		 *  
		 *  //// 2ND METHODE
		 *  2. Average work
		 *  Outer loop - > n times
		 *  Inner loop ->  1st inner loop runs -> 3times
		 *  			   2nd inner loop runs -> 2times
		 *  			   3rd inner loop runs -> 1times   
		 *  Average = 6/3 = 2times 
		 *  for 4 outer loop average inner = 2
		 *   	n -> n/2
		 *   	n*n/2 (Remove non dominant term) 
		 *   time complexity = o(n^2)
		 */  
		System.out.println("Time complexity is o(n^2)");
		
	}

}
