package arrays;

import java.util.Arrays;

public class RotateMatrix2DTwo {
	
	public void rotate(int[][] matrix) {
		int N = matrix.length;
		
		//To transpose the matrix
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//Flip it horizontally
		for(int i=0;i<N;i++){
			for(int j=0;j<N/2;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][N-1-j];
				matrix[i][N-1-j]=temp;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix2DTwo obj = new RotateMatrix2DTwo();
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		obj.rotate(matrix);
	}

}


/*
 *   Transpose
 *   
 *   1 2 3
 *   4 5 6
 *   7 8 9
 *   
 *   
 * 	i=0,j=0
 * temp=matrix[0][0]  // 1
 * matrix[0][0]=matrix[0][0] //1
 * matrix[0][0]=temp  //1
 *
 * i=0, j=1
 * temp=matrix[0][1]  //2
 * matrix[0][1]=matrix[1][0] //4
 * matrix[0][1]=temp  //2    //2 and 4 swap
 * 
 * i=0,j=2
 * temp=matrix[0][2]  //3
 * matrix[0][2]=matrix[2][0] // 7
 * matrix[0][2]=temp; //3   //3 and 4 swap
 * 
 * 
 * 
 * 
 * 
 * 
*/