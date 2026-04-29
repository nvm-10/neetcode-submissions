class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int i : set) {
            if(!set.contains(i - 1)) {
                int length = 1;
                while(set.contains(i+length)) {
                    length += 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
