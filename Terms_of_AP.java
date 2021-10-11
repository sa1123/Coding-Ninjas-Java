// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag = 0;
        
        for(int i = 1;flag!=n; i++){
            int num = 3*i+2;
            if(num%4==0){
                continue;
            }else{
                flag++;
                System.out.print(num + " ");}
        }

	}
}
