class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * (nums.length)];
        int i = 0;
        int index = 0;
        
        while ( i < (nums.length)) {

            ans[index++] = nums[i];

            if (((nums.length) - 1) == i) {

                if (index < ans.length) {

                    i = 0;

                } else{

                    break;
                }
            } else {

                i = i + 1;
            }
        }

        return ans;
    }
}