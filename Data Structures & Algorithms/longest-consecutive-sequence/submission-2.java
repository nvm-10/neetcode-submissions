class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int best = 0;
        for(int i : set) {
            if(set.contains(i-1)) continue;
            int curr = i;
            int len = 1;
            while(set.contains(curr + 1)) {
                curr++;
                len++;
            }
            best = Math.max(best, len);
        } 
        return best;
    }
}
