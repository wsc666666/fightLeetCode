package n1_数组;

public class 移除元素 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        System.out.println(solution.removeElement(new int[]{3,2,2,3},2));
        System.out.println(solution2.removeElement(new int[]{3,2,2,3},2));
    }

    // 暴力解法，两个for循环注意移动的下标
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int size = nums.length;
            for (int i = 0; i < size; i++) {
                if(nums[i] == val) {
                    for (int j = i; j < size-1; j++) {
                        nums[j] =nums[j+1];
                    }
                    size --;
                    i--;
                }
            }
            return  size;
        }
    }

    // 双指针解法，快慢指针
    static class Solution2 {
        public int removeElement(int[] nums, int val) {
            int slowIndex = 0;
            for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
                if(nums[fastIndex] != val) {
                    nums[slowIndex++] = nums[fastIndex];
                }
            }
            return  slowIndex;
        }
    }
}
