package L01_binary_search;

import java.util.Arrays;

public class Code02_findLeftmostGreaterOrEqual {

	public static void main(String[] args) {

		int[] nums = { 10, 30, 40, 40, 70, 90 };
		printlnArr(nums);

		int numberToFind = 50;
		int result = findLeftmostGreaterOrEqual(nums, numberToFind);

		if (result != -1) {
			System.out.println("大于等于 " + numberToFind + " 的最左位置是：" + result);
		} else {
			System.out.println("数组中没有大于等于 " + numberToFind + " 的元素。");
		}
	}

	/**
	 * 在有序数组中，利用二分法，查找>=number的最左位置（如果没有，则返回-1）
	 */
	public static int findLeftmostGreaterOrEqual(int[] nums, int number) {

		int left = 0, right = nums.length - 1, mid = 0, ans = -1;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (nums[mid] >= number) {
				ans = mid; // 记录下标
				right = mid - 1;
			} else {
				left = mid + 1;
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
