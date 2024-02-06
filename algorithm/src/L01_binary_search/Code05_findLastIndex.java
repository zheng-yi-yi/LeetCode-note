package L01_binary_search;

import java.util.Arrays;

public class Code05_findLastIndex {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
		printlnArr(arr);

		int target = 2;

		int result = findLastIndex(arr, target);

		if (result != -1) {
			System.out.println("最后一个值为 " + target + " 的元素的下标是: " + result);
		} else {
			System.out.println(target + " 不存在于数组中或数组为空。");
		}
	}

	/**
	 * 利用二分法在一个有序数组中找到最后一个值为target的元素的下标，如果没有则返回-1
	 */
	public static int findLastIndex(int[] arr, int target) {
		if (arr == null || arr.length == 0) {
			return -1;
		}

		int left = 0, right = arr.length - 1, mid = 0, ans = -1;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				ans = mid; // 记录下标
				left = mid + 1; // 向右搜索
			} else if (arr[mid] > target) {
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
