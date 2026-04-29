class Solution {
    public boolean isAnagram(String s, String t) {
        boolean check = false;
        if(s.length() != t.length()) {
            return check;
        }
        int[] key1 = new int[26];
        for(int i = 0 ; i < s.length(); i++) {
            key1[s.charAt(i) - 'a']++;
            key1[t.charAt(i) - 'a']--;
        }
        for(int i : key1) {
            if(i !=0){
                return false;
            }
        }
        return true;
    }
}
