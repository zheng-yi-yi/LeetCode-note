<div align="center">

<h1>LeetCode-note</h1>

</div>

# 目录

- [目录](#目录)
- [笔记](#笔记)
- [题单](#题单)
  - [二分查找](#二分查找)
  - [前缀和](#前缀和)
  - [动态规划](#动态规划)
    - [一维dp](#一维dp)
    - [二维dp](#二维dp)
  - [深度优先搜索](#深度优先搜索)
  - [广度优先搜索](#广度优先搜索)
  - [并查集](#并查集)
  - [回溯](#回溯)
  - [位运算](#位运算)
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

## 前缀和

| 题目                                                                                                                                            | 标签                             | 难度 |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------- | ---- |
| [303. 区域和检索 - 数组不可变⁤](https://leetcode.cn/problems/range-sum-query-immutable/description/)                                            | 设计、数组、前缀和               | 简单 |
| [560. 和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/description/)                                                         | 数组、哈希表、前缀和             | 中等 |
| [3028. 边界上的蚂蚁](https://leetcode.cn/problems/ant-on-the-boundary/description/)                                                             | 数组、前缀和、模拟               | 简单 |
| [1124. 表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval/description/)                                        | 栈、数组、哈希表、前缀和、单调栈 | 中等 |
| [1590. 使数组和能被 P 整除](https://leetcode.cn/problems/make-sum-divisible-by-p/description/)                                                  | 数组、哈希表、前缀和             | 中等 |
| [1371. 每个元音包含偶数次的最长子字符串](https://leetcode.cn/problems/find-the-longest-substring-containing-vowels-in-even-counts/description/) | 位运算、哈希表、字符串、前缀和   | 中等 |

## 记忆化搜索

| 题目                                                         | 标签                                                         | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---- |
| [329. 矩阵中的最长递增路径](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/description/) | 深度优先搜索、广度优先搜索、图、拓扑排序、记忆化搜索、数组、动态规划、矩阵 | 难度 |
| [397. 整数替换](https://leetcode.cn/problems/integer-replacement/description/) | 贪心、位运算、记忆化搜索、动态规划                           | 中等 |



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



## 深度优先搜索


| 题目                                                         | 标签                                   | 难度 |
| ------------------------------------------------------------ | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |



## 广度优先搜索


| 题目                                                         | 标签                                   | 难度 |
| ------------------------------------------------------------ | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |




## 并查集

| 题目                                                         | 标签                                   | 难度 |
| ------------------------------------------------------------ | -------------------------------------- | ---- |
| [1971. 寻找图中是否存在路径](https://leetcode.cn/problems/find-if-path-exists-in-graph/description/) | 深度优先搜索、广度优先搜索、并查集、图 | 中等 |



## 回溯

| 题目                                                         | 标签             | 难度 |
| ------------------------------------------------------------ | ---------------- | ---- |
| [79. 单词搜索](https://leetcode.cn/problems/word-search/description/) | 数组、回溯、矩阵 | 中等 |



## 位运算

| 题目                                                         | 参考                                                         | 标签                                 | 难度 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------ | ---- |
| [1486. 数组异或操作](https://leetcode.cn/problems/xor-operation-in-an-array/description/) | [ArrayXOR](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1426_ArrayXOR.java) | 位运算、数学                         | 简单 |
| [2595. 奇偶位数](https://leetcode.cn/problems/number-of-even-and-odd-bits/description/) | [EvenOddBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2595_EvenOddBits.java) | 位运算                               | 简单 |
| [231. 2 的幂](https://leetcode.cn/problems/power-of-two/description/) | [PowerOfTwo](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0231_PowerOfTwo.java) | 位运算、递归、数学                   | 简单 |
| [342. 4的幂](https://leetcode.cn/problems/power-of-four/description/) | [PowerOfFour](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0342_PowerOfFour.java) | 位运算、递归、数学                   | 简单 |
| [476. 数字的补数](https://leetcode.cn/problems/number-complement/description/) | [FindComplement](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0476_FindComplement.java) | 位运算                               | 简单 |
| [191. 位1的个数](https://leetcode.cn/problems/number-of-1-bits/description/) | [HammingWeight](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0191_HammingWeight.java) | 位运算、分治                         | 简单 |
| [338. 比特位计数](https://leetcode.cn/problems/counting-bits/description/) | [CountBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0338_CountBits.java) | 位运算、动态规划                     | 简单 |
| [1356. 根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/) | [SortByBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1356_SortByBits.java) | 位运算、数组、计数、排序             | 简单 |
| [461. 汉明距离](https://leetcode.cn/problems/hamming-distance/) | [HammingDistance](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0461_HammingDistance.java) | 位运算                               | 简单 |
| [2220. 转换数字的最少位翻转次数](https://leetcode.cn/problems/minimum-bit-flips-to-convert-number/) | [MinBitFlips](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2220_MinBitFlips.java) | 位运算                               | 简单 |
| [868. 二进制间距](https://leetcode.cn/problems/binary-gap/)  | [BinaryGap](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0868_BinaryGap.java) | 位运算                               | 简单 |
| [2917. 找出数组中的 K-or 值](https://leetcode.cn/problems/find-the-k-or-of-an-array/) | [FindKOr](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2917_FindKOr.java) | 位运算、数组                         | 简单 |
| [693. 交替位二进制数](https://leetcode.cn/problems/binary-number-with-alternating-bits/) | [HasAlternatingBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0693_HasAlternatingBits.java) | 位运算                               | 简单 |
| [136. 只出现一次的数字](https://leetcode.cn/problems/single-number/) | [SingleNumber](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0136_SingleNumber.java) | 位运算、数组                         | 简单 |
| [137. 只出现一次的数字 II](https://leetcode.cn/problems/single-number-ii/) | [SingleNumberII](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0137_SingleNumberII.java) | 位运算、数组                         | 中等 |
| [260. 只出现一次的数字 III](https://leetcode.cn/problems/single-number-iii/) | [SingleNumberIII](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0260_SingleNumberIII.java) | 位运算、数组                         | 中等 |
| [190. 颠倒二进制位](https://leetcode.cn/problems/reverse-bits/) | [ReverseBits](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0190_ReverseBits.java) | 位运算、分治                         | 简单 |
| [201. 数字范围按位与](https://leetcode.cn/problems/bitwise-and-of-numbers-range/) | [RangeBitwiseAnd](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0201_RangeBitwiseAnd.java) | 位运算                               | 中等 |
| [371. 两整数之和](https://leetcode.cn/problems/sum-of-two-integers/) | [GetSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0371_GetSum.java) | 位运算、数学                         | 中等 |
| [1680. 连接连续二进制数字](https://leetcode.cn/problems/concatenation-of-consecutive-binary-numbers/) | [ConcatenatedBinary](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1680_ConcatenatedBinary.java) | 位运算、数学、模拟                   | 中等 |
| [1611. 使整数变为 0 的最少操作次数](https://leetcode.cn/problems/minimum-one-bit-operations-to-make-integers-zero/) | [MinimumOneBitOperations](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1611_MinimumOneBitOperations.java) | 位运算、记忆化搜索、动态规划         | 困难 |
| [1835. 所有数对按位与结果的异或和](https://leetcode.cn/problems/find-xor-sum-of-all-pairs-bitwise-and/) | [GetXORSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1835_GetXORSum.java) | 位运算、数组、数学                   | 困难 |
| [2275. 按位与结果大于零的最长组合](https://leetcode.cn/problems/largest-combination-with-bitwise-and-greater-than-zero/) | [LargestCombination](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code2275_LargestCombination.java) | 位运算、数组、哈希表、计数           | 中等 |
| [1863. 找出所有子集的异或总和再求和](https://leetcode.cn/problems/sum-of-all-subset-xor-totals/) | [SubsetXORSum](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code1863_SubsetXORSum.java) | 位运算、数组、数学、回溯、组合、数学 | 简单 |
| [477. 汉明距离总和](https://leetcode.cn/problems/total-hamming-distance/) | [TotalHammingDistance](https://github.com/zheng-yi-yi/LeetCode-note/blob/main/src/leetcode/Code0477_TotalHammingDistance.java) | 位运算、数组、数学                   | 中等 |
| [2980. 检查按位或是否存在尾随零](https://leetcode.cn/problems/check-if-bitwise-or-has-trailing-zeros/) |                                                              |                                      |      |
| [1318. 或运算的最小翻转次数](https://leetcode.cn/problems/minimum-flips-to-make-a-or-b-equal-to-c/) |                                                              |                                      |      |
| [2419. 按位与最大的最长子数组](https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/) |                                                              |                                      |      |
| [2871. 将数组分割成最多数目的子数组](https://leetcode.cn/problems/split-array-into-maximum-number-of-subarrays/) |                                                              |                                      |      |
| [2401. 最长优雅子数组](https://leetcode.cn/problems/longest-nice-subarray/) |                                                              |                                      |      |
| [2680. 最大或值](https://leetcode.cn/problems/maximum-or/)   |                                                              |                                      |      |
| [2411. 按位或最大的最小子数组长度](https://leetcode.cn/problems/smallest-subarrays-with-maximum-bitwise-or/) |                                                              |                                      |      |
| [898. 子数组按位或操作](https://leetcode.cn/problems/bitwise-ors-of-subarrays/) |                                                              |                                      |      |
| [1521. 找到最接近目标值的函数值](https://leetcode.cn/problems/find-a-value-of-a-mysterious-function-closest-to-target/) |                                                              |                                      |      |
| [1720. 解码异或后的数组](https://leetcode.cn/problems/decode-xored-array/) |                                                              |                                      |      |
| [2433. 找出前缀异或的原始数组](https://leetcode.cn/problems/find-the-original-array-of-prefix-xor/) |                                                              |                                      |      |
| [1310. 子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray/) |                                                              |                                      |      |
| [2683. 相邻值的按位异或](https://leetcode.cn/problems/neighboring-bitwise-xor/) |                                                              |                                      |      |
| [2997. 使数组异或和等于 K 的最少操作次数](https://leetcode.cn/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/) |                                                              |                                      |      |
| [1442. 形成两个异或相等数组的三元组数目](https://leetcode.cn/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/) |                                                              |                                      |      |
| [2429. 最小异或](https://leetcode.cn/problems/minimize-xor/) |                                                              |                                      |      |
| [2527. 查询数组异或美丽值](https://leetcode.cn/problems/find-xor-beauty-of-array/) |                                                              |                                      |      |
| [2317. 操作后的最大异或和](https://leetcode.cn/problems/maximum-xor-after-operations/) |                                                              |                                      |      |
| [2588. 统计美丽子数组数目](https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/) |                                                              |                                      |      |
| [2564. 子字符串异或查询](https://leetcode.cn/problems/substring-xor-queries/) |                                                              |                                      |      |
| [1734. 解码异或后的排列](https://leetcode.cn/problems/decode-xored-permutation/) |                                                              |                                      |      |
| [2857. 统计距离为 k 的点对](https://leetcode.cn/problems/count-pairs-of-points-with-distance-k/) |                                                              |                                      |      |
| [2546. 执行逐位运算使字符串相等](https://leetcode.cn/problems/apply-bitwise-operations-to-make-strings-equal/) |                                                              |                                      |      |
| [1558. 得到目标数组的最少函数调用次数](https://leetcode.cn/problems/minimum-numbers-of-function-calls-to-make-target-array/) |                                                              |                                      |      |
| [2571. 将整数减少到零需要的最少操作数](https://leetcode.cn/problems/minimum-operations-to-reduce-an-integer-to-0/) |                                                              |                                      |      |
| [2568. 最小无法得到的或值](https://leetcode.cn/problems/minimum-impossible-or/) |                                                              |                                      |      |
| [2939. 最大异或乘积](https://leetcode.cn/problems/maximum-xor-product/) |                                                              |                                      |      |
| [2749. 得到整数零需要执行的最少操作数](https://leetcode.cn/problems/minimum-operations-to-make-the-integer-zero/) |                                                              |                                      |      |
| [2835. 使子序列的和等于目标的最少操作次数](https://leetcode.cn/problems/minimum-operations-to-form-subsequence-with-target-sum/) |                                                              |                                      |      |
| [2897. 对数组执行操作使平方和最大](https://leetcode.cn/problems/apply-operations-on-array-to-maximize-sum-of-squares/) |                                                              |                                      |      |
| [810. 黑板异或游戏](https://leetcode.cn/problems/chalkboard-xor-game/) |                                                              |                                      |      |






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
