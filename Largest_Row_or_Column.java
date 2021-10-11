//For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.

public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        int max = Integer.MIN_VALUE;
        int row = -1, col = -1;
        int rf = 0;
        
        int sum = 0;
        
        if(mat.length == 0){
            System.out.print("row 0 " + max);
        }
        else{
            for(int i=0; i<mat.length; i++){
            sum = 0;
            for(int j = 0; j<mat[0].length; j++){
                sum+=mat[i][j];
                //System.out.println(sum + " " + i + " " + j + " " + mat[i][j]);
            }
            if(sum>max){
                max = sum;
                //System.out.println("max " + max);
                row = i;
                rf = 1;
            }
        }
        
            for(int j = 0; j<mat[0].length; j++){
                sum = 0;
                for(int i = 0; i<mat.length; i++){
                    sum+=mat[i][j];
                    //System.out.println(sum + " " + i + " " + j + " " + mat[i][j]);
                }
                if(sum>max){
                    max = sum;
                    //System.out.println("max " + max);
                    col = j;
                    rf = 0;
                }
            }

            if(rf == 1){
                System.out.print("row " + row + " " + max);
            }
            else{
                System.out.print("column " + col + " " + max);
            	}
            }
	}

}
