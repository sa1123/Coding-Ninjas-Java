//For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.

public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int sum = 0;
        
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(i == 0 || j == 0 || i == j || i == mat.length-1 || j == mat[i].length-1 || i+j == mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.print(sum);
	}
}
