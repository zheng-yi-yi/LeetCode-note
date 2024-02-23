package leetcode;

import java.util.Arrays;

/**
 * 477. 汉明距离总和
 *
 * 两个整数的汉明距离指的是这两个数字的二进制数对应位不同的数量。
 * 给你一个整数数组 nums，请你计算并返回 nums 中任意两个数之间汉明距离的总和。
 *
 * 示例 1：
 * 输入：nums = [4,14,2]
 * 输出：6
 * 解释：在二进制表示中，4 表示为 0100 ，14 表示为 1110 ，2表示为 0010 。
 * 所以答案为：
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6
 *
 * 示例 2：
 * 输入：nums = [4,14,4]
 * 输出：4
 *
 * 提示：
 * 1 <= nums.length <= 10^4
 * 0 <= nums[i] <= 10^9
 * 给定输入的对应答案符合 32-bit 整数范围
 */
public class Code0477_TotalHammingDistance {

    /**
     * 计算任意两个数之间汉明距离的总和
     *
     * @param nums 整数数组
     * @return 任意两个数之间汉明距离的总和
     */
    public static int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int j = 0; j < n; j++) {
                bitCount += (nums[j] >> i) & 1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {4, 14, 2};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + totalHammingDistance(nums1));

        // 测试用例2
        int[] nums2 = {4, 14, 4};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + totalHammingDistance(nums2));
    }
}
