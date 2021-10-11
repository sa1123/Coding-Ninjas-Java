// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1;
        int k = n*2;
        
        while(i<=k){
            int j = i;
            while(j<k){
                System.out.print(j);
                j+=2;
            }
            if(i>1){
                int l = 1;
        		while(l<i){
                    System.out.print(l);
                    l+=2;
                }
            }
            
            System.out.println();
            i+=2;
        }
	}
}