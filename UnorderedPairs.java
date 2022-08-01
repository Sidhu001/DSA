package bigOproblems;

public class UnorderedPairs {
	
	static void printUnorderedPairsOne(int[] arrA, int[] arrB ) {
		for(int i=0; i< arrA.length; i++) {                         // --> o(a)  a = arrA.length
			for(int j = 0; j<arrB.length;j++) { 					// --> o(b)  b = arrB.length
				if(arrA[i] < arrB[j]) {								// --> o(1)				
					System.out.println(arrA[i] + " , " + arrB[j]);	// --> o(1)
				}
			}
		}
	}
	

	static void printUnorderedPairsTwo(int[] arrA, int[] arrB ) {
		for(int i=0; i< arrA.length; i++) {                         // --> o(a)  a = arrA.length
			for(int j = 0; j<arrB.length;j++) { 					// --> o(b)  b = arrB.length
				for(int k = 0; k<100000;k++) {						// --> o(1)	
					System.out.println(arrA[i] + " , " + arrB[j]);  // --> o(1)
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Time complexity for printUnorderedPairsOne is o(ab)");
		System.out.println("Time complexity for printUnorderedPairsTwo is o(ab)");
	}

}
