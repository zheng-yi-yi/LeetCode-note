package leetcode;

/**
 * 213. 打家劫舍 II
 *
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * 
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额。
 * 
 * 示例 1：
 * 输入：nums = [2,3,2]
 * 输出：3
 * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * 
 * 示例 2：
 * 输入：nums = [1,2,3,1]
 * 输出：4
 * 解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *       偷窃到的最高金额 = 1 + 3 = 4 。
 * 
 * 示例 3：
 * 输入：nums = [1,2,3]
 * 输出：3
 * 
 * 提示：
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 1000
 */
class Code0213_HouseRobberII {

    static class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            if (n == 1) return nums[0];
            return Math.max(nums[0] + best(2, n - 2, nums), best(1, n - 1, nums));
        }

        public int best(int left, int right, int[] nums) {
            if (left > right) {
                return 0;
            }
            if (left == right) {
                return nums[left];
            }
            if (left + 1 == right) {
                return Math.max(nums[left], nums[right]);
            }
            int prepre = nums[left];
            int pre = Math.max(nums[left], nums[left + 1]);
            for (int i = left + 2, cur; i <= right; i++) {
                cur = Math.max(pre, Math.max(nums[i], nums[i] + prepre));
                prepre = pre;
                pre = cur;
            }
            return pre;
        }
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums1 = {2, 3, 2};
        Solution solution = new Solution();
        System.out.println("Test Case 1: " + solution.rob(nums1)); // Output: 3

        int[] nums2 = {1, 2, 3, 1};
        System.out.println("Test Case 2: " + solution.rob(nums2)); // Output: 4

        int[] nums3 = {1, 2, 3};
        System.out.println("Test Case 3: " + solution.rob(nums3)); // Output: 3
    }
}
