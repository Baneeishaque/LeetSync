class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;
        for (int number : nums) {

            sum = sum + number;

            int individualDigitSum = 0;
            char[] digits = Integer.toString(number).toCharArray();
            if (digits.length > 1){

                for (char digit : digits) {

                    individualDigitSum = individualDigitSum + Integer.valueOf(String.valueOf(digit));
                }

            } else {

                individualDigitSum = individualDigitSum + number;
            }
            digitSum = digitSum + individualDigitSum;
        }

        return Math.abs(sum - digitSum);
    }
}