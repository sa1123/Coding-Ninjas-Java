// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt();
        int n = s.nextInt();
        int out = x;
        
        if(n==0){
            System.out.println(1);
        }
        else if(x==0){
            System.out.println(0);
        }
        else{
            while(n>1){
            out = out*x;
            n--;
        }
        System.out.println(out);
        }
        
    }
}