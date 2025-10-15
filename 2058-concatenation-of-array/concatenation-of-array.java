class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * (nums.length)];
        
        int index = 0;

        for ( int i = 0; i < (nums.length); i++) {

            ans[index++] = nums[i];

            if (((nums.length) - 1) == i) {

                if (index < ans.length) {

                    i = -1;

                } else{

                    break;
                }
            }
        }

        return ans;
    }
}