// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 0;
        
        while(i<n){
            int j = 0;
            while(j<n-i){
                System.out.print(n-i);
                j++;
            }
            i++;
            System.out.println();
        }

		
	}

}