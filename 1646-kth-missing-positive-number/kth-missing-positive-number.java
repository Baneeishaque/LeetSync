class Solution {
    public int findKthPositive(int[] arr, int k) {

        int expected = 1;
        int missingCount = 0;
        
        for (int num : arr) {

            while (expected < num) {

                missingCount++;
                if (missingCount == k) {

                    return expected;
                }
                expected++;
            }
            expected = num + 1;
        }
        
        return arr[arr.length - 1] + (k - missingCount);
    }
}