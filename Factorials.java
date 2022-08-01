package bigOproblems;

public class Factorials {
	
	static int fact(int n) {            //--> M(n)
		if(n<0) {
			return -1;
		} else if (n==0) {    
			return 1;
		}else {
			return n*fact(n-1);			// -> M(n-1)
		}
	}
	
	/*
	 * time complexity = M(n)=M(n-1)+O(1)	
	 *  M(1)=O(1)
	 *  M(n-1)=O(1)+M((n-1)-1)
	 *  M(n-2)=O(1)+M((n-2)-1)
	 *  
	 *  M(n)=1+M(n-1)
	 *  	=1+1+M((n-1)-1)
	 *  	=2+M(n-2)
	 *  	=2+1+M((n-2)-1)
	 *  	=3+M(n-3)
	 *  	.
	 *  	.
	 *  	.
	 *  	=a+M(n-a)
	 *  	=n+M(n-n)
	 *  	=n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fact(5);
		System.out.println(ans);
		System.out.println("Time complexity O(n)");
	}

}
