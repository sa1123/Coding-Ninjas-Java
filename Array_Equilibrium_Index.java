// For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
// Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
// If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.

public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        
        if(arr.length==0){
            return -1;
        }
        
        int rs = 0;
        int ls = arr[0];
        
        for(int i = 2; i<arr.length-1; i++){
            rs += arr[i];
        }
        
        int x = 1;
        
        while(rs != ls){
            ls += arr[x];
            //System.out.print(ls + " ");
            rs -= arr[x+1];
            //System.out.println(rs);
            x++;
            if(x==arr.length-1){
                return -1;
            }
        }
        return x;
	}
}