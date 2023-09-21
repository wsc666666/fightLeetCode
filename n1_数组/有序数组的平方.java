package n1_数组;

import java.util.Arrays;

public class 有序数组的平方 {


    // 暴力解法先平方再排序不推荐

    // 推荐三个指针，创建一个和原始数组一样的大新数组，创建指针k指向末尾（最大值）
    // 创建指针i指向原始数组最左边，j指向最右边，比较平方大小，来决定移动i,j, k每次都左移，直到k指向0
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0,k= nums.length-1, j=nums.length-1; k >-1; k--) {
               if(nums[i]*nums[i]<=nums[j]*nums[j]){
                   result[k] = nums[j]*nums[j];
                   j--;
               }
                if(nums[i]*nums[i]>nums[j]*nums[j]){
                    result[k] = nums[i]*nums[i];
                    i++;
                }
            }
            return result;
        }
    }
}
