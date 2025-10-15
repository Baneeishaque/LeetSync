class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        int digitSum = 0;
        for (int number : nums) {

            sum = sum + number;
            digitSum = digitSum + getIndividualDigitSum(number);
        }

        return Math.abs(sum - digitSum);
    }

    public int getIndividualDigitSum (int number) {

        int individualDigitSum = 0;
        do {

            individualDigitSum = individualDigitSum + (number % 10);
            number = number / 10;

        } while (number != 0);

        return individualDigitSum;
    }
}