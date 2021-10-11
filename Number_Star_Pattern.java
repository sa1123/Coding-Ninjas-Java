// Sample Input :
//    5
// Sample Output :
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		// Write your code here		
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(j);
            }
            for(int k = 0; k<i; k++){
                System.out.print("**");
            }
            for(int l = n-i; l>0; l--){
                System.out.print(l);
            }
            System.out.println();
        }

	}
}