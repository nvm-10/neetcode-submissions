class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean check = false;
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i< nums.length ; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], true);
            } else  {
                check = true;
            }
        }
    
        return check;
    }
}
