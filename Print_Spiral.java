// For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
// a. First row(left to right)
// b. Last column(top to bottom)
// c. Last row(right to left)
// d. First column(bottom to top)

public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int rs = 0;
        int re = matrix.length-1;
        
        if(re<1){
            return;
        }
        
        int cs = 0;
        int ce = matrix[0].length-1;       
        
        
        int count = 0;
        
        while(count<matrix.length*matrix[0].length){
            for(int i = cs; i<=ce; i++){
                System.out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;
            
            for(int i = rs; i<=re; i++){
                System.out.print(matrix[i][ce] + " ");
                count++;
            }
            ce--;
            
            for(int i = ce; i>=cs; i--){
                System.out.print(matrix[re][i] + " ");
                count++;
            }
            re--;
            
            for(int i = re; i>=rs; i--){
                System.out.print(matrix[i][cs] + " ");
                count++;
            }
            cs++;
        }
	}
}