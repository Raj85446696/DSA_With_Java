// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0 ;  
        for(int i = 0 ; i<s.length();i++){
            String str = s.substring(i);
            if(str==s.substring(i)){
                count++; 
            }
        }return count; 


    }
    public static void main(String[] args){
    Solution A = new Solution(); 
    System.out.println(A.lengthOfLongestSubstring("abcabcbb"));
    }
}
