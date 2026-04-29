class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
       int l = 0, r = 0;
       int len = 0;

       while( r < s.length()) {
        if(set.add(s.charAt(r))) {
            r++;
        } else {
            set.remove(s.charAt(l));
            l++;
        }
        len = Math.max(len, (r-l));
       }
       return len;
    }
}
