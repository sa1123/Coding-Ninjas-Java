// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i<=n){
            int j = 1;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while(k<n){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }

	}
}

