package L01_binary_search;

import java.util.Arrays;

public class Code03_findRightmostLessOrEqual {

	public static void main(String[] args) {

		int[] nums = { 10, 30, 40, 40, 70, 90 };
		printlnArr(nums);

		int numberToFind = 50;
		int result = findRightmostLessOrEqual(nums, numberToFind);

		if (result != -1) {
			System.out.println("小于等于 " + numberToFind + " 的最右位置是：" + result);
		} else {
			System.out.println("数组中没有小于等于 " + numberToFind + " 的元素。");
		}
	}

	/**
	 * 在有序数组中，利用二分法，查找<=number的最右位置（如果没有，则返回-1）
	 */
	public static int findRightmostLessOrEqual(int[] nums, int number) {

		int left = 0, right = nums.length - 1, mid = 0, ans = -1;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (nums[mid] <= number) {
				ans = mid; // 记录下标
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return ans;
	}

	/**
	 * 打印数组
	 */
	public static void printlnArr(int[] nums) {
		System.out.print("当前数组：");
		Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
		System.out.println();
	}
}
