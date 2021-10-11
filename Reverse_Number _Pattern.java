// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 21
// 321
// 4321

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
            while(j>0){
                System.out.print(j);
                j--;
            }
            i++;
            j=i;
            System.out.println();
        }

		
	}

}