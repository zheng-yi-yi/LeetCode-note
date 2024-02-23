package leetcode;

import java.util.Arrays;

/**
 * 2980. 检查按位或是否存在尾随零
 *
 * 给你一个正整数数组 nums 。
 * 你需要检查是否可以从数组中选出两个或更多元素，满足这些元素的按位或运算（ OR）结果的二进制表示中至少存在一个尾随零。
 * 如果可以选择两个或更多元素，其按位或运算结果存在尾随零，返回 true；否则，返回 false 。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,4,5]
 * 输出：true
 * 解释：如果选择元素 2 和 4，按位或运算结果是 6，二进制表示为 "110" ，存在一个尾随零。
 *
 * 示例 2：
 * 输入：nums = [2,4,8,16]
 * 输出：true
 * 解释：如果选择元素 2 和 4，按位或运算结果是 6，二进制表示为 "110"，存在一个尾随零。
 * 其他按位或运算结果存在尾随零的可能选择方案包括：(2, 8), (2, 16), (4, 8), (4, 16), (8, 16), (2, 4, 8), (2, 4, 16), (2, 8, 16), (4, 8, 16), 以及 (2, 4, 8, 16) 。
 *
 * 示例 3：
 * 输入：nums = [1,3,5,7,9]
 * 输出：false
 * 解释：不存在按位或运算结果存在尾随零的选择方案。
 *
 * 提示：
 * 2 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class Code2980_HasTrailingZeros {

    /**
     * 检查按位或是否存在尾随零
     *
     * @param nums 正整数数组
     * @return 是否存在满足条件的两个或更多元素
     */
    public static boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num & 1) == 0) {
                count++;
            }
        }
        return count >= 2;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + hasTrailingZeros(nums1));

        // 测试用例2
        int[] nums2 = {2, 4, 8, 16};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + hasTrailingZeros(nums2));

        // 测试用例3
        int[] nums3 = {1, 3, 5, 7, 9};
        System.out.println("输入: nums = " + Arrays.toString(nums3));
        System.out.println("输出: " + hasTrailingZeros(nums3));
    }
}
