//Given a string S (that can contain multiple words), you need to find the word which has minimum length.

public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        
        String[] split = input.split(" ");
        
        StringBuffer ans = new StringBuffer("");
        
        int len = Integer.MAX_VALUE;
        
        for(int i = 0; i < split.length; i++){
            if(split[i].length() < len){
                ans = new StringBuffer("");
                ans.append(split[i]);
                len = split[i].length();
            }
        }
        return ans.toString();

	}
}
