package arrays;

public class DiagonalSum {
	
	static int sumDiagonal(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sumDiagonal(arr));
	}

}
