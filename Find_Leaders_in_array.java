// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.

public class Solution {

	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        System.out.print(input[input.length-1] + " ");
        
		for(int i = input.length-1; i>=0; i--){
            int flag = 0;
            int j = i+1;
            while(j<input.length){
                if((j==input.length-1 && flag==0) && input[i]>=input[input.length-1]){
                    System.out.print(input[i] + " ");
                }
                if(input[i] < input[j]){
                    flag++;
                    break;
                }
                j++;
                
                
            }
        }
	}
	
}