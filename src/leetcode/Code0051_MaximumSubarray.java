package leetcode;

/**
 * 51. 最大子数组和
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 * 
 * 示例 1：
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 
 * 示例 2：
 * 输入：nums = [1]
 * 输出：1
 * 
 * 示例 3：
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 * 
 * 提示：
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 */
class Code0051_MaximumSubarray {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int ans = nums[0];
            for (int i = 1, pre = nums[0]; i < n; ++i) {
                pre = Math.max(nums[i], nums[i] + pre);
                ans = Math.max(ans, pre);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 1: " + new Solution().maxSubArray(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println("Test Case 2: " + new Solution().maxSubArray(nums2)); // Output: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Test Case 3: " + new Solution().maxSubArray(nums3)); // Output: 23
    }
}
