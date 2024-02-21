<div align="center">

<h1>LeetCode-note</h1>

</div>

# 目录

- [目录](#目录)
- [笔记](#笔记)
- [题单](#题单)
  - [位运算](#位运算)
  - [二分查找](#二分查找)
  - [前缀和](#前缀和)
  - [动态规划](#动态规划)
    - [一维dp](#一维dp)
    - [二维dp](#二维dp)
  - [深度优先搜索](#深度优先搜索)
  - [广度优先搜索](#广度优先搜索)
  - [并查集](#并查集)
  - [回溯](#回溯)
  - [其他](#其他)
    - [网格图 | 岛屿问题（洪水填充解法）](#网格图--岛屿问题洪水填充解法)
    - [组合问题](#组合问题)

# 笔记

- [ACM模式](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/note/note001_pattern.md)
- [二分查找算法](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/note/note002_BinarySearch.md)

# 题单

## 位运算

| 题目                                                         | 参考                                                         | 标签                     | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------ | ---- |
| [1486. 数组异或操作](https://leetcode.cn/problems/xor-operation-in-an-array/description/) | [ArrayXOR](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1426_ArrayXOR.java) | 位运算、数学             | 简单 |
| [2595. 奇偶位数](https://leetcode.cn/problems/number-of-even-and-odd-bits/description/) | [EvenOddBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2595_EvenOddBits.java) | 位运算                   | 简单 |
| [231. 2 的幂](https://leetcode.cn/problems/power-of-two/description/) | [PowerOfTwo](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0231_PowerOfTwo.java) | 位运算、递归、数学       | 简单 |
| [342. 4的幂](https://leetcode.cn/problems/power-of-four/description/) | [PowerOfFour](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0342_PowerOfFour.java) | 位运算、递归、数学       | 简单 |
| [476. 数字的补数](https://leetcode.cn/problems/number-complement/description/) | [FindComplement](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0476_FindComplement.java) | 位运算                   | 简单 |
| [191. 位1的个数](https://leetcode.cn/problems/number-of-1-bits/description/) |                                                              | 位运算、分治             | 简单 |
| [338. 比特位计数](https://leetcode.cn/problems/counting-bits/description/) |                                                              | 位运算、动态规划         | 简单 |
| [1356. 根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/) |                                                              | 位运算、数组、计数、排序 | 简单 |
| [461. 汉明距离](https://leetcode.cn/problems/hamming-distance/) |                                                              | 位运算                   | 简单 |
| [2220. 转换数字的最少位翻转次数](https://leetcode.cn/problems/minimum-bit-flips-to-convert-number/) |                                                              | 位运算                   | 简单 |
| [868. 二进制间距](https://leetcode.cn/problems/binary-gap/)  |                                                              | 位运算                   | 简单 |
| [2917. 找出数组中的 K-or 值](https://leetcode.cn/problems/find-the-k-or-of-an-array/) |                                                              | 位运算、数组             | 简单 |
| [693. 交替位二进制数](https://leetcode.cn/problems/binary-number-with-alternating-bits/) |                                                              | 位运算                   | 简单 |

​	

## 二分查找


| 题目                                                         | 参考                                                         | 标签                 | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------- | ---- |
| [704. 二分查找](https://leetcode.cn/problems/binary-search/) | [binary_search](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0704_binary_search.java) | 数组、二分查找       | 简单 |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/) | [FirstLastPosition](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0034_FirstLastPosition.java) | 数组、二分查找       | 中等 |
| [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/description/) |                                                              | 数组、二分查找       | 简单 |
| [69. x 的平方根](https://leetcode.cn/problems/sqrtx/description/) |                                                              | 数学、二分查找       | 简单 |
| [367. 有效的完全平方数](https://leetcode.cn/problems/valid-perfect-square/description/) |                                                              | 数学、二分查找       | 简单 |
| [744. 寻找比目标字母大的最小字母](https://leetcode.cn/problems/find-smallest-letter-greater-than-target/description/?envType=study-plan-v2&envId=binary-search) |                                                              | 数组、二分查找       | 简单 |
| [1351. 统计有序矩阵中的负数](https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/) |                                                              | 数组、二分查找、矩阵 | 简单 |
| [878. 第 N 个神奇数字](https://leetcode.cn/problems/nth-magical-number/description/) |                                                              | 数学、二分查找       | 困难 |

## 前缀和

| 题目                                                                                                                                            | 标签                             | 难度 |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------- | ---- |
| [303. 区域和检索 - 数组不可变⁤](https://leetcode.cn/problems/range-sum-query-immutable/description/)                                            | 设计、数组、前缀和               | 简单 |
| [560. 和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/description/)                                                         | 数组、哈希表、前缀和             | 中等 |
| [3028. 边界上的蚂蚁](https://leetcode.cn/problems/ant-on-the-boundary/description/)                                                             | 数组、前缀和、模拟               | 简单 |
| [1124. 表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval/description/)                                        | 栈、数组、哈希表、前缀和、单调栈 | 中等 |
| [1590. 使数组和能被 P 整除](https://leetcode.cn/problems/make-sum-divisible-by-p/description/)                                                  | 数组、哈希表、前缀和             | 中等 |
| [1371. 每个元音包含偶数次的最长子字符串](https://leetcode.cn/problems/find-the-longest-substring-containing-vowels-in-even-counts/description/) | 位运算、哈希表、字符串、前缀和   | 中等 |

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

| 题目                                                                                         | 标签                 | 难度 |
| -------------------------------------------------------------------------------------------- | -------------------- | ---- |
| [64. 最小路径和](https://leetcode.cn/problems/minimum-path-sum/description/)                 | 数组、动态规划、矩阵 | 中等 |
| [1143. 最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/description/) | 字符串、动态规划     | 中等 |
|                                                                                              |                      |      |



## 深度优先搜索


| 题目                                                                                                 | 标签                                   | 难度 |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |
|                                                                                                      |                                        |      |
|                                                                                                      |                                        |      |



## 广度优先搜索


| 题目                                                                                                 | 标签                                   | 难度 |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |
|                                                                                                      |                                        |      |
|                                                                                                      |                                        |      |




## 并查集

| 题目                                                                                                 | 标签                                   | 难度 |
| ---------------------------------------------------------------------------------------------------- | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |
|                                                                                                      |                                        |      |
|                                                                                                      |                                        |      |



## 回溯

| 题目                                                                  | 标签             | 难度 |
| --------------------------------------------------------------------- | ---------------- | ---- |
| [79. 单词搜索](https://leetcode.cn/problems/word-search/description/) | 数组、回溯、矩阵 | 中等 |
|                                                                       |                  |      |
|                                                                       |                  |      |

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

| 题目                                                                                                       | 标签                 | 难度 |
| ---------------------------------------------------------------------------------------------------------- | -------------------- | ---- |
| [77. 组合](https://leetcode.cn/problems/combinations/description/)                                         | 回溯                 | 中等 |
| [216. 组合总和 III](https://leetcode.cn/problems/combination-sum-iii/description/)                         | 数组、回溯           | 中等 |
| [17. 电话号码的字母组合⁤](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/description/) | 哈希表、字符串、回溯 | 中等 |
