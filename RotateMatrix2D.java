package arrays;

import java.util.Arrays;

public class RotateMatrix2D {
	
	public void rotate(int[][] matrix) {
        //Check if matrix is N*N matrix or not 
		if(matrix.length == 0 || matrix.length != matrix[0].length) {
			System.out.println("Wrong type of array!  Provide proper n*n array");
		}
		//Get number of rows
		int n = matrix.length;
		//Get number of layers
		for(int layer=0;layer<n/2;layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++) {
				int offset = i -first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
    }
	
	
	
	
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		RotateMatrix2D obj = new RotateMatrix2D();
		obj.rotate(matrix);
	}
}
