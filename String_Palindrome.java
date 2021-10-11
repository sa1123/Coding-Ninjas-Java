//Given a string, determine if it is a palindrome, considering only alphanumeric characters.

public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
        int l = 0, r = str.length()-1;
        while(l<=r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
	}

}