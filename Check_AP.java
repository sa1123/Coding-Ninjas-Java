// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n<3){
            System.out.print(true);
        }
        else{
            int prev = s.nextInt();
            int curr = s.nextInt();
            
            int flag = 0;

            int diff = curr - prev;

            for(int i = 1; i<n-1; i++){
                if(curr - prev != diff){
                    System.out.print(false);
                    flag++;
                    break;
                }
                else{
                    prev = curr;
                    curr = s.nextInt();
                }
            }
            if(flag==0){System.out.print(true);}
            
        }

	}
}
