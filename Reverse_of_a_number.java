// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int len = String.valueOf(n).length();
        
        int flag = 0;
        
        for(int i = 0; i<=len; i++){
            if(n==0){
                System.out.print(0);
                break;
            }
            else if(n%10!=0){
                flag++;
                break;
            }else{n/=10;}
        }
        if(flag>0){
            while(n>0){
                System.out.print(n%10);
                n/=10;
            }
        }
	}
}