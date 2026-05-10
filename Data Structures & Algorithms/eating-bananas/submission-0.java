class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;
        while(low <= high) {
            int mid = (low + high) / 2;
            int hours = 0;
            for(int p : piles) {
                hours += Math.ceil((double) p / mid);
            }
            if( hours <= h ) {
                res = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
