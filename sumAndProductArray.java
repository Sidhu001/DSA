package bigOproblems;

public class sumAndProductArray {
	
	static void sumAndProduct(int[] array){
		int sum = 0;                    // o(1) 
		int product = 1;                // o(1)
		for(int i : array) {            // o(n)
			sum+=i;                     // o(1)
		}
		for(int j : array) {           // o(n)
			product *= j;              // o(1)
		}
		System.out.println("Sum of Array is: " + sum);
		System.out.println("Product of Array is: " + product);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		sumAndProduct(arr);
		System.out.println("Order of function is : o(n)");
	}
}
