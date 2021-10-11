// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        
        double basic = s.nextDouble();
        char g = s.next().charAt(0);
        
        int allow;
        
        if(g == 'A'){
            allow = 1700;
        }
        else if(g == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        
        double hra = basic * 0.20;
        double da = basic * 0.50;
        double pf = basic * 0.11;
        
        double total = basic + hra + da + allow - pf;
        
        System.out.println((int)Math.round(total));

	}
}
