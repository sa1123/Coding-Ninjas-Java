// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE

import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 0, j = 0;
        
        while(i<=n){
            while(j!=0){
                System.out.print((char)(65 + n - j));
                j--;
            }
            i++;
            j=i;
            System.out.println();
        }
	}
}