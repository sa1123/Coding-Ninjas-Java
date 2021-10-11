//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        double s, e, w;
        Scanner scr = new Scanner(System.in);
        s = scr.nextDouble();
        e = scr.nextDouble();
        w = scr.nextDouble();
        
        double cs = (s-32.0)/1.8;
        
        System.out.println((int)s + " " + (int)cs);
        s = s+w;
        cs = (s-32.0)/1.8;
        
        while(s<e){
            System.out.println((int)s + " " + (int)cs);
            s = s+w;
        	cs = (s-32.0)/1.8;
        }
		
	}

}