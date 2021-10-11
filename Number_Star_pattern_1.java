// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 1; i<=n; i++){
            for(int j = n; j>i; j--){
                System.out.print(j);
            }
            System.out.print("*");
            for(int k = i-1; k>0; k--){
                System.out.print(k);
            }
            System.out.println();
        }

	}
}
