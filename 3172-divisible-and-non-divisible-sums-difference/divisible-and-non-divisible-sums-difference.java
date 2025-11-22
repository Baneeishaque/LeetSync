class Solution {
    public int differenceOfSums(int n, int m) {

        int totalSum = (n * (n + 1)) / 2;        
        int countMultiples = n / m;
        int sumMultiples = m * ((countMultiples * (countMultiples + 1)) / 2);
        
        return totalSum - (2 * sumMultiples);
    }
}