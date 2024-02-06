package L01_binary_search;

public class Code01_isNumberInArray {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 测试数组

		int numberToFind = 7; // 测试数字

		boolean result = isNumberInArray(nums, numberToFind);

		if (result) {
			System.out.println(numberToFind + " 在数组中");
		} else {
			System.out.println(numberToFind + " 不在数组中");
		}
	}

	/**
	 * 利用二分查找，加速判断一个数是否存在于数组中
	 * 使用前提：数组有序（这里是升序）
	 */
	public static boolean isNumberInArray(int[] nums, int number) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int left = 0, right = nums.length - 1, mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;

			if (nums[mid] == number) {
				return true;
			} else if (nums[mid] > number) {
				// 如果连mid处的元素都大于number，那么mid右侧的元素肯定都大于number，因为数组是升序的嘛
				// 因此我们砍掉右区间（即向左搜索），此时区间更新为：[left, mid-1];
				right = mid - 1;
			} else {
				// 同上，此时向右搜索，区间更新为：[mid+1, right]
				left = mid + 1;
			}
		}
		return false;
	}
}
