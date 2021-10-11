// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        
        double e = 0.0, o = 0.0;
        
        while(n!=0.0){
            if((n%10.0)%2.0==0.0){
                //System.out.println("Even");
                e = e + n%10.0;
                n = Math.floor(n/10.0);
                //System.out.println(e + " " + o + " " + n);
            }
            else{
                //System.out.println("Odd");
                o = o + n%10.0;
                n = Math.floor(n/10.0);
                //System.out.println(e + " " + o + " " + n);
            }
        }
        
        System.out.println((int)e + " " + (int)o);

	}
}

