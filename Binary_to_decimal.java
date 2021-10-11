// Given a binary number as an integer N, convert it into decimal and print.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int size = String.valueOf(n).length();
        
        int ans = 0;
        
        for(int i = 0; i<size; i++){
            ans += (n%10)*(int)Math.pow(2,i);
            n/=10;
        }
        System.out.print(ans);
	}
}