# 4. 寻找两个正序数组的中位数

给定两个大小分别为 `m` 和 `n` 的正序（从小到大）数组 `nums1` 和 `nums2`。请你找出并返回这两个正序数组的 **中位数** 。

算法的时间复杂度应该为 `O(log (m+n))` 。

**示例 1：**

```
输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2
```

**示例 2：**

```
输入：nums1 = [1,2], nums2 = [3,4]
输出：2.50000
解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
```

**提示：**

- `nums1.length == m`
- `nums2.length == n`
- `0 <= m <= 1000`
- `0 <= n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

---

# 解题

## 思路一

一种直观的思路，就是归并后再去求中位数。

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // 合并两个有序数组
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // 根据合并后数组的长度，找中位数
        if ((m + n) % 2 == 0) {
            int mid1 = merged[(m + n) / 2];
            int mid2 = merged[(m + n) / 2 - 1];
            return (double) (mid1 + mid2) / 2.0;
        } else {
            return (double) merged[(m + n) / 2];
        }
    }
}
```

但如何要使得算法的时间复杂度为 `O(log (m+n))` 。此时应该想到二分。

## 思路二

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 确保 nums1 的长度小于等于 nums2，以便在二分查找中使用
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length; // 数组 nums1 的长度
        int n = nums2.length; // 数组 nums2 的长度
        int iMin = 0, iMax = m; // 用于二分查找的最小和最大索引范围
        int halfLen = (m + n + 1) / 2; // 两个数组的中位数所在位置

        // 使用二分查找找到合适的分割点，使左半部分的元素都小于右半部分的元素
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2; // 尝试将 nums1 分割点放在 i 的位置
            int j = halfLen - i; // 根据分割点计算 nums2 的分割点位置

            if (i < m && nums2[j - 1] > nums1[i]) {
                // 当 nums2 的左半部分的最大值大于 nums1 的分割点时，需要增加 i
                iMin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                // 当 nums1 的左半部分的最大值大于 nums2 的分割点时，需要减小 i
                iMax = i - 1;
            } else {
                // 找到合适的分割点 i

                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }

                if ((m + n) % 2 == 1) {
                    // 如果总长度为奇数，中位数为左半部分的最大值
                    return (double) maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                // 如果总长度为偶数，中位数为左半部分的最大值和右半部分的最小值的平均值
                return (double) (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0; // 如果没有找到中位数，返回0.0
    }
}
```

