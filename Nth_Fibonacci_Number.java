// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//     F(n) = F(n-1) + F(n-2), 
//     Where, F(1) = F(2) = 1

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int f1 = 0, f2 = 1, f=1;
        
        for(int i = 0; i<n-1; i++){
            f  = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        System.out.println(f);
	}

}