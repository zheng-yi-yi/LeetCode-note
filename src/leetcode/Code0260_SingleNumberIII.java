package leetcode;

import java.util.Arrays;

/**
 * 260. 只出现一次的数字 III
 * 
 * 给你一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。找出只出现一次的那两个元素。你可以按任意顺序返回答案。
 * 
 * 你必须设计并实现线性时间复杂度的算法且仅使用常量额外空间来解决此问题。
 * 
 * 示例 1：
 * 输入：nums = [1,2,1,3,2,5]
 * 输出：[3,5]
 * 解释：[5, 3] 也是有效的答案。
 * 
 * 示例 2：
 * 输入：nums = [-1,0]
 * 输出：[-1,0]
 * 
 * 示例 3：
 * 输入：nums = [0,1]
 * 输出：[1,0]
 * 
 * 提示：
 * 2 <= nums.length <= 3 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 除两个只出现一次的整数外，nums 中的其他数字都出现两次
 * 
 * 解：
 * 首先将数组中的所有元素进行异或运算，得到的结果是只出现一次的两个元素的异或结果。
 * 然后我们找到这个结果中的任意一个为1的位，根据这一位将数组中的元素分为两组，
 * 每组中包含一个只出现一次的元素，其他元素都出现两次。
 * 然后我们对每组元素进行异或运算，得到的结果就是只出现一次的元素。
 */
public class Code0260_SingleNumberIII {

    /**
     * 找出数组中只出现一次的两个元素
     * 
     * @param nums 整数数组，其中恰好有两个元素只出现一次，其余所有元素均出现两次
     * @return     只出现一次的两个元素
     */
    public static int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }
        int diff = bitmask & (-bitmask);
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        return new int[]{x, bitmask ^ x};
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        int[] result1 = singleNumber(nums1);
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + Arrays.toString(result1));

        // 测试用例2
        int[] nums2 = {-1, 0};
        int[] result2 = singleNumber(nums2);
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + Arrays.toString(result2));

        // 测试用例3
        int[] nums3 = {0, 1};
        int[] result3 = singleNumber(nums3);
        System.out.println("输入: nums = " + Arrays.toString(nums3));
        System.out.println("输出: " + Arrays.toString(result3));
    }
}
