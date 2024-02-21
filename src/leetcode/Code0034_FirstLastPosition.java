package leetcode;

import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。
 * 请你找出给定目标值在数组中的开始位置和结束位置。
 * 
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 * 
 * 示例 1：
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 
 * 示例 2：
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 
 * 示例 3：
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 * 
 * 提示：
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * nums 是一个非递减数组
 * -10^9 <= target <= 10^9
 */
public class Code0034_FirstLastPosition {

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     * 
     * @param nums   整数数组，按非递减顺序排列
     * @param target 目标值
     * @return       目标值在数组中的开始位置和结束位置，若不存在返回 [-1, -1]
     */
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = f1(nums, 0, n - 1, target);
        if (first == -1)
            return new int[]{-1, -1};
        int second = f2(nums, 0, n - 1, target);
        return new int[]{first, second};
    }

    // 在数组 nums 中找出值等于 target 的最左位置
    public static int f1(int[] nums, int left, int right, int target) {
        int ans = -1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // 在数组 nums 中找出值等于 target 的最右位置
    public static int f2(int[] nums, int left, int right, int target) {
        int ans = -1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = searchRange(nums1, target1);
        System.out.println("输入: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("输出: " + Arrays.toString(result1));

        // 测试用例2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = searchRange(nums2, target2);
        System.out.println("输入: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("输出: " + Arrays.toString(result2));

        // 测试用例3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = searchRange(nums3, target3);
        System.out.println("输入: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("输出: " + Arrays.toString(result3));
    }
}
