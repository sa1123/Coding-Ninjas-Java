// Print the following pattern for the given number of rows.
// Pattern for N = 4
// ...1
// ..232
// .34543
// 4567654
//The dots represent spaces.

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while(k<i){
                System.out.print(i+k);
                k++;
            }
            k=i+k-1;
            while(k>i){
                k--;
                System.out.print(k);
            }
            i++;
            System.out.println();
        }
	}
}
