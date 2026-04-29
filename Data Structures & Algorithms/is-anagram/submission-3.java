class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] key1 = new int[26];
        int[] key2 = new int[26]; 

        for(int i = 0, j = 0; i < s.length() && j < t.length(); i++, j++) {
            key1[s.charAt(i) - 'a']++;
            key2[t.charAt(j) - 'a']++;
        }

        for(int i = 0; i < key1.length; i++) {
            if(key1[i] != key2[i]) {
                return false;
            }
        }
        return true;
    }
}
