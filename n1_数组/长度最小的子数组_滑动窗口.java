package n1_数组;

public class 长度最小的子数组_滑动窗口 {

    // 暴力解法超时
    // 滑动窗口解，关键在于窗口的起始指针移动条件
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
           int maxLength = Integer.MAX_VALUE;
           int j = 0;
           int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                while (sum>= target){
                    int length = i-j +1;
                    sum = sum - nums[j++];
                    maxLength = length < maxLength? length:maxLength;
                }
            }
            return maxLength!=Integer.MAX_VALUE? maxLength:0;
        }
    }
}
