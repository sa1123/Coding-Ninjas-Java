// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1, j = 1;
        
        while(i<=n){
            while(j<=i){
                System.out.print((char)(64 + i));
        		j++;
            }
            j=1;
            i++;
            System.out.println();
        }

		
	}

}
