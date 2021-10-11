//Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
//You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.

public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int m = arr1.length-1;
        int n = arr2.length-1;
        int c = 0;
        
        int x = Math.max(m,n) + 1;        
        
        while(m >= 0 && n>=0){
            int sum = arr1[m] + arr2[n] + c;
            output[x] = sum%10;
            c = sum/10;
            m--;
            n--;
            x--;
        }
        
        while(m >= 0){
            int sum = arr1[m] + c;
            output[x] = sum%10;
            c = sum/10;
            m--;
            x--;
        }
        while(n >= 0){
            int sum = arr2[n] + c;
            output[x] = sum%10;
            c = sum/10;
            n--;
            x--;
        }
        output[0] = c;
    }
}