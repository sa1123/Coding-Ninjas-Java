// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i = 1, sum = 0;
        
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(j);
                if(j<i){
                    System.out.print("+");
                }
                sum+=j;
                j++;
            }
            System.out.println("=" + sum);
            sum = 0;
            i++;
        }
        
	}
}