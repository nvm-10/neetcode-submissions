class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> seen = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int j = 0; j < t.length(); j++) {
            if(!seen.containsKey(t.charAt(j))) {
                return false;
            }
            seen.put(t.charAt(j), seen.get(t.charAt(j))-1);
        }
        return seen.values().stream()
                        .noneMatch(i -> i !=0);
    }
}
