// Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int sum = 0, rev, tn = n;
        
        while(tn>0){
            rev = tn%10;
            sum = sum*10 + rev;
            tn/=10;
        }
        if(n==sum){
            System.out.print(true);
        }else{System.out.print(false);}

	}
}

