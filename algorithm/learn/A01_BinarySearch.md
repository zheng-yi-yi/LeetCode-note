# 二分查找

> “二分查找算法（binary search algorithm），也称折半搜索算法（half-interval search algorithm）、对数搜索算法（logarithmic search algorithm），是一种在有序数组中查找某一特定元素的搜索算法。搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。”
>
> “二分查找算法在最坏情况下是对数时间复杂度的，需要进行O(logn)次比较操作，二分查找算法使用常数空间，对于任何大小的输入数据，算法使用的空间都是一样的。除非输入数据数量很少，否则二分查找算法比线性搜索更快，但数组必须事先被排序。尽管一些特定的、为了快速搜索而设计的数据结构更有效（比如哈希表），二分查找算法应用面更广。”

- [二分查找](#二分查找)
  - [经典二分法](#经典二分法)
  - [查找\>=number的最左位置](#查找number的最左位置)
  - [查找\<=number的最右位置](#查找number的最右位置)
  - [查找目标值的左边界](#查找目标值的左边界)
  - [查找目标值的右边界](#查找目标值的右边界)
  - [学习资料](#学习资料)

## 经典二分法

利用二分查找判断一个数是否存在于数组中。

> 前提：数组有序（这里是升序）

```java
public static boolean isNumberInArray(int[] nums, int number) {
	if(nums == null || nums.length == 0) {
		return false;
	}
	int left = 0, right = nums.length - 1, mid = 0;
	while(left <= right) {
		mid = left + (right - left) / 2 ;
		
		if(nums[mid] == number) {
			return true;
		} else if(nums[mid] > number) {
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
```


## 查找>=number的最左位置

在有序数组中，利用二分法，查找`>=number`的最左位置（如果没有，则返回-1）。

```java
public static int findLeftmostGreaterOrEqual(int[] nums, int number) {
	
	int left = 0, right = nums.length - 1, mid = 0, ans = -1;
	
	while(left <= right) {
		mid = left + (right - left) / 2;
		
		if(nums[mid] >= number) {
			ans = mid;	// 记录下标
			right = mid - 1;
		} else {
			left = mid + 1;
		}
	}

	return ans;
}
```

## 查找<=number的最右位置

在有序数组中，利用二分法，查找<=number的最右位置（如果没有，则返回-1）

```java
public static int findRightmostLessOrEqual(int[] nums, int number) {
	
	int left = 0, right = nums.length - 1, mid = 0, ans = -1;
	
	while(left <= right) {
		mid = left + (right - left) / 2;
		
		if(nums[mid] <= number) {
			ans = mid;	// 记录下标
			left = mid + 1;
		} else {
			right = mid - 1;
		}
	}

	return ans;
}
```

## 查找目标值的左边界

利用二分法，在一个有序数组中找到第一个值为`target`的元素的下标。

```java
public static int findFirstIndex(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
        return -1; 
    }
	
	int left = 0, right = arr.length - 1, mid = 0, ans = -1;
	
	while(left <= right) {
		mid = left + (right - left) / 2;
		
		if(arr[mid] == target) {
			ans = mid;	// 记录下标
			right = mid - 1;	// 向左搜索
		} else if(arr[mid] > target){
			right = mid - 1;
		} else {
			left = mid + 1;
		}
	}

	return ans;
}
```



## 查找目标值的右边界

利用二分法，在一个有序数组中找到最后一个值为`target`的元素的下标。

```java
public static int findLastIndex(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
        return -1; 
    }
	
	int left = 0, right = arr.length - 1, mid = 0, ans = -1;
	
	while(left <= right) {
		mid = left + (right - left) / 2;
		
		if(arr[mid] == target) {
			ans = mid;	// 记录下标
			left = mid + 1;	// 向右搜索
		} else if(arr[mid] > target){
			right = mid - 1;
		} else {
			left = mid + 1;
		}
	}

	return ans;
}
```

## 学习资料

- [灵茶山艾府 | 【图解】一图掌握二分答案！四种写法！附题单！](https://leetcode.cn/problems/h-index-ii/solutions/2504326/tu-jie-yi-tu-zhang-wo-er-fen-da-an-si-ch-d15k/)
- [左程云 | 算法讲解006【入门】二分搜索](https://www.bilibili.com/video/BV1bX4y177uT/)