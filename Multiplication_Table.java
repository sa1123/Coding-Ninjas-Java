// Write a program to print multiplication table of n

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        
        while(i<11){
            System.out.println(i*n);
            i++;
        }

	}
}