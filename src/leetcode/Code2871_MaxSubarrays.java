package leetcode;

import java.util.Arrays;

/**
 * 2871. 将数组分割成最多数目的子数组
 *
 * 给你一个只包含 非负 整数的数组 nums 。
 * 我们定义满足 l <= r 的子数组 nums[l..r] 的分数为 nums[l] AND nums[l + 1] AND ... AND nums[r] ，其中 AND 是按位与运算。
 * 请你将数组分割成一个或者更多子数组，满足：
 * - 每个 元素都 只 属于一个子数组。
 * - 子数组分数之和尽可能 小 。
 * 请你在满足以上要求的条件下，返回 最多 可以得到多少个子数组。
 *
 * 一个 子数组 是一个数组中一段连续的元素。
 *
 * 示例 1：
 * 输入：nums = [1,0,2,0,1,2]
 * 输出：3
 * 解释：我们可以将数组分割成以下子数组：
 * - [1,0] 。子数组分数为 1 AND 0 = 0 。
 * - [2,0] 。子数组分数为 2 AND 0 = 0 。
 * - [1,2] 。子数组分数为 1 AND 2 = 0 。
 * 分数之和为 0 + 0 + 0 = 0 ，是我们可以得到的最小分数之和。
 * 在分数之和为 0 的前提下，最多可以将数组分割成 3 个子数组。所以返回 3 。
 *
 * 示例 2：
 * 输入：nums = [5,7,1,3]
 * 输出：1
 * 解释：我们可以将数组分割成一个子数组：[5,7,1,3] ，分数为 1 ，这是可以得到的最小总分数。
 * 在总分数为 1 的前提下，最多可以将数组分割成 1 个子数组。所以返回 1 。
 *
 * 提示：
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^6
 */
public class Code2871_MaxSubarrays {

    /**
     * 将数组分割成最多数目的子数组
     *
     * @param nums 非负整数数组
     * @return 最多可以得到多少个子数组
     */
    public static int maxSubarrays(int[] nums) {
        int subarrayCount = 0;
        // -1的二进制表示是32个1，这可以保证与任何数进行按位与运算后的结果都是那个数本身
        int bitwiseAndResult = -1;
        for (int num : nums) {
            bitwiseAndResult &= num;
            if (bitwiseAndResult == 0) {
                // 如果结果为0，说明当前子数组的按位与运算结果为0，那么就可以将当前子数组划分出来
                // 然后开始一个新的子数组，同时将子数组的数量加1，将a重新设置为-1。
                subarrayCount++; 
                bitwiseAndResult = -1;
            }
        }
        return subarrayCount == 0 ? 1 : subarrayCount;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {1, 0, 2, 0, 1, 2};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + maxSubarrays(nums1));

        // 测试用例2
        int[] nums2 = {5, 7, 1, 3};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + maxSubarrays(nums2));
    }
}
