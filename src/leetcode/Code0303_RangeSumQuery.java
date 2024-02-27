package com.zyy2;

/**
 * 303. 区域和检索 - 数组不可变
 * 
 * 给定一个整数数组 nums，处理以下类型的多个查询:
 * - 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的和，其中 left <= right
 * 
 * 实现 NumArray 类：
 * - NumArray(int[] nums) 使用数组 nums 初始化对象
 * - int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的总和，包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] ）
 * 
 * 示例 1：
 * 输入：
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
 * 输出：
 * [null, 9, 8, 9]
 * 
 * 解释：
 * NumArray numArray = new NumArray([1, 3, 5]);
 * numArray.sumRange(0, 2); // 返回 9 (1 + 3 + 5)
 * numArray.sumRange(1, 2); // 返回 8 (3 + 5)
 * numArray.sumRange(0, 2); // 返回 9 (1 + 3 + 5)
 * 
 * 提示：
 * - 1 <= nums.length <= 10^4
 * - -10^5 <= nums[i] <= 10^5
 * - 0 <= i <= j < nums.length
 * - 最多调用 10^4 次 sumRange 方法
 */
public class Code0303_RangeSumQuery {

    static class NumArray {

        int[] sum;

        public NumArray(int[] nums) {
            int len = nums.length;
            sum = new int[len+1];
            for(int i = 0; i<len; i++) {
                sum[i+1] = sum[i] + nums[i];
            }
        }
        
        public int sumRange(int left, int right) {
            return sum[right+1] - sum[left];
        }
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums = {1, 3, 5};
        NumArray numArray = new NumArray(nums);
        System.out.println("sumRange(0, 2): " + numArray.sumRange(0, 2)); // 返回 9 (1 + 3 + 5)
        System.out.println("sumRange(1, 2): " + numArray.sumRange(1, 2)); // 返回 8 (3 + 5)
        System.out.println("sumRange(0, 0): " + numArray.sumRange(0, 0)); // 返回 1 (1)
    }
}
