package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 46. 全排列
 * 
 * 给定一个不含重复数字的数组 nums ，返回其所有可能的全排列。你可以按任意顺序返回答案。
 * 
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 示例 2：
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 
 * 示例 3：
 * 输入：nums = [1]
 * 输出：[[1]]
 * 
 * 提示：
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数互不相同
 */
public class Code0046_Permutations {

    /**
     * 返回不含重复数字的数组的所有可能的全排列
     * 
     * @param nums 不含重复数字的数组
     * @return 所有可能的全排列
     */
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(nums, 0, results);
        return results;
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> results) {
        if (start == nums.length) {
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                result.add(num);
            }
            results.add(result);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, results);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] nums1 = { 1, 2, 3 };
        System.out.println("输入: nums = " + Arrays.toString(nums1));
        System.out.println("输出: " + permute(nums1));

        // 测试用例2
        int[] nums2 = { 0, 1 };
        System.out.println("输入: nums = " + Arrays.toString(nums2));
        System.out.println("输出: " + permute(nums2));

        // 测试用例3
        int[] nums3 = { 1 };
        System.out.println("输入: nums = " + Arrays.toString(nums3));
        System.out.println("输出: " + permute(nums3));
    }
}
