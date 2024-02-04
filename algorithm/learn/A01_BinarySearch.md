# 经典二分搜索

```java
// 经典二分搜索：
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        // 如果目标值在数组的左半部分
        if (arr[mid] == target) {
            return mid; // 找到目标值，返回索引
        } else if (arr[mid] < target) {
            left = mid + 1; // 调整左边界
        } else {
            right = mid - 1; // 调整右边界
        }
    }

    return -1; // 没有找到目标值
}
```

要求：

- 数组有序（升序），元素不重复。

# 查找目标值的左右边界

当数组中存在重复元素，要求使用二分查找法，找到等于 `target`的第一个元素的下标，即查找`target`的左边界，此时的二分思路是：

- 设`target`在闭区间`[left, right]`内
- 初始化`left`为`0`，`right`为`nums.length-1`，每次将区间缩小一半
- 当砍掉右区间时，区间更新为`[left, mid]`
- 当砍掉左区间时，区间更新为`[mid+1, right]`
- 当`left`等于`right`时，我们就找到了答案（因此循环条件为`left < right`）。

```java
// 查找target的左边界
// 将区间 [left,right] 二分为 [left,mid] 和 [mid+1,right]
public int binarySearchFirst(int[] nums, int target) {
    if (nums == null || nums.length == 0)
        return -1;
    
    int left = 0;
    int right = nums.length - 1;

    while(left < right) {
        int mid = left + (right - left) / 2;

        if(nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    if(nums[left] == target) return left;
    return -1;
}
```

如果是查找等于 `target`的最后一个元素的下标，即查找`target`的右边界，则模板如下：

```java
// 查找target的右边界
// 将区间 [left,right] 二分为 [left,mid-1] 和 [mid,right]
public int binarySearchLast(int[] nums, int target) {
    if (nums == null || nums.length == 0)
        return -1;
    
    int left = 0;
    int right = nums.length - 1;

    while(left < right) {
        int mid = left + (right - left + 1) / 2;	// 这里+1，向上取整，防止死循环

        if(nums[mid] <= target) { // 这里是 <=
            left = mid;
        } else {
            right = mid - 1;
        }
    }

    if(nums[left] == target) return left;
    return -1;
}
```



[二分查找模块全解 - 力扣（LeetCode）](https://leetcode.cn/circle/discuss/xYBtLt/#§-模板运用)