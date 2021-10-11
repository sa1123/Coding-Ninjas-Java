//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int[] map1 = new int[255];
        int[] map2 = new int[255];
        
        for(int i = 0; i<str1.length(); i++){
            map1[str1.charAt(i)]++;
        }
        
        for(int i = 0; i<str2.length(); i++){
            map2[str2.charAt(i)]++;
        }
        
        for(int i = 0; i<255; i++){
            if(map1[i] != map2[i]){
                return false;
            }
        }
        return true;
	}

}