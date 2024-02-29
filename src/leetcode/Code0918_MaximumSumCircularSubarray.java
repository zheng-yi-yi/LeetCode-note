package leetcode;

/**
 * 918. 环形子数组的最大和
 *
 * 给定一个长度为 n 的环形整数数组 nums ，返回 nums 的非空 子数组 的最大可能和 。
 *
 * 示例 1：
 * 输入：nums = [1,-2,3,-2]
 * 输出：3
 * 解释：从子数组 [3] 得到最大和 3
 *
 * 示例 2：
 * 输入：nums = [5,-3,5]
 * 输出：10
 * 解释：从子数组 [5,5] 得到最大和 5 + 5 = 10
 *
 * 示例 3：
 * 输入：nums = [3,-2,2,-3]
 * 输出：3
 * 解释：从子数组 [3] 和 [3,-2,2] 都可以得到最大和 3
 *
 * 提示：
 * - n == nums.length
 * - 1 <= n <= 3 * 10^4
 * - -3 * 10^4 <= nums[i] <= 3 * 10^4
 */
class Code0918_MaximumSumCircularSubarray {

    static class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int n = nums.length;
            int all = nums[0];
            int minSum = nums[0]; // 最小子序列和
            int maxSum = nums[0]; // 最大子序列和
            for (int i = 1, preMin = nums[0], preMax = nums[0]; i < n; i++) {
                all += nums[i]; // 计算所有元素的和
                preMax = Math.max(nums[i], nums[i] + preMax);
                maxSum = Math.max(preMax, maxSum);
                preMin = Math.min(nums[i], nums[i] + preMin);
                minSum = Math.min(preMin, minSum);
            }
            // 如果所有元素的和等于最小子序列和，说明所有元素都是负数，返回最大子序列和即可
            // 否则返回 max[最大子序列和, 所有元素的和减去最小子序列和]
            return all == minSum ? maxSum : Math.max(maxSum, all - minSum);
        }
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums1 = {1, -2, 3, -2};
        Solution solution = new Solution();
        System.out.println("Test Case 1: " + solution.maxSubarraySumCircular(nums1)); // Output: 3

        int[] nums2 = {5, -3, 5};
        System.out.println("Test Case 2: " + solution.maxSubarraySumCircular(nums2)); // Output: 10

        int[] nums3 = {3, -2, 2, -3};
        System.out.println("Test Case 3: " + solution.maxSubarraySumCircular(nums3)); // Output: 3
    }
}
