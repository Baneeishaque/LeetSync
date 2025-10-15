class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;
        for (int i =0; i < nums.length; i++) {

            sum = sum + nums[i];

            int individualDigitSum = 0;
            do {

                individualDigitSum = individualDigitSum + (nums[i] % 10);
                nums[i] = nums[i] / 10;

            } while (nums[i] > 0);

            digitSum = digitSum + individualDigitSum;
        }

        return Math.abs(sum - digitSum);
    }
}