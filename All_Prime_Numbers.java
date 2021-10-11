// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int flag = 0;
        
        if(n>1){
            System.out.println(2);
        }
        
        for(int i = 3; i<=n; i++){
            for(int j = 2; j<=i/2; j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
            flag=0;
        }
	}
}
