class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        List<List<Integer>> freq = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getValue());
            list.add(entry.getKey());
            freq.add(list);
        }

        freq.sort((a, b)  -> b.get(0) - a.get(0));

        int[] result = new int[k];

        for (int i = 0; i < k ; i++) {
            result[i] =freq.get(i).get(1);
        }

        return result;
        
    }
}
