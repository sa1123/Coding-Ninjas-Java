// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        
        double sqrt = Math.pow(n,0.5);
        
        System.out.print((int)sqrt);

	}
}