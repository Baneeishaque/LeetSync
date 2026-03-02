class Solution {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];   // max sum ending at current index
        int maxGlobal = nums[0];    // overall maximum sum found so far
        
        for (int i = 1; i < nums.length; i++) {
            // Decide: start new subarray or extend previous one?
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            
            // Update global max
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        
        return maxGlobal;
    }
}