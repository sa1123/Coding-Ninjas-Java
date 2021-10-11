//For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.

public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        for(int i = 0; i<mat.length; i++){
            int sum = 0;
            for(int j = 0; j<mat[i].length; j++){
                sum+=mat[i][j];
            }
            System.out.print(sum + " ");
        }
	}
}
