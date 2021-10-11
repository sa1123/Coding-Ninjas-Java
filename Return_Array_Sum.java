// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

public class Solution {
    
	public static int sum(int[] arr) {
		//Your code goes here
        
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans+=arr[i];
        }
        return ans;     
    }
    
}
