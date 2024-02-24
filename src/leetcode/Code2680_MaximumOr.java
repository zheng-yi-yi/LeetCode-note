package leetcode;

import java.util.Arrays;

/**
 * 2680. 最大或值
 * 
 * 给你一个下标从 0 开始长度为 n 的整数数组 nums 和一个整数 k 。
 * 每一次操作中，你可以选择一个数并将它乘 2 。
 * 你最多可以进行 k 次操作，请你返回 nums[0] | nums[1] | ... | nums[n - 1] 的最大值。
 * 
 * a | b 表示两个整数 a 和 b 的 按位或 运算。
 * 
 * 示例 1：
 * 输入：nums = [12,9], k = 1
 * 输出：30
 * 解释：如果我们对下标为 1 的元素进行操作，新的数组为 [12,18] 。此时得到最优答案为 12 和 18 的按位或运算的结果，也就是 30 。
 * 
 * 示例 2：
 * 输入：nums = [8,1,2], k = 2
 * 输出：35
 * 解释：如果我们对下标 0 处的元素进行操作，得到新数组 [32,1,2] 。此时得到最优答案为 32|1|2 = 35 。
 * 
 * 提示：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 * 1 <= k <= 15
 */
public class Code2680_MaximumOr {

    /**
     * 计算经过最多 k 次操作后数组中元素按位或的最大值
     * 
     * @param nums 整数数组
     * @param k    最多可以进行的操作次数
     * @return     数组中元素按位或的最大值
     */
    public static long maximumOr(int[] nums, int k) {
        int n = nums.length;
        int[] suffixOr = new int[n + 1]; // 存储后缀按位或运算的结果
        for (int i = n - 1; i > 0; i--) {
            suffixOr[i] = suffixOr[i + 1] | nums[i];
        }
        long ans = 0;
        for (int i = 0, prefixOr = 0; i < n; i++) {
            ans = Math.max(ans, prefixOr | ((long) nums[i] << k) | suffixOr[i + 1]);
            prefixOr |= nums[i]; // 更新前缀按位运算的结果
        }
        return ans;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {12, 9};
        int k1 = 1;
        System.out.println("输入: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("输出: " + maximumOr(nums1, k1));

        // 测试用例2
        int[] nums2 = {8, 1, 2};
        int k2 = 2;
        System.out.println("输入: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("输出: " + maximumOr(nums2, k2));
    }
}
