class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;
        for (int number : nums) {

            sum = sum + number;

            int individualDigitSum = 0;
            do {

                individualDigitSum = individualDigitSum + (number % 10);
                number = number / 10;

            } while (number > 0);

            digitSum = digitSum + individualDigitSum;
        }

        return ((sum - digitSum) < 0) ? ((sum - digitSum) * -1) : (sum - digitSum);
    }
}