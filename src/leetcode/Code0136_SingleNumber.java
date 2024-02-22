package leetcode;

import java.util.Arrays;

/**
 * 136. 只出现一次的数字
 * 
 * 给你一个非空整数数组 nums，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * 
 * 示例 1：
 * 输入：nums = [2,2,1]
 * 输出：1
 * 
 * 示例 2：
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 
 * 示例 3：
 * 输入：nums = [1]
 * 输出：1
 * 
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * 除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 
 * 解：
 * 	这个问题可以通过使用异或运算来解决。
 * 	异或运算有一个特性，对于任何数x，都有x^x=0，x^0=x。
 * 	因此，如果我们将数组中的所有元素进行异或运算，那么结果就是只出现一次的元素。
 */
public class Code0136_SingleNumber {

    /**
     * 找出数组中只出现一次的数字
     * 
     * @param nums 非空整数数组
     * @return     数组中只出现一次的元素
     */
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {2, 2, 1};
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + singleNumber(nums1));

        // 测试用例2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + singleNumber(nums2));

        // 测试用例3
        int[] nums3 = {1};
        System.out.println("输入: nums = " + Arrays.toString(nums3));
        System.out.println("输出: " + singleNumber(nums3));
    }
}
