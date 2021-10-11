//For a given a string(str), find and return the highest occurring character.

public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        int[] map = new int[256];
        
        for(int i = 0; i<str.length(); i++){
            map[str.charAt(i)]++;
        }
        
        int count = 1;
        char ans = str.charAt(0);
        
        for(int i = 0; i<str.length(); i++){
            if(map[str.charAt(i)]>count){
                ans = str.charAt(i);
                count = map[str.charAt(i)];
            }
        }
        return ans;
	}

}