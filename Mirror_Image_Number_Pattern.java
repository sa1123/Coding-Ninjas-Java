// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// ...1
// ..12
// .123
// 1234
// The dots represent spaces.

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1, j = 1, k = 1;
        
        while(i<=n){
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }
            while(j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            k=1;
            j=1;
            System.out.println();
        }

		
	}

}