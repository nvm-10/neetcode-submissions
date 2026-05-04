class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 0 ) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int max = Integer.MIN_VALUE;
        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if(map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            map.put(c, r);
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
