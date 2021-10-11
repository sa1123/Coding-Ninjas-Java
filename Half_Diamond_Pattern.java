// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        System.out.println("*");
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i<=n){
            System.out.print("*");
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int k = i-1;
            while(k>0){
                System.out.print(k);
                k--;
            }
            i++;
            System.out.println("*");
        }
        
        i-=2;
        while(i>0){
            System.out.print("*");
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int k = i-1;
            while(k>0){
                System.out.print(k);
                k--;
            }
            i--;
            System.out.println("*");
        }
        
        System.out.print("*");
    }
}
