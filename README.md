<div align="center">

<h1>LeetCode-note</h1>

</div>

# 目录

- [目录](#目录)
- [笔记](#笔记)
- [题单](#题单)
  - [二分查找](#二分查找)
  - [前缀和](#前缀和)
  - [滑动窗口](#滑动窗口)
  - [双指针](#双指针)
  - [记忆化搜索](#记忆化搜索)
  - [动态规划](#动态规划)
    - [一维dp](#一维dp)
    - [二维dp](#二维dp)
  - [深度优先搜索](#深度优先搜索)
  - [广度优先搜索](#广度优先搜索)
  - [并查集](#并查集)
  - [回溯](#回溯)
  - [贪心](#贪心)
  - [字符串](#字符串)
  - [位运算](#位运算)
  - [栈](#栈)
  - [队列](#队列)
  - [单调栈](#单调栈)
  - [单调队列](#单调队列)
  - [优先队列](#优先队列)
  - [哈希表](#哈希表)
  - [其他](#其他)
    - [网格图 | 岛屿问题（洪水填充解法）](#网格图--岛屿问题洪水填充解法)
    - [组合问题](#组合问题)

# 笔记

- [ACM模式](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/note/note001_pattern.md)
- [二分查找算法](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/note/note002_BinarySearch.md)

# 题单

## 二分查找


| 题目                                                                                                                                                            | 参考                                                                                                                     | 标签                 | 难度 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------ | -------------------- | ---- |
| [704. 二分查找](https://leetcode.cn/problems/binary-search/)                                                                                                    | [binary_search](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0704_binary_search.java)         | 数组、二分查找       | 简单 |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/)             | [FirstLastPosition](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0034_FirstLastPosition.java) | 数组、二分查找       | 中等 |
| [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/description/)                                                                            |                                                                                                                          | 数组、二分查找       | 简单 |
| [69. x 的平方根](https://leetcode.cn/problems/sqrtx/description/)                                                                                               |                                                                                                                          | 数学、二分查找       | 简单 |
| [367. 有效的完全平方数](https://leetcode.cn/problems/valid-perfect-square/description/)                                                                         |                                                                                                                          | 数学、二分查找       | 简单 |
| [744. 寻找比目标字母大的最小字母](https://leetcode.cn/problems/find-smallest-letter-greater-than-target/description/?envType=study-plan-v2&envId=binary-search) |                                                                                                                          | 数组、二分查找       | 简单 |
| [1351. 统计有序矩阵中的负数](https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/)                                               |                                                                                                                          | 数组、二分查找、矩阵 | 简单 |
| [878. 第 N 个神奇数字](https://leetcode.cn/problems/nth-magical-number/description/)                                                                            |                                                                                                                          | 数学、二分查找       | 困难 |
| [374. 猜数字大小](https://leetcode.cn/problems/guess-number-higher-or-lower)                                                                                    |                                                                                                                          |                      |      |
| [74. 搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix)                                                                                             |                                                                                                                          |                      |      |
| [278. 第一个错误的版本](https://leetcode.cn/problems/first-bad-version)                                                                                         |                                                                                                                          |                      |      |
| [540. 有序数组中的单一元素](https://leetcode.cn/problems/single-element-in-a-sorted-array)                                                                      |                                                                                                                          |                      |      |
| [33. 搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array)                                                                             |                                                                                                                          |                      |      |
| [153. 寻找旋转排序数组中的最小值](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array)                                                            |                                                                                                                          |                      |      |
| [275. H 指数 II](https://leetcode.cn/problems/h-index-ii)                                                                                                       |                                                                                                                          |                      |      |
| [240. 搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii)                                                                                      |                                                                                                                          |                      |      |
| [875. 爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas)                                                                                         |                                                                                                                          |                      |      |
| [1011. 在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days)                                                           |                                                                                                                          |                      |      |
| [1283. 使结果不超过阈值的最小除数](https://leetcode.cn/problems/find-the-smallest-divisor-given-a-threshold)                                                    |                                                                                                                          |                      |      |
| [1482. 制作 m 束花所需的最少天数](https://leetcode.cn/problems/minimum-number-of-days-to-make-m-bouquets)                                                       |                                                                                                                          |                      |      |
| [1552. 两球之间的磁力](https://leetcode.cn/problems/magnetic-force-between-two-balls)                                                                           |                                                                                                                          |                      |      |
| [81. 搜索旋转排序数组 II](https://leetcode.cn/problems/search-in-rotated-sorted-array-ii)                                                                       |                                                                                                                          |                      |      |
| [154. 寻找旋转排序数组中的最小值 II](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array-ii)                                                      |                                                                                                                          |                      |      |
| [436. 寻找右区间](https://leetcode.cn/problems/find-right-interval)                                                                                             |                                                                                                                          |                      |      |
| [162. 寻找峰值](https://leetcode.cn/problems/find-peak-element)                                                                                                 |                                                                                                                          |                      |      |
| [1901. 寻找峰值 II](https://leetcode.cn/problems/find-a-peak-element-ii)                                                                                        |                                                                                                                          |                      |      |
| [668. 乘法表中第 k 小的数](https://leetcode.cn/problems/kth-smallest-number-in-multiplication-table)                                                            |                                                                                                                          |                      |      |
| [911. 在线选举](https://leetcode.cn/problems/online-election)                                                                                                   |                                                                                                                          |                      |      |
| [981. 基于时间的键值存储](https://leetcode.cn/problems/time-based-key-value-store)                                                                              |                                                                                                                          |                      |      |
| [1146. 快照数组](https://leetcode.cn/problems/snapshot-array)                                                                                                   |                                                                                                                          |                      |      |
| [4. 寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays)                                                                         |                                                                                                                          |                      |      |
| [1095. 山脉数组中查找目标值](https://leetcode.cn/problems/find-in-mountain-array)                                                                               |                                                                                                                          |                      |      |


## 前缀和

| 题目                                                         | 参考                                                         | 标签                             | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------- | ---- |
| [3028. 边界上的蚂蚁](https://leetcode.cn/problems/ant-on-the-boundary/description/) | [AntOnTheBoundary](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code3028_AntOnTheBoundary.java) | 数组、前缀和、模拟               | 简单 |
| [303. 区域和检索 - 数组不可变⁤](https://leetcode.cn/problems/range-sum-query-immutable/description/) | [RangeSumQuery](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0303_RangeSumQuery.java) | 设计、数组、前缀和               | 简单 |
| [560. 和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/description/) | [SubarraySum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0560_SubarraySum.java) | 数组、哈希表、前缀和             | 中等 |
| [1124. 表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval/description/) |                                                              | 栈、数组、哈希表、前缀和、单调栈 | 中等 |
| [1590. 使数组和能被 P 整除](https://leetcode.cn/problems/make-sum-divisible-by-p/description/) |                                                              | 数组、哈希表、前缀和             | 中等 |
| [1371. 每个元音包含偶数次的最长子字符串](https://leetcode.cn/problems/find-the-longest-substring-containing-vowels-in-even-counts/description/) |                                                              | 位运算、哈希表、字符串、前缀和   | 中等 |
| [304. 二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable) |                                                              |                                  |      |
| [1480. 一维数组的动态和](https://leetcode.cn/problems/running-sum-of-1d-array) |                                                              |                                  |      |
| [1413. 逐步求和得到正数的最小值](https://leetcode.cn/problems/minimum-value-to-get-positive-step-by-step-sum) |                                                              |                                  |      |
| [724. 寻找数组的中心下标](https://leetcode.cn/problems/find-pivot-index) |                                                              |                                  |      |
| [1310. 子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray) |                                                              |                                  |      |
| [974. 和可被 K 整除的子数组](https://leetcode.cn/problems/subarray-sums-divisible-by-k) |                                                              |                                  |      |
| [523. 连续的子数组和](https://leetcode.cn/problems/continuous-subarray-sum) |                                                              |                                  |      |
| [525. 连续数组](https://leetcode.cn/problems/contiguous-array) |                                                              |                                  |      |
| [1109. 航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings) |                                                              |                                  |      |
| [1737. 满足三条件之一需改变的最少字符数](https://leetcode.cn/problems/change-minimum-characters-to-satisfy-one-of-three-conditions) |                                                              |                                  |      |
| [1744. 你能在你最喜欢的那天吃到你最喜欢的糖果吗？](https://leetcode.cn/problems/can-you-eat-your-favorite-candy-on-your-favorite-day) |                                                              |                                  |      |
| [1685. 有序数组中差绝对值之和](https://leetcode.cn/problems/sum-of-absolute-differences-in-a-sorted-array) |                                                              |                                  |      |
| [1674. 使数组互补的最少操作次数](https://leetcode.cn/problems/minimum-moves-to-make-array-complementary) |                                                              |                                  |      |
| [1124. 表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval) |                                                              |                                  |      |
| [1292. 元素和小于等于阈值的正方形的最大边长](https://leetcode.cn/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold) |                                                              |                                  |      |
| [1074. 元素和为目标值的子矩阵数量](https://leetcode.cn/problems/number-of-submatrices-that-sum-to-target) |                                                              |                                  |      |

## 滑动窗口

| 题目                                                                                                                                                          | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [643. 子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i)                                                                            |      |      |
| [1343. 大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold) |      |      |
| [1423. 可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards)                                                               |      |      |
| [1052. 爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner)                                                                                 |      |      |
| [1456. 定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length)                                        |      |      |
| [567. 字符串的排列](https://leetcode.cn/problems/permutation-in-string)                                                                                       |      |      |
| [438. 找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string)                                                                 |      |      |
| [3. 无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters)                                                        |      |      |
| [1208. 尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget)                                                                   |      |      |
| [1004. 最大连续 1 的个数 III](https://leetcode.cn/problems/max-consecutive-ones-iii)                                                                          |      |      |
| [904. 水果成篮](https://leetcode.cn/problems/fruit-into-baskets)                                                                                              |      |      |
| [209. 长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum)                                                                               |      |      |
| [1658. 将 x 减到 0 的最小操作数](https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero)                                                         |      |      |
| [1695. 删除子数组的最大得分](https://leetcode.cn/problems/maximum-erasure-value)                                                                              |      |      |
| [713. 乘积小于 K 的子数组](https://leetcode.cn/problems/subarray-product-less-than-k)                                                                         |      |      |
| [1358. 包含所有三种字符的子字符串数目](https://leetcode.cn/problems/number-of-substrings-containing-all-three-characters)                                     |      |      |
| [1248. 统计「优美子数组」](https://leetcode.cn/problems/count-number-of-nice-subarrays)                                                                       |      |      |
| [30. 串联所有单词的子串](https://leetcode.cn/problems/substring-with-concatenation-of-all-words)                                                              |      |      |
| [76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring)                                                                                     |      |      |
| [424. 替换后的最长重复字符](https://leetcode.cn/problems/longest-repeating-character-replacement)                                                             |      |      |
| [992. K 个不同整数的子数组](https://leetcode.cn/problems/subarrays-with-k-different-integers)                                                                 |      |      |
| [1234. 替换子串得到平衡字符串](https://leetcode.cn/problems/replace-the-substring-for-balanced-string)                                                        |      |      |
| [995. K 连续位的最小翻转次数](https://leetcode.cn/problems/minimum-number-of-k-consecutive-bit-flips)                                                         |      |      |
| [480. 滑动窗口中位数](https://leetcode.cn/problems/sliding-window-median)                                                                                     |      |      |

## 双指针

| 题目                                                                                                                      | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [344. 反转字符串](https://leetcode.cn/problems/reverse-string)                                                            |      |      |
| [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array)                                                   |      |      |
| [905. 按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity)                                                  |      |      |
| [922. 按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii)                                            |      |      |
| [541. 反转字符串 II](https://leetcode.cn/problems/reverse-string-ii)                                                      |      |      |
| [557. 反转字符串中的单词 III](https://leetcode.cn/problems/reverse-words-in-a-string-iii)                                 |      |      |
| [345. 反转字符串中的元音字母](https://leetcode.cn/problems/reverse-vowels-of-a-string)                                    |      |      |
| [917. 仅仅反转字母](https://leetcode.cn/problems/reverse-only-letters)                                                    |      |      |
| [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome)                                                          |      |      |
| [680. 验证回文串 II](https://leetcode.cn/problems/valid-palindrome-ii)                                                    |      |      |
| [167. 两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted)                          |      |      |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array)                            |      |      |
| [27. 移除元素](https://leetcode.cn/problems/remove-element)                                                               |      |      |
| [283. 移动零](https://leetcode.cn/problems/move-zeroes)                                                                   |      |      |
| [349. 两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays)                                            |      |      |
| [350. 两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii)                                      |      |      |
| [653. 两数之和 IV - 输入二叉搜索树](https://leetcode.cn/problems/two-sum-iv-input-is-a-bst)                               |      |      |
| [392. 判断子序列](https://leetcode.cn/problems/is-subsequence)                                                            |      |      |
| [11. 盛最多水的容器](https://leetcode.cn/problems/container-with-most-water)                                              |      |      |
| [1679. K 和数对的最大数目](https://leetcode.cn/problems/max-number-of-k-sum-pairs)                                        |      |      |
| [15. 三数之和](https://leetcode.cn/problems/3sum)                                                                         |      |      |
| [16. 最接近的三数之和](https://leetcode.cn/problems/3sum-closest)                                                         |      |      |
| [18. 四数之和](https://leetcode.cn/problems/4sum)                                                                         |      |      |
| [658. 找到 K 个最接近的元素](https://leetcode.cn/problems/find-k-closest-elements)                                        |      |      |
| [1471. 数组中的 k 个最强值](https://leetcode.cn/problems/the-k-strongest-values-in-an-array)                              |      |      |
| [969. 煎饼排序](https://leetcode.cn/problems/pancake-sorting)                                                             |      |      |
| [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii)                      |      |      |
| [1089. 复写零](https://leetcode.cn/problems/duplicate-zeros)                                                              |      |      |
| [611. 有效三角形的个数](https://leetcode.cn/problems/valid-triangle-number)                                               |      |      |
| [825. 适龄的朋友](https://leetcode.cn/problems/friends-of-appropriate-ages)                                               |      |      |
| [986. 区间列表的交集](https://leetcode.cn/problems/interval-list-intersections)                                           |      |      |
| [443. 压缩字符串](https://leetcode.cn/problems/string-compression)                                                        |      |      |
| [925. 长按键入](https://leetcode.cn/problems/long-pressed-name)                                                           |      |      |
| [31. 下一个排列](https://leetcode.cn/problems/next-permutation)                                                           |      |      |
| [923. 三数之和的多种可能](https://leetcode.cn/problems/3sum-with-multiplicity)                                            |      |      |
| [475. 供暖器](https://leetcode.cn/problems/heaters)                                                                       |      |      |
| [838. 推多米诺](https://leetcode.cn/problems/push-dominoes)                                                               |      |      |
| [481. 神奇字符串](https://leetcode.cn/problems/magical-string)                                                            |      |      |
| [1712. 将数组分成三个子数组的方案数](https://leetcode.cn/problems/ways-to-split-array-into-three-subarrays)               |      |      |
| [795. 区间子数组个数](https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum)                              |      |      |
| [1616. 分割两个字符串得到回文串](https://leetcode.cn/problems/split-two-strings-to-make-palindrome)                       |      |      |
| [719. 找出第 K 小的数对距离](https://leetcode.cn/problems/find-k-th-smallest-pair-distance)                               |      |      |
| [1498. 满足条件的子序列数目](https://leetcode.cn/problems/number-of-subsequences-that-satisfy-the-given-sum-condition)    |      |      |
| [1574. 删除最短的子数组使剩余数组有序](https://leetcode.cn/problems/shortest-subarray-to-be-removed-to-make-array-sorted) |      |      |
| [1163. 按字典序排在最后的子串](https://leetcode.cn/problems/last-substring-in-lexicographical-order)                      |      |      |

## 记忆化搜索

| 题目                                                                                                       | 标签                                                                       | 难度 |
| ---------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------- | ---- |
| [329. 矩阵中的最长递增路径](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/description/) | 深度优先搜索、广度优先搜索、图、拓扑排序、记忆化搜索、数组、动态规划、矩阵 | 难度 |
| [397. 整数替换](https://leetcode.cn/problems/integer-replacement/description/)                             | 贪心、位运算、记忆化搜索、动态规划                                         | 中等 |



## 动态规划

### 一维dp

| 题目                                                                                                                          | 标签                                   | 难度 |
| ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [509. 斐波那契数](https://leetcode.cn/problems/fibonacci-number/description/)                                                 | 递归、记忆化搜索、数学、动态规划       | 简单 |
| [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs/description/)                                                       | 记忆化搜索、数学、动态规划             | 简单 |
| [1137. 第 N 个泰波那契数](https://leetcode.cn/problems/n-th-tribonacci-number/description/)                                   | 记忆化搜索、数学、动态规划             | 简单 |
| [746. 使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs/description/)                                 | 数组、动态规划                         | 简单 |
| [53. 最大子数组和](https://leetcode.cn/problems/maximum-subarray/description/)                                                | 数组、分治、动态规划                   | 中等 |
| [2606. 找到最大开销的子字符串](https://leetcode.cn/problems/find-the-substring-with-maximum-cost/description/)                | 数组、哈希表、字符串、动态规划         | 中等 |
| [413. 等差数列划分](https://leetcode.cn/problems/arithmetic-slices/description/)                                              | 数组、动态规划                         | 中等 |
| [279. 完全平方数](https://leetcode.cn/problems/perfect-squares/description/)                                                  | 广度优先搜索、数学、动态规划           | 中等 |
| [300. 最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/description/)                               | 数组、二分查找、动态规划               | 中等 |
| [343. 整数拆分](https://leetcode.cn/problems/integer-break/description/)                                                      | 数学、动态规划                         | 中等 |
| [2369. 检查数组是否存在有效划分](https://leetcode.cn/problems/check-if-there-is-a-valid-partition-for-the-array/description/) | 数组、动态规划                         | 中等 |
| [983. 最低票价⁤](https://leetcode.cn/problems/minimum-cost-for-tickets/description/)                                          | 数组、动态规划                         | 中等 |
| [91. 解码方法⁤](https://leetcode.cn/problems/decode-ways/description/)                                                        | 字符串、动态规划                       | 中等 |
| [264. 丑数 II](https://leetcode.cn/problems/ugly-number-ii/description/)                                                      | 哈希表、数学、动态规划、堆（优先队列） | 中等 |
| [32. 最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/description/)                                       | 栈、字符串、动态规划                   | 困难 |
| [467. 环绕字符串中唯一的子字符串](https://leetcode.cn/problems/unique-substrings-in-wraparound-string/description/)           | 字符串、动态规划                       | 中等 |
| [96. 不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/description/)                                  | 树、二叉搜索树、数学、动态规划、二叉树 | 中等 |

### 二维dp

| 题目                                                         | 标签                 | 难度 |
| ------------------------------------------------------------ | -------------------- | ---- |
| [64. 最小路径和](https://leetcode.cn/problems/minimum-path-sum/description/) | 数组、动态规划、矩阵 | 中等 |
| [1143. 最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/description/) | 字符串、动态规划     | 中等 |
| [516. 最长回文子序列](https://leetcode.cn/problems/longest-palindromic-subsequence/description/) | 字符串、动态规划     | 中等 |
| [115. 不同的子序列](https://leetcode.cn/problems/distinct-subsequences/description/) | 字符串、动态规划     | 困难 |
| [72. 编辑距离](https://leetcode.cn/problems/edit-distance/description/) | 字符串、动态规划     | 中等 |
| [97. 交错字符串](https://leetcode.cn/problems/interleaving-string/description/) | 字符串、动态规划     | 中等 |



## 深度优先搜索


| 题目                                                                                                 | 标签                                   | 难度 |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |



## 广度优先搜索


| 题目                                                                                                 | 标签                                   | 难度 |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |




## 并查集

| 题目                                                                                                               | 标签                                   | 难度 |
| ------------------------------------------------------------------------------------------------------------------ | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/)               | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |
| [684. 冗余连接](https://leetcode.cn/problems/redundant-connection)                                                 |                                        |      |
| [990. 等式方程的可满足性](https://leetcode.cn/problems/satisfiability-of-equality-equations)                       |                                        |      |
| [1722. 执行交换操作后的最小汉明距离](https://leetcode.cn/problems/minimize-hamming-distance-after-swap-operations) |                                        |      |
| [1202. 交换字符串中的元素](https://leetcode.cn/problems/smallest-string-with-swaps)                                |                                        |      |
| [839. 相似字符串组](https://leetcode.cn/problems/similar-string-groups)                                            |                                        |      |
| [765. 情侣牵手](https://leetcode.cn/problems/couples-holding-hands)                                                |                                        |      |
| [721. 账户合并](https://leetcode.cn/problems/accounts-merge)                                                       |                                        |      |
| [778. 水位上升的泳池中游泳](https://leetcode.cn/problems/swim-in-rising-water)                                     |                                        |      |
| [959. 由斜杠划分区域](https://leetcode.cn/problems/regions-cut-by-slashes)                                         |                                        |      |
| [947. 移除最多的同行或同列石头](https://leetcode.cn/problems/most-stones-removed-with-same-row-or-column)          |                                        |      |
| [1391. 检查网格中是否存在有效路径](https://leetcode.cn/problems/check-if-there-is-a-valid-path-in-a-grid)          |                                        |      |
| [1559. 二维网格图中探测环](https://leetcode.cn/problems/detect-cycles-in-2d-grid)                                  |                                        |      |
| [827. 最大人工岛](https://leetcode.cn/problems/making-a-large-island)                                              |                                        |      |
| [952. 按公因数计算最大组件大小](https://leetcode.cn/problems/largest-component-size-by-common-factor)              |                                        |      |
| [1627. 带阈值的图连通性](https://leetcode.cn/problems/graph-connectivity-with-threshold)                           |                                        |      |
| [924. 尽量减少恶意软件的传播](https://leetcode.cn/problems/minimize-malware-spread)                                |                                        |      |
| [928. 尽量减少恶意软件的传播 II](https://leetcode.cn/problems/minimize-malware-spread-ii)                          |                                        |      |
| [685. 冗余连接 II](https://leetcode.cn/problems/redundant-connection-ii)                                           |                                        |      |
| [1579. 保证图可完全遍历](https://leetcode.cn/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable)  |                                        |      |
| [2076. 处理含限制条件的好友请求](https://leetcode.cn/problems/process-restricted-friend-requests)                  |                                        |      |
| [1697. 检查边长度限制的路径是否存在](https://leetcode.cn/problems/checking-existence-of-edge-length-limited-paths) |                                        |      |
| [2503. 矩阵查询可获得的最大分数](https://leetcode.cn/problems/maximum-number-of-points-from-grid-queries)          |                                        |      |
| [803. 打砖块](https://leetcode.cn/problems/bricks-falling-when-hit)                                                |                                        |      |
| [2573. 找出对应 LCP 矩阵的字符串](https://leetcode.cn/problems/find-the-string-with-lcp)                           |                                        |      |
| [1632. 矩阵转换后的秩](https://leetcode.cn/problems/rank-transform-of-a-matrix)                                    |                                        |      |

## 回溯

| 题目                                                         | 参考                                                         | 标签             | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------- | ---- |
| [79. 单词搜索](https://leetcode.cn/problems/word-search/description/) | [WordSearch](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0079_WordSearch.java) | 数组、回溯、矩阵 | 中等 |
| [78. 子集](https://leetcode.cn/problems/subsets)             |                                                              |                  |      |
| [784. 字母大小写全排列](https://leetcode.cn/problems/letter-case-permutation) |                                                              |                  |      |
| [797. 所有可能的路径](https://leetcode.cn/problems/all-paths-from-source-to-target) |                                                              |                  |      |
| [22. 括号生成](https://leetcode.cn/problems/generate-parentheses) |                                                              |                  |      |
| [47. 全排列 II](https://leetcode.cn/problems/permutations-ii) |                                                              |                  |      |
| [90. 子集 II](https://leetcode.cn/problems/subsets-ii)       |                                                              |                  |      |
| [1601. 最多可达成的换楼请求数目](https://leetcode.cn/problems/maximum-number-of-achievable-transfer-requests) |                                                              |                  |      |
| [1239. 串联字符串的最大长度](https://leetcode.cn/problems/maximum-length-of-a-concatenated-string-with-unique-characters) |                                                              |                  |      |
| [1079. 活字印刷](https://leetcode.cn/problems/letter-tile-possibilities) |                                                              |                  |      |
| [1219. 黄金矿工](https://leetcode.cn/problems/path-with-maximum-gold) |                                                              |                  |      |
| [93. 复原 IP 地址](https://leetcode.cn/problems/restore-ip-addresses) |                                                              |                  |      |
| [306. 累加数](https://leetcode.cn/problems/additive-number)  |                                                              |                  |      |
| [842. 将数组拆分成斐波那契序列](https://leetcode.cn/problems/split-array-into-fibonacci-sequence) |                                                              |                  |      |
| [1415. 长度为 n 的开心字符串中字典序第 k 小的字符串](https://leetcode.cn/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n) |                                                              |                  |      |
| [1286. 字母组合迭代器](https://leetcode.cn/problems/iterator-for-combination) |                                                              |                  |      |
| [51. N 皇后](https://leetcode.cn/problems/n-queens)          |                                                              |                  |      |
| [52. N 皇后 II](https://leetcode.cn/problems/n-queens-ii)    |                                                              |                  |      |
| [37. 解数独](https://leetcode.cn/problems/sudoku-solver)     |                                                              |                  |      |
| [679. 24 点游戏](https://leetcode.cn/problems/24-game)       |                                                              |                  |      |
| [1718. 构建字典序最大的可行序列](https://leetcode.cn/problems/construct-the-lexicographically-largest-valid-sequence) |                                                              |                  |      |
| [60. 排列序列](https://leetcode.cn/problems/permutation-sequence) |                                                              |                  |      |
| [282. 给表达式添加运算符](https://leetcode.cn/problems/expression-add-operators) |                                                              |                  |      |
| [301. 删除无效的括号](https://leetcode.cn/problems/remove-invalid-parentheses) |                                                              |                  |      |
| [126. 单词接龙 II](https://leetcode.cn/problems/word-ladder-ii) |                                                              |                  |      |
| [1307. 口算难题](https://leetcode.cn/problems/verbal-arithmetic-puzzle) |                                                              |                  |      |

## 贪心

| 题目                                                                                                                                              | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [2389. 和有限的最长子序列](https://leetcode.cn/problems/longest-subsequence-with-limited-sum)                                                     |      |      |
| [1403. 非递增顺序的最小子序列](https://leetcode.cn/problems/minimum-subsequence-in-non-increasing-order)                                          |      |      |
| [1338. 数组大小减半](https://leetcode.cn/problems/reduce-array-size-to-the-half)                                                                  |      |      |
| [1217. 玩筹码](https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position)                                                      |      |      |
| [605. 种花问题](https://leetcode.cn/problems/can-place-flowers)                                                                                   |      |      |
| [807. 保持城市天际线](https://leetcode.cn/problems/max-increase-to-keep-city-skyline)                                                             |      |      |
| [1221. 分割平衡字符串](https://leetcode.cn/problems/split-a-string-in-balanced-strings)                                                           |      |      |
| [1710. 卡车上的最大单元数](https://leetcode.cn/problems/maximum-units-on-a-truck)                                                                 |      |      |
| [561. 数组拆分](https://leetcode.cn/problems/array-partition)                                                                                     |      |      |
| [976. 三角形的最大周长](https://leetcode.cn/problems/largest-perimeter-triangle)                                                                  |      |      |
| [1005. K 次取反后最大化的数组和](https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations)                                            |      |      |
| [860. 柠檬水找零](https://leetcode.cn/problems/lemonade-change)                                                                                   |      |      |
| [455. 分发饼干](https://leetcode.cn/problems/assign-cookies)                                                                                      |      |      |
| [2410. 运动员和训练师的最大匹配数](https://leetcode.cn/problems/maximum-matching-of-players-with-trainers)                                        |      |      |
| [870. 优势洗牌](https://leetcode.cn/problems/advantage-shuffle)                                                                                   |      |      |
| [1144. 递减元素使数组呈锯齿状](https://leetcode.cn/problems/decrease-elements-to-make-array-zigzag)                                               |      |      |
| [763. 划分字母区间](https://leetcode.cn/problems/partition-labels)                                                                                |      |      |
| [1247. 交换字符使得字符串相同](https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal)                                                  |      |      |
| [948. 令牌放置](https://leetcode.cn/problems/bag-of-tokens)                                                                                       |      |      |
| [1029. 两地调度](https://leetcode.cn/problems/two-city-scheduling)                                                                                |      |      |
| [1529. 最少的后缀翻转次数](https://leetcode.cn/problems/minimum-suffix-flips)                                                                     |      |      |
| [984. 不含 AAA 或 BBB 的字符串](https://leetcode.cn/problems/string-without-aaa-or-bbb)                                                           |      |      |
| [1663. 具有给定数值的最小字符串](https://leetcode.cn/problems/smallest-string-with-a-given-numeric-value)                                         |      |      |
| [1689. 十-二进制数的最少数目](https://leetcode.cn/problems/partitioning-into-minimum-number-of-deci-binary-numbers)                               |      |      |
| [991. 坏了的计算器](https://leetcode.cn/problems/broken-calculator)                                                                               |      |      |
| [2139. 得到目标值的最少行动次数](https://leetcode.cn/problems/minimum-moves-to-reach-target-score)                                                |      |      |
| [1578. 使绳子变成彩色的最短时间](https://leetcode.cn/problems/minimum-time-to-make-rope-colorful)                                                 |      |      |
| [1589. 所有排列中的最大和](https://leetcode.cn/problems/maximum-sum-obtained-of-any-permutation)                                                  |      |      |
| [861. 翻转矩阵后的得分](https://leetcode.cn/problems/score-after-flipping-matrix)                                                                 |      |      |
| [1647. 字符频次唯一的最小删除次数](https://leetcode.cn/problems/minimum-deletions-to-make-character-frequencies-unique)                           |      |      |
| [1400. 构造 K 个回文字符串](https://leetcode.cn/problems/construct-k-palindrome-strings)                                                          |      |      |
| [738. 单调递增的数字](https://leetcode.cn/problems/monotone-increasing-digits)                                                                    |      |      |
| [1007. 行相等的最少多米诺旋转](https://leetcode.cn/problems/minimum-domino-rotations-for-equal-row)                                               |      |      |
| [1717. 删除子字符串的最大得分](https://leetcode.cn/problems/maximum-score-from-removing-substrings)                                               |      |      |
| [649. Dota2 参议院](https://leetcode.cn/problems/dota2-senate)                                                                                    |      |      |
| [881. 救生艇](https://leetcode.cn/problems/boats-to-save-people)                                                                                  |      |      |
| [1090. 受标签影响的最大值](https://leetcode.cn/problems/largest-values-from-labels)                                                               |      |      |
| [1053. 交换一次的先前排列](https://leetcode.cn/problems/previous-permutation-with-one-swap)                                                       |      |      |
| [769. 最多能完成排序的块](https://leetcode.cn/problems/max-chunks-to-make-sorted)                                                                 |      |      |
| [826. 安排工作以达到最大收益](https://leetcode.cn/problems/most-profit-assigning-work)                                                            |      |      |
| [1733. 需要教语言的最少人数](https://leetcode.cn/problems/minimum-number-of-people-to-teach)                                                      |      |      |
| [1605. 给定行和列的和求可行矩阵](https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums)                                        |      |      |
| [134. 加油站](https://leetcode.cn/problems/gas-station)                                                                                           |      |      |
| [135. 分发糖果](https://leetcode.cn/problems/candy)                                                                                               |      |      |
| [179. 最大数](https://leetcode.cn/problems/largest-number)                                                                                        |      |      |
| [1414. 和为 K 的最少斐波那契数字数目](https://leetcode.cn/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k)                   |      |      |
| [1558. 得到目标数组的最少函数调用次数](https://leetcode.cn/problems/minimum-numbers-of-function-calls-to-make-nums-array)                         |      |      |
| [1546. 和为目标值且不重叠的非空子数组的最大数目](https://leetcode.cn/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target) |      |      |
| [452. 用最少数量的箭引爆气球](https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons)                                            |      |      |
| [621. 任务调度器](https://leetcode.cn/problems/task-scheduler)                                                                                    |      |      |
| [1642. 可以到达的最远建筑](https://leetcode.cn/problems/furthest-building-you-can-reach)                                                          |      |      |
| [1705. 吃苹果的最大数目](https://leetcode.cn/problems/maximum-number-of-eaten-apples)                                                             |      |      |
| [1253. 重构 2 行二进制矩阵](https://leetcode.cn/problems/reconstruct-a-2-row-binary-matrix)                                                       |      |      |
| [1405. 最长快乐字符串](https://leetcode.cn/problems/longest-happy-string)                                                                         |      |      |
| [435. 无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals)                                                                         |      |      |
| [1526. 形成目标数组的子数组最少增加次数](https://leetcode.cn/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array)           |      |      |
| [2498. 青蛙过河 II](https://leetcode.cn/problems/frog-jump-ii)                                                                                    |      |      |
| [659. 分割数组为连续子序列](https://leetcode.cn/problems/split-array-into-consecutive-subsequences)                                               |      |      |
| [1536. 排布二进制网格的最少交换次数](https://leetcode.cn/problems/minimum-swaps-to-arrange-a-binary-grid)                                         |      |      |
| [502. IPO](https://leetcode.cn/problems/ipo)                                                                                                      |      |      |
| [632. 最小区间](https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists)                                                       |      |      |
| [1353. 最多可以参加的会议数目](https://leetcode.cn/problems/maximum-number-of-events-that-can-be-attended)                                        |      |      |
| [1383. 最大的团队表现值](https://leetcode.cn/problems/maximum-performance-of-a-team)                                                              |      |      |
| [1054. 距离相等的条形码](https://leetcode.cn/problems/distant-barcodes)                                                                           |      |      |
| [767. 重构字符串](https://leetcode.cn/problems/reorganize-string)                                                                                 |      |      |
| [1488. 避免洪水泛滥](https://leetcode.cn/problems/avoid-flood-in-the-city)                                                                        |      |      |
| [768. 最多能完成排序的块 II](https://leetcode.cn/problems/max-chunks-to-make-sorted-ii)                                                           |      |      |
| [1702. 修改后的最大二进制字符串](https://leetcode.cn/problems/maximum-binary-string-after-change)                                                 |      |      |
| [330. 按要求补齐数组](https://leetcode.cn/problems/patching-array)                                                                                |      |      |
| [517. 超级洗衣机](https://leetcode.cn/problems/super-washing-machines)                                                                            |      |      |
| [757. 设置交集大小至少为 2](https://leetcode.cn/problems/set-intersection-size-at-least-two)                                                      |      |      |
| [857. 雇佣 K 名工人的最低成本](https://leetcode.cn/problems/minimum-cost-to-hire-k-workers)                                                       |      |      |
| [1665. 完成所有任务的最少初始能量](https://leetcode.cn/problems/minimum-initial-energy-to-finish-tasks)                                           |      |      |
| [2412. 完成所有交易的初始最少钱数](https://leetcode.cn/problems/minimum-money-required-before-transactions)                                       |      |      |
| [1330. 翻转子数组得到最大的数组值](https://leetcode.cn/problems/reverse-subarray-to-maximize-array-value)                                         |      |      |
| [2499. 让数组不相等的最小总代价](https://leetcode.cn/problems/minimum-total-cost-to-make-arrays-unequal)                                          |      |      |
| [420. 强密码检验器](https://leetcode.cn/problems/strong-password-checker)                                                                         |      |      |

## 字符串

| 题目                                                                                                       | 标签 | 难度 |
| ---------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [709. 转换成小写字母](https://leetcode.cn/problems/to-lower-case)                                          |      |      |
| [520. 检测大写字母](https://leetcode.cn/problems/detect-capital)                                           |      |      |
| [1662. 检查两个字符串数组是否相等](https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent) |      |      |
| [1704. 判断字符串的两半是否相似](https://leetcode.cn/problems/determine-if-string-halves-are-alike)        |      |      |
| [824. 山羊拉丁文](https://leetcode.cn/problems/goat-latin)                                                 |      |      |
| [551. 学生出勤记录 I](https://leetcode.cn/problems/student-attendance-record-i)                            |      |      |
| [1556. 千位分隔数](https://leetcode.cn/problems/thousand-separator)                                        |      |      |
| [58. 最后一个单词的长度](https://leetcode.cn/problems/length-of-last-word)                                 |      |      |
| [434. 字符串中的单词数](https://leetcode.cn/problems/number-of-segments-in-a-string)                       |      |      |
| [806. 写字符串需要的行数](https://leetcode.cn/problems/number-of-lines-to-write-string)                    |      |      |
| [1309. 解码字母到整数映射](https://leetcode.cn/problems/decrypt-string-from-alphabet-to-integer-mapping)   |      |      |
| [1694. 重新格式化电话号码](https://leetcode.cn/problems/reformat-phone-number)                             |      |      |
| [696. 计数二进制子串](https://leetcode.cn/problems/count-binary-substrings)                                |      |      |
| [468. 验证 IP 地址](https://leetcode.cn/problems/validate-ip-address)                                      |      |      |
| [6. Z 字形变换](https://leetcode.cn/problems/zigzag-conversion)                                            |      |      |
| [1328. 破坏回文串](https://leetcode.cn/problems/break-a-palindrome)                                        |      |      |
| [1324. 竖直打印单词](https://leetcode.cn/problems/print-words-vertically)                                  |      |      |
| [777. 在 LR 字符串中交换相邻字符](https://leetcode.cn/problems/swap-adjacent-in-lr-string)                 |      |      |
| [8. 字符串转换整数 (atoi)](https://leetcode.cn/problems/string-to-integer-atoi)                            |      |      |
| [809. 情感丰富的文字](https://leetcode.cn/problems/expressive-words)                                       |      |      |
| [1419. 数青蛙](https://leetcode.cn/problems/minimum-number-of-frogs-croaking)                              |      |      |
| [65. 有效数字](https://leetcode.cn/problems/valid-number)                                                  |      |      |



## 位运算

| 题目                                                                                                                               | 参考                                                                                                                                 | 标签                                 | 难度 |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------ | ---- |
| [1486. 数组异或操作](https://leetcode.cn/problems/xor-operation-in-an-array/description/)                                          | [ArrayXOR](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1426_ArrayXOR.java)                               | 位运算、数学                         | 简单 |
| [2595. 奇偶位数](https://leetcode.cn/problems/number-of-even-and-odd-bits/description/)                                            | [EvenOddBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2595_EvenOddBits.java)                         | 位运算                               | 简单 |
| [231. 2 的幂](https://leetcode.cn/problems/power-of-two/description/)                                                              | [PowerOfTwo](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0231_PowerOfTwo.java)                           | 位运算、递归、数学                   | 简单 |
| [342. 4的幂](https://leetcode.cn/problems/power-of-four/description/)                                                              | [PowerOfFour](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0342_PowerOfFour.java)                         | 位运算、递归、数学                   | 简单 |
| [476. 数字的补数](https://leetcode.cn/problems/number-complement/description/)                                                     | [FindComplement](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0476_FindComplement.java)                   | 位运算                               | 简单 |
| [191. 位1的个数](https://leetcode.cn/problems/number-of-1-bits/description/)                                                       | [HammingWeight](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0191_HammingWeight.java)                     | 位运算、分治                         | 简单 |
| [338. 比特位计数](https://leetcode.cn/problems/counting-bits/description/)                                                         | [CountBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0338_CountBits.java)                             | 位运算、动态规划                     | 简单 |
| [1356. 根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/)                         | [SortByBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1356_SortByBits.java)                           | 位运算、数组、计数、排序             | 简单 |
| [461. 汉明距离](https://leetcode.cn/problems/hamming-distance/)                                                                    | [HammingDistance](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0461_HammingDistance.java)                 | 位运算                               | 简单 |
| [2220. 转换数字的最少位翻转次数](https://leetcode.cn/problems/minimum-bit-flips-to-convert-number/)                                | [MinBitFlips](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2220_MinBitFlips.java)                         | 位运算                               | 简单 |
| [868. 二进制间距](https://leetcode.cn/problems/binary-gap/)                                                                        | [BinaryGap](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0868_BinaryGap.java)                             | 位运算                               | 简单 |
| [2917. 找出数组中的 K-or 值](https://leetcode.cn/problems/find-the-k-or-of-an-array/)                                              | [FindKOr](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2917_FindKOr.java)                                 | 位运算、数组                         | 简单 |
| [693. 交替位二进制数](https://leetcode.cn/problems/binary-number-with-alternating-bits/)                                           | [HasAlternatingBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0693_HasAlternatingBits.java)           | 位运算                               | 简单 |
| [136. 只出现一次的数字](https://leetcode.cn/problems/single-number/)                                                               | [SingleNumber](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0136_SingleNumber.java)                       | 位运算、数组                         | 简单 |
| [137. 只出现一次的数字 II](https://leetcode.cn/problems/single-number-ii/)                                                         | [SingleNumberII](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0137_SingleNumberII.java)                   | 位运算、数组                         | 中等 |
| [260. 只出现一次的数字 III](https://leetcode.cn/problems/single-number-iii/)                                                       | [SingleNumberIII](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0260_SingleNumberIII.java)                 | 位运算、数组                         | 中等 |
| [190. 颠倒二进制位](https://leetcode.cn/problems/reverse-bits/)                                                                    | [ReverseBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0190_ReverseBits.java)                         | 位运算、分治                         | 简单 |
| [201. 数字范围按位与](https://leetcode.cn/problems/bitwise-and-of-numbers-range/)                                                  | [RangeBitwiseAnd](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0201_RangeBitwiseAnd.java)                 | 位运算                               | 中等 |
| [371. 两整数之和](https://leetcode.cn/problems/sum-of-two-integers/)                                                               | [GetSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0371_GetSum.java)                                   | 位运算、数学                         | 中等 |
| [1680. 连接连续二进制数字](https://leetcode.cn/problems/concatenation-of-consecutive-binary-numbers/)                              | [ConcatenatedBinary](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1680_ConcatenatedBinary.java)           | 位运算、数学、模拟                   | 中等 |
| [1611. 使整数变为 0 的最少操作次数](https://leetcode.cn/problems/minimum-one-bit-operations-to-make-integers-zero/)                | [MinimumOneBitOperations](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1611_MinimumOneBitOperations.java) | 位运算、记忆化搜索、动态规划         | 困难 |
| [1835. 所有数对按位与结果的异或和](https://leetcode.cn/problems/find-xor-sum-of-all-pairs-bitwise-and/)                            | [GetXORSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1835_GetXORSum.java)                             | 位运算、数组、数学                   | 困难 |
| [2275. 按位与结果大于零的最长组合](https://leetcode.cn/problems/largest-combination-with-bitwise-and-greater-than-zero/)           | [LargestCombination](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2275_LargestCombination.java)           | 位运算、数组、哈希表、计数           | 中等 |
| [1863. 找出所有子集的异或总和再求和](https://leetcode.cn/problems/sum-of-all-subset-xor-totals/)                                   | [SubsetXORSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1863_SubsetXORSum.java)                       | 位运算、数组、数学、回溯、组合、数学 | 简单 |
| [477. 汉明距离总和](https://leetcode.cn/problems/total-hamming-distance/)                                                          | [TotalHammingDistance](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0477_TotalHammingDistance.java)       | 位运算、数组、数学                   | 中等 |
| [2980. 检查按位或是否存在尾随零](https://leetcode.cn/problems/check-if-bitwise-or-has-trailing-zeros/)                             | [HasTrailingZeros](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2980_HasTrailingZeros.java)               | 位运算、数组                         | 简单 |
| [1318. 或运算的最小翻转次数](https://leetcode.cn/problems/minimum-flips-to-make-a-or-b-equal-to-c/)                                | [MinFlips](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1318_MinFlips.java)                               | 位运算                               | 中等 |
| [2419. 按位与最大的最长子数组](https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/)                            | [LongestSubarray](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2419_LongestSubarray.java)                 | 位运算、脑筋急转弯、数组             | 中等 |
| [2871. 将数组分割成最多数目的子数组](https://leetcode.cn/problems/split-array-into-maximum-number-of-subarrays/)                   | [MaxSubarrays](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2871_MaxSubarrays.java)                       | 贪心、位运算、数组                   | 中等 |
| [2401. 最长优雅子数组](https://leetcode.cn/problems/longest-nice-subarray/)                                                        | [LongestNiceSubarray](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2401_LongestNiceSubarray.java)         | 位运算、数组、滑动窗口               | 中等 |
| [2680. 最大或值](https://leetcode.cn/problems/maximum-or/)                                                                         | [MaximumOr](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2680_MaximumOr.java)                             | 贪心、位运算、数组、前缀和           | 中等 |
| [2411. 按位或最大的最小子数组长度](https://leetcode.cn/problems/smallest-subarrays-with-maximum-bitwise-or/)                       |                                                                                                                                      |                                      |      |
| [898. 子数组按位或操作](https://leetcode.cn/problems/bitwise-ors-of-subarrays/)                                                    |                                                                                                                                      |                                      |      |
| [1521. 找到最接近目标值的函数值](https://leetcode.cn/problems/find-a-value-of-a-mysterious-function-closest-to-target/)            |                                                                                                                                      |                                      |      |
| [1720. 解码异或后的数组](https://leetcode.cn/problems/decode-xored-array/)                                                         |                                                                                                                                      |                                      |      |
| [2433. 找出前缀异或的原始数组](https://leetcode.cn/problems/find-the-original-array-of-prefix-xor/)                                |                                                                                                                                      |                                      |      |
| [1310. 子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray/)                                                    |                                                                                                                                      |                                      |      |
| [2683. 相邻值的按位异或](https://leetcode.cn/problems/neighboring-bitwise-xor/)                                                    |                                                                                                                                      |                                      |      |
| [2997. 使数组异或和等于 K 的最少操作次数](https://leetcode.cn/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/) |                                                                                                                                      |                                      |      |
| [1442. 形成两个异或相等数组的三元组数目](https://leetcode.cn/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/)       |                                                                                                                                      |                                      |      |
| [2429. 最小异或](https://leetcode.cn/problems/minimize-xor/)                                                                       |                                                                                                                                      |                                      |      |
| [2527. 查询数组异或美丽值](https://leetcode.cn/problems/find-xor-beauty-of-array/)                                                 |                                                                                                                                      |                                      |      |
| [2317. 操作后的最大异或和](https://leetcode.cn/problems/maximum-xor-after-operations/)                                             |                                                                                                                                      |                                      |      |
| [2588. 统计美丽子数组数目](https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/)                                  |                                                                                                                                      |                                      |      |
| [2564. 子字符串异或查询](https://leetcode.cn/problems/substring-xor-queries/)                                                      |                                                                                                                                      |                                      |      |
| [1734. 解码异或后的排列](https://leetcode.cn/problems/decode-xored-permutation/)                                                   |                                                                                                                                      |                                      |      |
| [2857. 统计距离为 k 的点对](https://leetcode.cn/problems/count-pairs-of-points-with-distance-k/)                                   |                                                                                                                                      |                                      |      |
| [2546. 执行逐位运算使字符串相等](https://leetcode.cn/problems/apply-bitwise-operations-to-make-strings-equal/)                     |                                                                                                                                      |                                      |      |
| [1558. 得到目标数组的最少函数调用次数](https://leetcode.cn/problems/minimum-numbers-of-function-calls-to-make-target-array/)       |                                                                                                                                      |                                      |      |
| [2571. 将整数减少到零需要的最少操作数](https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/)                 |                                                                                                                                      |                                      |      |
| [2568. 最小无法得到的或值](https://leetcode.cn/problems/minimum-impossible-or/)                                                    |                                                                                                                                      |                                      |      |
| [2939. 最大异或乘积](https://leetcode.cn/problems/maximum-xor-product/)                                                            |                                                                                                                                      |                                      |      |
| [2749. 得到整数零需要执行的最少操作数](https://leetcode.cn/problems/minimum-operations-to-make-the-integer-zero/)                  |                                                                                                                                      |                                      |      |
| [2835. 使子序列的和等于目标的最少操作次数](https://leetcode.cn/problems/minimum-operations-to-form-subsequence-with-target-sum/)   |                                                                                                                                      |                                      |      |
| [2897. 对数组执行操作使平方和最大](https://leetcode.cn/problems/apply-operations-on-array-to-maximize-sum-of-squares/)             |                                                                                                                                      |                                      |      |
| [810. 黑板异或游戏](https://leetcode.cn/problems/chalkboard-xor-game/)                                                             |                                                                                                                                      |                                      |      |

## 栈

| 题目                                                                                                                  | 标签 | 难度 |
| --------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [1598. 文件夹操作日志搜集器](https://leetcode.cn/problems/crawler-log-folder)                                         |      |      |
| [1614. 括号的最大嵌套深度](https://leetcode.cn/problems/maximum-nesting-depth-of-the-parentheses)                     |      |      |
| [20. 有效的括号](https://leetcode.cn/problems/valid-parentheses)                                                      |      |      |
| [682. 棒球比赛](https://leetcode.cn/problems/baseball-game)                                                           |      |      |
| [1021. 删除最外层的括号](https://leetcode.cn/problems/remove-outermost-parentheses)                                   |      |      |
| [1047. 删除字符串中的所有相邻重复项](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string)           |      |      |
| [1441. 用栈操作构建数组](https://leetcode.cn/problems/build-an-array-with-stack-operations)                           |      |      |
| [445. 两数相加 II](https://leetcode.cn/problems/add-two-numbers-ii)                                                   |      |      |
| [150. 逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation)                                |      |      |
| [921. 使括号有效的最少添加](https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid)                       |      |      |
| [1541. 平衡括号字符串的最少插入次数](https://leetcode.cn/problems/minimum-insertions-to-balance-a-parentheses-string) |      |      |
| [155. 最小栈](https://leetcode.cn/problems/min-stack)                                                                 |      |      |
| [735. 行星碰撞](https://leetcode.cn/problems/asteroid-collision)                                                      |      |      |
| [946. 验证栈序列](https://leetcode.cn/problems/validate-stack-sequences)                                              |      |      |
| [1003. 检查替换后的词是否有效](https://leetcode.cn/problems/check-if-word-is-valid-after-substitutions)               |      |      |
| [1190. 反转每对括号间的子串](https://leetcode.cn/problems/reverse-substrings-between-each-pair-of-parentheses)        |      |      |
| [1249. 移除无效的括号](https://leetcode.cn/problems/minimum-remove-to-make-valid-parentheses)                         |      |      |
| [71. 简化路径](https://leetcode.cn/problems/simplify-path)                                                            |      |      |
| [856. 括号的分数](https://leetcode.cn/problems/score-of-parentheses)                                                  |      |      |
| [636. 函数的独占时间](https://leetcode.cn/problems/exclusive-time-of-functions)                                       |      |      |
| [394. 字符串解码](https://leetcode.cn/problems/decode-string)                                                         |      |      |
| [1106. 解析布尔表达式](https://leetcode.cn/problems/parsing-a-boolean-expression)                                     |      |      |
| [1111. 有效括号的嵌套深度](https://leetcode.cn/problems/maximum-nesting-depth-of-two-valid-parentheses-strings)       |      |      |
| [1209. 删除字符串中的所有相邻重复项 II](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string-ii)     |      |      |
| [385. 迷你语法分析器](https://leetcode.cn/problems/mini-parser)                                                       |      |      |
| [1472. 设计浏览器历史记录](https://leetcode.cn/problems/design-browser-history)                                       |      |      |
| [224. 基本计算器](https://leetcode.cn/problems/basic-calculator)                                                      |      |      |
| [227. 基本计算器 II](https://leetcode.cn/problems/basic-calculator-ii)                                                |      |      |
| [388. 文件的最长绝对路径](https://leetcode.cn/problems/longest-absolute-file-path)                                    |      |      |
| [591. 标签验证器](https://leetcode.cn/problems/tag-validator)                                                         |      |      |




## 队列

| 题目                                                                                              | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------- | ---- | ---- |
| [1700. 无法吃午餐的学生数量](https://leetcode.cn/problems/number-of-students-unable-to-eat-lunch) |      |      |
| [933. 最近的请求次数](https://leetcode.cn/problems/number-of-recent-calls)                        |      |      |
| [225. 用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues)                    |      |      |
| [232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks)                    |      |      |
| [950. 按递增顺序显示卡牌](https://leetcode.cn/problems/reveal-cards-in-increasing-order)          |      |      |
| [950. 按递增顺序显示卡牌](https://leetcode.cn/problems/reveal-cards-in-increasing-order)          |      |      |
| [622. 设计循环队列](https://leetcode.cn/problems/design-circular-queue)                           |      |      |
| [641. 设计循环双端队列](https://leetcode.cn/problems/design-circular-deque)                       |      |      |

## 单调栈

| 题目                                                                                               | 标签 | 难度 |
| -------------------------------------------------------------------------------------------------- | ---- | ---- |
| [316. 去除重复字母](https://leetcode.cn/problems/remove-duplicate-letters)                         |      |      |
| [402. 移掉 K 位数字](https://leetcode.cn/problems/remove-k-digits)                                 |      |      |
| [1673. 找出最具竞争力的子序列](https://leetcode.cn/problems/find-the-most-competitive-subsequence) |      |      |
| [456. 132 模式](https://leetcode.cn/problems/132-pattern)                                          |      |      |
| [739. 每日温度](https://leetcode.cn/problems/daily-temperatures)                                   |      |      |
| [42. 接雨水](https://leetcode.cn/problems/trapping-rain-water)                                     |      |      |
| [901. 股票价格跨度](https://leetcode.cn/problems/online-stock-span)                                |      |      |
| [962. 最大宽度坡](https://leetcode.cn/problems/maximum-width-ramp)                                 |      |      |
| [907. 子数组的最小值之和](https://leetcode.cn/problems/sum-of-subarray-minimums)                   |      |      |
| [84. 柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram)              |      |      |
| [85. 最大矩形](https://leetcode.cn/problems/maximal-rectangle)                                     |      |      |

## 单调队列

| 题目                                                                                                                                              | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [1438. 绝对差不超过限制的最长连续子数组](https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |      |      |
| [1499. 满足不等式的最大值](https://leetcode.cn/problems/max-value-of-equation)                                                                    |      |      |
| [862. 和至少为 K 的最短子数组](https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k)                                                |      |      |

## 优先队列

| 题目                                                                                                 | 标签 | 难度 |
| ---------------------------------------------------------------------------------------------------- | ---- | ---- |
| [1046. 最后一块石头的重量](https://leetcode.cn/problems/last-stone-weight)                           |      |      |
| [703. 数据流中的第 K 大元素](https://leetcode.cn/problems/kth-largest-element-in-a-stream)           |      |      |
| [1094. 拼车](https://leetcode.cn/problems/car-pooling)                                               |      |      |
| [23. 合并 K 个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists)                           |      |      |
| [239. 滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum)                           |      |      |
| [295. 数据流的中位数](https://leetcode.cn/problems/find-median-from-data-stream)                     |      |      |
| [1354. 多次求和构造目标数组](https://leetcode.cn/problems/construct-target-array-with-multiple-sums) |      |      |
| [1675. 数组的最小偏移量](https://leetcode.cn/problems/minimize-deviation-in-array)                   |      |      |

## 哈希表

| 题目                                                                                                                                        | 标签 | 难度 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ---- | ---- |
| [1. 两数之和](https://leetcode.cn/problems/two-sum)                                                                                         |      |      |
| [804. 唯一摩尔斯密码词](https://leetcode.cn/problems/unique-morse-code-words)                                                               |      |      |
| [202. 快乐数](https://leetcode.cn/problems/happy-number)                                                                                    |      |      |
| [961. 在长度 2N 的数组中找出重复 N 次的元素](https://leetcode.cn/problems/n-repeated-element-in-size-2n-array)                              |      |      |
| [36. 有效的数独](https://leetcode.cn/problems/valid-sudoku)                                                                                 |      |      |
| [500. 键盘行](https://leetcode.cn/problems/keyboard-row)                                                                                    |      |      |
| [771. 宝石与石头](https://leetcode.cn/problems/jewels-and-stones)                                                                           |      |      |
| [383. 赎金信](https://leetcode.cn/problems/ransom-note)                                                                                     |      |      |
| [1189. “气球”的最大数量](https://leetcode.cn/problems/maximum-number-of-balloons)                                                           |      |      |
| [12. 整数转罗马数字](https://leetcode.cn/problems/integer-to-roman)                                                                         |      |      |
| [13. 罗马数字转整数](https://leetcode.cn/problems/roman-to-integer)                                                                         |      |      |
| [205. 同构字符串](https://leetcode.cn/problems/isomorphic-strings)                                                                          |      |      |
| [290. 单词规律](https://leetcode.cn/problems/word-pattern)                                                                                  |      |      |
| [890. 查找和替换模式](https://leetcode.cn/problems/find-and-replace-pattern)                                                                |      |      |
| [387. 字符串中的第一个唯一字符](https://leetcode.cn/problems/first-unique-character-in-a-string)                                            |      |      |
| [888. 公平的糖果交换](https://leetcode.cn/problems/fair-candy-swap)                                                                         |      |      |
| [1394. 找出数组中的幸运数](https://leetcode.cn/problems/find-lucky-integer-in-an-array)                                                     |      |      |
| [929. 独特的电子邮件地址](https://leetcode.cn/problems/unique-email-addresses)                                                              |      |      |
| [953. 验证外星语词典](https://leetcode.cn/problems/verifying-an-alien-dictionary)                                                           |      |      |
| [1002. 查找共用字符](https://leetcode.cn/problems/find-common-characters)                                                                   |      |      |
| [1624. 两个相同字符之间的最长子字符串](https://leetcode.cn/problems/largest-substring-between-two-equal-characters)                         |      |      |
| [748. 最短补全词](https://leetcode.cn/problems/shortest-completing-word)                                                                    |      |      |
| [859. 亲密字符串](https://leetcode.cn/problems/buddy-strings)                                                                               |      |      |
| [1496. 判断路径是否相交](https://leetcode.cn/problems/path-crossing)                                                                        |      |      |
| [73. 矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes)                                                                              |      |      |
| [705. 设计哈希集合](https://leetcode.cn/problems/design-hashset)                                                                            |      |      |
| [706. 设计哈希映射](https://leetcode.cn/problems/design-hashmap)                                                                            |      |      |
| [423. 从英文中重建数字](https://leetcode.cn/problems/reconstruct-original-digits-from-english)                                              |      |      |
| [299. 猜数字游戏](https://leetcode.cn/problems/bulls-and-cows)                                                                              |      |      |
| [532. 数组中的 k-diff 数对](https://leetcode.cn/problems/k-diff-pairs-in-an-array)                                                          |      |      |
| [697. 数组的度](https://leetcode.cn/problems/degree-of-an-array)                                                                            |      |      |
| [916. 单词子集](https://leetcode.cn/problems/word-subsets)                                                                                  |      |      |
| [811. 子域名访问计数](https://leetcode.cn/problems/subdomain-visit-count)                                                                   |      |      |
| [1138. 字母板上的路径](https://leetcode.cn/problems/alphabet-board-path)                                                                    |      |      |
| [1347. 制造字母异位词的最小步骤数](https://leetcode.cn/problems/minimum-number-of-steps-to-make-two-strings-anagram)                        |      |      |
| [1577. 数的平方等于两数乘积的方法数](https://leetcode.cn/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers) |      |      |
| [554. 砖墙](https://leetcode.cn/problems/brick-wall)                                                                                        |      |      |
| [781. 森林中的兔子](https://leetcode.cn/problems/rabbits-in-forest)                                                                         |      |      |
| [1487. 保证文件名唯一](https://leetcode.cn/problems/making-file-names-unique)                                                               |      |      |
| [128. 最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence)                                                              |      |      |
| [609. 在系统中查找重复文件](https://leetcode.cn/problems/find-duplicate-file-in-system)                                                     |      |      |
| [442. 数组中重复的数据](https://leetcode.cn/problems/find-all-duplicates-in-an-array)                                                       |      |      |
| [454. 四数相加 II](https://leetcode.cn/problems/4sum-ii)                                                                                    |      |      |
| [1171. 从链表中删去总和值为零的连续结点](https://leetcode.cn/problems/remove-zero-sum-consecutive-nodes-from-linked-list)                   |      |      |
| [1396. 设计地铁系统](https://leetcode.cn/problems/design-underground-system)                                                                |      |      |
| [41. 缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive)                                                                 |      |      |
| [966. 元音拼写检查器](https://leetcode.cn/problems/vowel-spellchecker)                                                                      |      |      |
| [535. TinyURL 的加密与解密](https://leetcode.cn/problems/encode-and-decode-tinyurl)                                                         |      |      |
| [895. 最大频率栈](https://leetcode.cn/problems/maximum-frequency-stack)                                                                     |      |      |
| [355. 设计推特](https://leetcode.cn/problems/design-twitter)                                                                                |      |      |
| [146. LRU 缓存](https://leetcode.cn/problems/lru-cache)                                                                                     |      |      |
| [1001. 网格照明](https://leetcode.cn/problems/grid-illumination)                                                                            |      |      |
| [1224. 最大相等频率](https://leetcode.cn/problems/maximum-equal-frequency)                                                                  |      |      |
| [726. 原子的数量](https://leetcode.cn/problems/number-of-atoms)                                                                             |      |      |
| [460. LFU 缓存](https://leetcode.cn/problems/lfu-cache)                                                                                     |      |      |
| [736. Lisp 语法解析](https://leetcode.cn/problems/parse-lisp-expression)                                                                    |      |      |
| [432. 全 O(1) 的数据结构](https://leetcode.cn/problems/all-oone-data-structure)                                                             |      |      |











## 其他

### 网格图 | 岛屿问题（洪水填充解法）

| 题目                                                                                                     | 标签                                           | 难度 |
| -------------------------------------------------------------------------------------------------------- | ---------------------------------------------- | ---- |
| [200. 岛屿数量](https://leetcode.cn/problems/number-of-islands/description/)                             | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [463. 岛屿的周长](https://leetcode.cn/problems/island-perimeter/description/)                            | 深度优先搜索、广度优先搜索、数组、矩阵         | 简单 |
| [695. 岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/description/)                      | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [130. 被围绕的区域](https://leetcode.cn/problems/surrounded-regions/description/)                        | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [827. 最大人工岛](https://leetcode.cn/problems/making-a-large-island/description/)                       | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 困难 |
| [面试题 16.19. 水域大小](https://leetcode.cn/problems/pond-sizes-lcci/description/)                      | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [2658. 网格图中鱼的最大数目](https://leetcode.cn/problems/maximum-number-of-fish-in-a-grid/description/) | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [1020. 飞地的数量](https://leetcode.cn/problems/number-of-enclaves/description/)                         | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |
| [1254. 统计封闭岛屿的数目](https://leetcode.cn/problems/number-of-closed-islands/description/)           | 深度优先搜索、广度优先搜索、并查集、数组、矩阵 | 中等 |



### 组合问题

| 题目                                                         | 参考                                                         | 标签                 | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------- | ---- |
| [77. 组合](https://leetcode.cn/problems/combinations/description/) | [Combinations](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0077_Combinations.java) | 回溯                 | 中等 |
| [216. 组合总和 III](https://leetcode.cn/problems/combination-sum-iii/description/) | [CombinationSumIII](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0216_CombinationSumIII.java) | 数组、回溯           | 中等 |
| [17. 电话号码的字母组合⁤](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/description/) | [LetterCombinations](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0017_LetterCombinations.java) | 哈希表、字符串、回溯 | 中等 |



### 排列问题

| 题目                                                    | 参考                                                         | 标签 | 难度 |
| ------------------------------------------------------- | ------------------------------------------------------------ | ---- | ---- |
| [46. 全排列](https://leetcode.cn/problems/permutations) | [Permutations](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0046_Permutations.java) | 回溯 | 中等 |



















