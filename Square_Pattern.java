// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int i = 0, j = 0;
        
        while(i<n){
            while(j<n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }

		
	}

}
