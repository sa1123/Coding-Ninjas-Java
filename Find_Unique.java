// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.

public class Solution{  
    
    public static int findUnique(int arr[]) {
    	//Your code goes here
        int i = 0;
        for(i = 0; i<arr.length; i++){
            int x = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    x++;
                }
            }
            if(x==1){
                return arr[i];
            }
        }
        return arr[i];
    }
}