# 1.两数之和

给定一个整数数组 `nums` 和一个整数目标值 `target`，请你在该数组中找出 **和为目标值 `target`**  的那 **两个** 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。


## 示例 1：


- 输入：`nums = [2,7,11,15], target = 9`
- 输出：`[0,1]`
- 解释：因为 `nums[0] + nums[1] == 9` ，返回 `[0, 1]` 。

## 示例 2：


- 输入：`nums = [3,2,4], target = 6`
- 输出：`[1,2]`

## 示例 3：


- 输入：`nums = [3,3], target = 6`
- 输出：`[0,1]`
 

提示：

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- `只会存在一个有效答案`
 

> 进阶：你可以想出一个时间复杂度小于 O(n^2) 的算法吗？

---

# 解题

## 暴力枚举

步骤如下：

1. 第一层循环中，`i` 从 `0` 遍历到 `n-2`
2. 第二层循环中，`j` 从 `i+1` 遍历到 `n-1`
3. 然后，只要找到 `nums[i]+nums[j]==target` ，就找到了答案，返回索引即可
4. 这就是暴力枚举。代码如下：

```java
class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
```

## 哈希法

步骤如下：

1. 用一层for循环，`i` 从 `0` 遍历到 `n-1`
2. 当我们遍历到某一个数 `nums[i]` 时，计算与之相加得到目标整数 `target` 的补数是多少，即 `complement = target - nums[i]`
3. 接着去哈希表中查找是否存在这个补数（complement）
4. 如果存在，我们需要返回当前数 `nums[i]` 的索引 `i` 以及哈希表中存储的补数对应的索引 `map.get(complement)`
5. 如果哈希表中不存在这个补数，那就将当前数 `nums[i]` 以及它的索引 `i` 都存进哈希映射表中，即 `map.put(nums[i], i)`
6. 这样边遍历边存入映射关系，就可以在某个节点找到我们要的答案。
7. 这就是哈希法，代码如下：

```java
class Solution {
    public int[] twoSum(int[] nums, int t) {
        // 创建一个哈希表，用于存储每个数及其对应的索引
        Map<Integer, Integer> map = new HashMap<>(); 
        // 数组的长度
        int n = nums.length; 
        for (int i = 0; i <= n-1; i++) { // 遍历数组，i 从 0 遍历到 n-1
        
            int complement = target - nums[i]; // 补数

            // 如果哈希表中已经包含了complement，说明找到了答案
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // 否则将当前数 nums[i] 及其索引 i 放入哈希表
            map.put(nums[i], i);

        }

        // 如果没有找到答案，返回一个空数组
        return new int[] {};
    }
}
```