class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while(l < r) {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(area, max);
            if(heights[l] > heights[r] ) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}
