function productExceptSelf(nums: number[]): number[] {
    
    let prefix = 1, postfix = 1;
    let answer = new Array(nums.length).fill(1);

    for(let i = 0; i < nums.length; i++) {
        answer[i] = answer[i] * prefix;
        answer[nums.length - 1 - i] = answer[nums.length - 1 - i] * postfix;
        prefix = prefix * nums[i];
        postfix = postfix * nums[nums.length - 1 - i];

    }

    return answer;
};

// nums = [1(0),2(1),3(2),4(3)], nums.length = 4
// prefix 1, postfix 1, answer [1(0),1(1),1(2),1(3)]

// i 0, 0 < 4
// answer[0] = answer[0] * 1 = 1 * 1 = 1
// answer[4-1-0] => answer[3]
// answer[3] = answer[3] * 1 = 1 * 1 = 1
// prefix = 1 * nums[0] = 1 * 1 = 1
// postfix = 1 * nums[4-1-0] = 1 * nums[3] = 1 * 4 = 4
// answer [1(0),1(1),1(2),1(3)]

// i 1, 1 < 4
// answer[1] = answer[1] * 1 = 1 * 1 = 1
// answer[4-1-1] => answer[2]
// answer[2] = answer[2] * 4 = 1 * 4 = 4
// prefix = 1 * nums[1] = 1 * 2 = 2
// postfix = 4 * nums[4-1-1] = 4 * nums[2] = 4 * 3 = 12
// answer [1(0),1(1),4(2),1(3)]

// i 2, 2 < 4
// answer[2] = answer[2] * 2 = 4 * 2 = 8
// answer[4-1-2] => answer[1]
// answer[1] = answer[1] * 12 = 1 * 12 = 12
// prefix = 2 * nums[2] = 2 * 3 = 6
// postfix = 12 * nums[4-1-2] = 12 * nums[1] = 12 * 2 = 24
// answer [1(0),12(1),8(2),1(3)]

// i 3, 3 < 4
// answer[3] = answer[3] * 6 = 1 * 6 = 6
// answer[4-1-3] => answer[0]
// answer[0] = answer[0] * 24 = 1 * 24 = 24
// prefix = 6 * nums[3] = 6 * 4 = 24
// postfix = 24 * nums[4-1-3] = 24 * nums[0] = 24 * 1 = 24
// answer [24(0),12(1),8(2),6(3)]

// i 4, 4 < 4 False