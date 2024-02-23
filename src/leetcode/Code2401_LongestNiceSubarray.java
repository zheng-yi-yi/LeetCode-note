package leetcode;

import java.util.Arrays;

/**
 * 2401. 最长优雅子数组
 *
 * 给你一个由 正 整数组成的数组 nums 。
 * 如果 nums 的子数组中位于 不同 位置的每对元素按位 与（AND）运算的结果等于 0 ，则称该子数组为 优雅 子数组。
 * 返回 最长 的优雅子数组的长度。
 * 子数组 是数组中的一个 连续 部分。
 * 注意：长度为 1 的子数组始终视作优雅子数组。
 *
 * 示例 1：
 * 输入：nums = [1,3,8,48,10]
 * 输出：3
 * 解释：最长的优雅子数组是 [3,8,48] 。子数组满足题目条件：
 * - 3 AND 8 = 0
 * - 3 AND 48 = 0
 * - 8 AND 48 = 0
 * 可以证明不存在更长的优雅子数组，所以返回 3 。
 *
 * 示例 2：
 * 输入：nums = [3,1,5,11,13]
 * 输出：1
 * 解释：最长的优雅子数组长度为 1 ，任何长度为 1 的子数组都满足题目条件。
 *
 * 提示：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 */
public class Code2401_LongestNiceSubarray {

    /**
     * 最长优雅子数组
     *
     * @param nums 正整数数组
     * @return 最长优雅子数组的长度
     */
    public static int longestNiceSubarray(int[] nums) {
        int maxLength = 0; // 用于记录最长优雅子数组的长度
        int bitOr = 0; // 用于记录窗口中所有元素的按位或运算结果
        // 遍历数组
        for (int left = 0, right = 0; right < nums.length; right++) {
            // 如果新的元素与窗口中的元素有交集
            while ((bitOr & nums[right]) > 0) {
                // 从 bitOr 中去掉集合 nums[left]
                bitOr ^= nums[left++];
            }
            // 把集合 nums[right] 并入 bitOr 中
            bitOr |= nums[right];
            // 更新最长优雅子数组的长度
            maxLength = Math.max(maxLength, right - left + 1);
        }
        // 返回最长优雅子数组的长度
        return maxLength;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {1, 3, 8, 48, 10};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + longestNiceSubarray(nums1));

        // 测试用例2
        int[] nums2 = {3, 1, 5, 11, 13};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + longestNiceSubarray(nums2));
    }
}
