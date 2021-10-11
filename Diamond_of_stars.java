// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i<=n){
            int k = n-i;
            while(k>0){
                System.out.print(" ");
                k-=2;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i+=2;
            System.out.println();
        }

        i=n-2;
        
        while(i>0){
            int k = n-i;
            while(k>0){
                System.out.print(" ");
                k-=2;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i-=2;
        }
    }
}