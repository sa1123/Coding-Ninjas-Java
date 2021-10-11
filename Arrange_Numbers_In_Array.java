// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.

public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int i = 1;
        
        if(n%2==0){
            for(int j = 0; j<(n/2); j++){
            arr[j] = i;
            i+=2;
        }
            i=n;

            for(int j = n/2; j<n; j++){
                    arr[j] = i;
                    i-=2;
            }
        }
        else if(n==0){
            arr[0] = 0;
        }
        else{
            for(int j = 0; j<(n/2)+1;j++){
            arr[j] = i;
            i+=2;
        }
            i-=3;

            for(int j = (n/2)+1; j<n; j++){
                    arr[j] = i;
                    i-=2;
            }
        }
    }
}