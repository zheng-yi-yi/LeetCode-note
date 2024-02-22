package leetcode;

import java.util.Arrays;

/**
 * 137. 只出现一次的数字 II
 * 
 * 给你一个整数数组 nums，除某个元素仅出现一次外，其余每个元素都恰出现三次。请你找出并返回那个只出现了一次的元素。
 * 
 * 你必须设计并实现线性时间复杂度的算法且使用常数级空间来解决此问题。
 * 
 * 示例 1：
 * 输入：nums = [2,2,3,2]
 * 输出：3
 * 
 * 示例 2：
 * 输入：nums = [0,1,0,1,0,1,99]
 * 输出：99
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次
 * 
 * 解：
 * 	使用一个长度为32的数组来记录每一位上1的个数，
 * 	然后对每一位上的1的个数取模3，
 * 	如果结果不为0，那么只出现一次的元素的这一位就是1。
 */
public class Code0137_SingleNumberII {

    /**
     * 找出数组中只出现一次的元素
     * 
     * @param nums 整数数组，除某个元素仅出现一次外，其余每个元素都恰出现三次
     * @return     只出现一次的元素
     */
    public static int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; ++i) {
                if (((num >> i) & 1) > 0) {
                    count[i]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if (count[i] % 3 != 0) {
                res |= (1 << i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {2, 2, 3, 2};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + singleNumber(nums1));

        // 测试用例2
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + singleNumber(nums2));
    }
}
