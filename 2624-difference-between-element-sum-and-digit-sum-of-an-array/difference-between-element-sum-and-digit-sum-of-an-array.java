class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;
        for (int i =0; i < nums.length; i++) {

            sum = sum + nums[i];

            int individualDigitSum = 0;
            int number = nums[i];
            do {

                individualDigitSum = individualDigitSum + (number % 10);
                number = number / 10;

            } while (number > 0);

            digitSum = digitSum + individualDigitSum;
        }

        return Math.abs(sum - digitSum);
    }
}