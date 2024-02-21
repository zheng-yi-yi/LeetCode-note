package leetcode;

/**
 * 704. 二分查找
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 * 提示：
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class Code0704_binary_search {
	
	class Solution {
	    public int search(int[] nums, int target) {
	        int ans = -1; // 初始化结果为-1，表示未找到目标值
	        int n = nums.length; // 数组长度

	        // 二分查找
	        for (int left = 0, right = n - 1, mid; left <= right;) {
	            mid = left + (right - left) / 2; // 计算中间索引

	            if (nums[mid] == target) { // 如果中间值等于目标值
	                ans = mid; // 更新结果为当前中间索引
	                break; // 找到目标值，退出循环
	            } else if (nums[mid] > target) { // 如果中间值大于目标值
	                right = mid - 1; // 缩小右边界
	            } else { // 如果中间值小于目标值
	                left = mid + 1; // 缩小左边界
	            }
	        }

	        return ans; // 返回结果
	    }
	}
	
	public static Code0704_binary_search.Solution solution = new Code0704_binary_search().new Solution();
	
	public static void main(String[] args) {
		// 示例测试
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int result1 = solution.search(nums1, target1);
        System.out.println("示例1结果：" + result1); // 应该输出 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int result2 = solution.search(nums2, target2);
        System.out.println("示例2结果：" + result2); // 应该输出 -1
	}
}
