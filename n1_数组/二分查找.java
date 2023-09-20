package n1_数组;
class 二分查找 {
    // 注意点，用循环做别用递归
    // 认清楚边界left == right 可以有意义如果条件可相等 用相等来做简单点
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1,0,3,5,9,12},9));
        System.out.println(solution.search(new int[]{-1,0,3,5,9,12},2));
    }
    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            while (left<right) {
                int middle = (left + right)/2;
                if(target==nums[middle]){
                    return middle;
                }
                if(target<nums[middle]){
                    right = middle -1;
                }
                if (target>nums[middle]) {
                    left = middle +1;
                }
            }
            return -1;
        }
    }
}