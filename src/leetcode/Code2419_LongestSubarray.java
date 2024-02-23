package leetcode;

import java.util.Arrays;

/**
 * 2419. 按位与最大的最长子数组
 *
 * 给你一个长度为 n 的整数数组 nums 。
 * 考虑 nums 中进行 按位与（bitwise AND）运算得到的值 最大 的 非空 子数组。
 * 换句话说，令 k 是 nums 任意 子数组执行按位与运算所能得到的最大值。
 * 那么，只需要考虑那些执行一次按位与运算后等于 k 的子数组。
 * 返回满足要求的 最长 子数组的长度。
 *
 * 数组的按位与就是对数组中的所有数字进行按位与运算。
 * 子数组 是数组中的一个连续元素序列。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,3,2,2]
 * 输出：2
 * 解释：
 * 子数组按位与运算的最大值是 3 。
 * 能得到此结果的最长子数组是 [3,3]，所以返回 2 。
 *
 * 示例 2：
 * 输入：nums = [1,2,3,4]
 * 输出：1
 * 解释：
 * 子数组按位与运算的最大值是 4 。
 * 能得到此结果的最长子数组是 [4]，所以返回 1 。
 *
 * 提示：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^6
 */
public class Code2419_LongestSubarray {

    /**
     * 按位与最大的最长子数组
     *
     * @param nums 整数数组
     * @return 最长子数组的长度
     */
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxm = nums[0];
        for (int i = 1; i < n; i++) {
            maxm = Math.max(maxm, nums[i]);
        }
        int ans = 0;
        for (int i = 0, currLength = 0; i < n; i++) {
            if (nums[i] == maxm) {
                currLength++;
                ans = Math.max(ans, currLength);
            } else {
                currLength = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {1, 2, 3, 3, 2, 2};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + longestSubarray(nums1));

        // 测试用例2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + longestSubarray(nums2));
    }
}
