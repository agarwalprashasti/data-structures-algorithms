class Solution {
    public boolean isAnagram(String s, String t) {
        int len1= s.length(), len2= t.length();
        if(len1!=len2) return false;
        int[] cnt= new int[26];
        for(int i=0;i<len1;i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
        for(int value: cnt){
            if(value!=0){
                return false;
            }
        }
        return true;
    }
    /* https://leetcode.com/problems/valid-anagram/solutions/3687854/3-method-s-c-java-python-beginner-friendly */
}