// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int[] map = new int[1000];
        
        if(arr.length==1){
            return arr[0];
        }
        
        for(int i = 0; i<arr.length; i++){
            map[arr[i]]++;
        }
        
        for(int i = 0; i<1000; i++){
            //System.out.println(map[arr[i]]);
            if(map[arr[i]] == 2){
                return arr[i];
            }
        }
        return -1;
    }
}