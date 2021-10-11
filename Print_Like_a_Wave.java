//For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.

public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        int t2b = 0;
        int i = 0;
        
        if(mat.length == 0){
            return;
        }
        
        for(int j = 0; j<mat[0].length; j++){
            if(t2b%2 == 0){
                i = 0;
                while(i<mat.length){
                    System.out.print(mat[i][j] + " ");
                    i++;
                }
                //System.out.println();
                t2b++;
            }
            else{
                i = mat.length-1;
                while(i>=0){
                    System.out.print(mat[i][j] + " ");
                    i--;
                }
                //System.out.println();
                t2b++;
            }
            
        }
	}

}
