//Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.

public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        int count = 1;
        
        StringBuffer output = new StringBuffer("");
        
        int i = 0; 
        while(i<str.length()-1){
            if(str.charAt(i+1) == str.charAt(i)){
                count++;
                i++;
            }
            else{
                output.append(str.charAt(i));
                if(count>1){
                	output.append(count);
            	}
                count = 1;
                i++;
            }
            
            
        }
        output.append(str.charAt(i));
                if(count>1){
                	output.append(count);
            	}
        return output.toString();
	}

}