package leetcode;

/**
 * 3028. 边界上的蚂蚁
 *
 * 边界上有一只蚂蚁，它有时向左走，有时向右走。
 * 给你一个非零整数数组 nums 。蚂蚁会按顺序读取 nums 中的元素，从第一个元素开始直到结束。每一步，蚂蚁会根据当前元素的值移动：
 * - 如果 nums[i] < 0 ，向左移动 -nums[i]单位。
 * - 如果 nums[i] > 0 ，向右移动 nums[i]单位。
 * 返回蚂蚁 返回 到边界上的次数。
 *
 * 注意：
 * - 边界两侧有无限的空间。
 * - 只有在蚂蚁移动了 |nums[i]| 单位后才检查它是否位于边界上。换句话说，如果蚂蚁只是在移动过程中穿过了边界，则不会计算在内。
 * 
 * 示例 1：
 * 输入：nums = [2,3,-5]
 * 输出：1
 * 解释：第 1 步后，蚂蚁距边界右侧 2 单位远。
 *      第 2 步后，蚂蚁距边界右侧 5 单位远。
 *      第 3 步后，蚂蚁位于边界上。
 *      所以答案是 1 。
 * 
 * 示例 2：
 * 输入：nums = [3,2,-3,-4]
 * 输出：0
 * 解释：第 1 步后，蚂蚁距边界右侧 3 单位远。
 *      第 2 步后，蚂蚁距边界右侧 5 单位远。
 *      第 3 步后，蚂蚁距边界右侧 2 单位远。
 *      第 4 步后，蚂蚁距边界左侧 2 单位远。
 *      蚂蚁从未返回到边界上，所以答案是 0 。
 * 
 * 提示：
 * - 1 <= nums.length <= 100
 * - -10 <= nums[i] <= 10
 * - nums[i] != 0
 */
public class Code3028_AntOnTheBoundary {

    static class Solution {
        public int returnToBoundaryCount(int[] nums) {
            int ans = 0;
            for(int i = 0, sum = 0; i<nums.length; i++) {
                sum += nums[i];
                if(sum == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        // 测试用例
        Solution solution = new Solution();
        int[] nums1 = {2, 3, -5};
        System.out.println("Test Case 1: " + solution.returnToBoundaryCount(nums1)); // Output: 1

        int[] nums2 = {3, 2, -3, -4};
        System.out.println("Test Case 2: " + solution.returnToBoundaryCount(nums2)); // Output: 0
    }
}