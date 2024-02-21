package leetcode;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
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

public class Code0034_searchRange {
	
	class Solution {
	    // 返回目标值在数组中的起始和结束位置
	    public int[] searchRange(int[] nums, int target) {
	        int n = nums.length;
	        // 找出目标值在数组中的最左位置
	        int first = f1(nums, 0, n-1, target);
	        // 如果目标值不存在于数组中，返回[-1, -1]
	        if(first == -1) return new int[]{-1, -1};
	        // 找出目标值在数组中的最右位置
	        int second = f2(nums, 0, n-1, target);
	        // 返回目标值在数组中的起始和结束位置
	        return new int[]{first, second};
	    }

	    // 在数组 nums 中找出值等于 target 的最左位置
	    public int f1(int[] nums, int left, int right, int target) {
	        int ans = -1;
	        int mid;
	        while(left <= right) {
	            mid = left + (right - left) / 2;
	            // 如果找到目标值，记录位置，并继续在左半部分查找
	            if(nums[mid] == target) {
	                ans = mid;
	                right = mid - 1;
	            } else if(nums[mid] > target) {
	                // 如果当前值大于目标值，在左半部分查找
	                right = mid - 1;
	            } else {
	                // 如果当前值小于目标值，在右半部分查找
	                left = mid + 1;
	            }
	        }
	        // 返回目标值在数组中的最左位置，如果不存在返回-1
	        return ans;
	    }

	    // 在数组 nums 中找出值等于 target 的最右位置
	    public int f2(int[] nums, int left, int right, int target) {
	        int ans = -1;
	        int mid;
	        while(left <= right) {
	            mid = left + (right - left) / 2;
	            // 如果找到目标值，记录位置，并继续在右半部分查找
	            if(nums[mid] == target) {
	                ans = mid;
	                left = mid + 1;
	            } else if(nums[mid] > target) {
	                // 如果当前值大于目标值，在左半部分查找
	                right = mid - 1;
	            } else {
	                // 如果当前值小于目标值，在右半部分查找
	                left = mid + 1;
	            }
	        }
	        // 返回目标值在数组中的最右位置，如果不存在返回-1
	        return ans;
	    }
	}
	
	public static Code0034_searchRange.Solution solution = new Code0034_searchRange().new Solution();
	
	public static void main(String[] args) {
		// 示例测试
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("示例1结果：" + result1[0] + ", " + result1[1]); // [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("示例2结果：" + result2[0] + ", " + result2[1]); // [-1, -1]

        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("示例3结果：" + result3[0] + ", " + result3[1]); // [-1, -1]
	}
}