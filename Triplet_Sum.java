// You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        sum+=1;
                    }
                }
            }
        }
        return sum;
    }
}

