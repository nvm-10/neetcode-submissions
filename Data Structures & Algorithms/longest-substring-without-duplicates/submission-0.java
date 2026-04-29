class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max = 0; 
       Set<Character> map = new HashSet<>();
        int l = 0 , r = 0;
        while( r < s.length()) {
            if(map.add(s.charAt(r))) {
                r++;
            } else {
                map.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max , r-l);
        }
        return max;
    }
}
