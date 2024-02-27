package com.zyy2;

import java.util.HashMap;

/**
 * 560. 和为 K 的子数组
 * 
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回该数组中和为 k 的子数组的个数。
 * 子数组是数组中元素的连续非空序列。
 * 
 * 示例 1：
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 * 示例 2：
 * 输入：nums = [1,2,3], k = 3
 * 输出：2
 * 
 * 提示：
 * - 1 <= nums.length <= 2 * 10^4
 * - -1000 <= nums[i] <= 1000
 * - -10^7 <= k <= 10^7
 */
public class Code0560_SubarraySum {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int ans = 0, sum = 0;
            HashMap <Integer, Integer> map = new HashMap <> ();
            map.put(0, 1); // 前缀和为0的情况，出现次数为1
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                // 检查是否存在前缀和为sum-k的前缀，如果存在，说明从该前缀到当前位置的子数组和为k
                if (map.containsKey(sum - k))
                    ans += map.get(sum - k); 
                map.put(sum, map.getOrDefault(sum, 0) + 1);	// 将当前前缀和的次数加1，存入哈希表
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        // 测试用例
        Solution solution = new Solution();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test Case 1: " + solution.subarraySum(nums1, k1)); // Output: 2

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Test Case 2: " + solution.subarraySum(nums2, k2)); // Output: 2
    }
}
