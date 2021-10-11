// Given a decimal number (integer N), convert it into binary and print.
// The binary number should be in the form of an integer.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int ans[] = new int[100];
        
        int i = 0;
        
        if(n==0){
            System.out.print(0);
        }
        
        while(n>0){
            ans[i++] = (n%10)%2;
            n/=2;
        }
        for(int j=i-1; j>=0; j--){
            System.out.print(ans[j]);
        }
        
	}
}