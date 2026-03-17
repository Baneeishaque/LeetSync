class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();  // stores indices
        
        for (int i = 0; i < n; i++) {
            // While current day is warmer than previous days in stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int prevDay = stack.pop();
                answer[prevDay] = i - prevDay;   // days waited
            }
            stack.push(i);   // push current day index
        }
        
        return answer;
    }
}