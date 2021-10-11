//For a given string(str), remove all the consecutive duplicate characters.

public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        StringBuffer ans = new StringBuffer("");
        ans.append(str.charAt(0));
        
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ans.charAt(ans.length()-1)){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
	}

}