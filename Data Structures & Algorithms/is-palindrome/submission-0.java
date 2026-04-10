class Solution {
    public boolean isPalindrome(String s) {
        String s_new = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i < s_new.length(); i++){
            if(s_new.charAt(i) != s_new.charAt(s_new.length() - (i + 1))){
                return false;
            }
        }
        return true;
    }
}