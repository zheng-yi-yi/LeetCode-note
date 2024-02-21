package leetcode;

import java.util.Arrays;

/**
 * 2917. 找出数组中的 K-or 值
 * 
 * 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * 
 * nums 中的 K-or 是一个满足以下条件的非负整数：
 * 只有在 nums 中，至少存在 k 个元素的第 i 位值为 1 ，那么 K-or 中的第 i 位的值才是 1 。
 * 返回 nums 的 K-or 值。
 * 
 * 注意 ：对于整数 x ，如果 (2^i AND x) == 2^i ，则 x 中的第 i 位值为 1 ，其中 AND 为按位与运算符。
 * 
 * 示例 1：
 * 输入：nums = [7,12,9,8,9,15], k = 4
 * 输出：9
 * 解释：nums[0]、nums[2]、nums[4] 和 nums[5] 的第 0 位的值为 1 。
 * nums[0] 和 nums[5] 的第 1 位的值为 1 。
 * nums[0]、nums[1] 和 nums[5] 的第 2 位的值为 1 。
 * nums[1]、nums[2]、nums[3]、nums[4] 和 nums[5] 的第 3 位的值为 1 。
 * 只有第 0 位和第 3 位满足数组中至少存在 k 个元素在对应位上的值为 1 。因此，答案为 2^0 + 2^3 = 9 。
 * 
 * 示例 2：
 * 输入：nums = [2,12,1,11,4,5], k = 6
 * 输出：0
 * 解释：因为 k == 6 == nums.length ，所以数组的 6-or 等于其中所有元素按位与运算的结果。因此，答案为 2 AND 12 AND 1 AND 11 AND 4 AND 5 = 0 。
 * 
 * 示例 3：
 * 输入：nums = [10,8,5,9,11,6,8], k = 1
 * 输出：15
 * 解释：因为 k == 1 ，数组的 1-or 等于其中所有元素按位或运算的结果。因此，答案为 10 OR 8 OR 5 OR 9 OR 11 OR 6 OR 8 = 15 。
 * 
 * 提示：
 * 1 <= nums.length <= 50
 * 0 <= nums[i] < 2^31
 * 1 <= k <= nums.length
 */
public class Code2917_FindKOr {

    /**
     * 返回数组的 K-or 值
     * 
     * @param nums 整数数组
     * @param k    整数
     * @return     数组的 K-or 值
     */
    public static int findKOr(int[] nums, int k) {
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; ++i) {
                if (((num >> i) & 1) > 0) {
                    count[i]++;
                }
            }
        }
        // count数组用于统计每一位上1的个数
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if (count[i] >= k) {
                res |= (1 << i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {7, 12, 9, 8, 9, 15};
        int k1 = 4;
        System.out.println("输入: nums = " + Arrays.toString(nums1) + ", k = " + k1);
        int result1 = findKOr(nums1, k1);
        System.out.println("输出: " + result1);

        // 测试用例2
        int[] nums2 = {2, 12, 1, 11, 4, 5};
        int k2 = 6;
        System.out.println("输入: nums = " + Arrays.toString(nums2) + ", k = " + k2);
        int result2 = findKOr(nums2, k2);
        System.out.println("输出: " + result2);

        // 测试用例3
        int[] nums3 = {10, 8, 5, 9, 11, 6, 8};
        int k3 = 1;
        System.out.println("输入: nums = " + Arrays.toString(nums3) + ", k = " + k3);
        int result3 = findKOr(nums3, k3);
        System.out.println("输出: " + result3);
    }
}
