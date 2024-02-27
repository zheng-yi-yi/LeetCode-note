package com.zyy;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. 组合总和 III
 * 
 * 找出所有相加之和为 n 的 k 个数的组合，且满足只使用数字1到9，每个数字最多使用一次。
 * 返回所有可能的有效组合的列表。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
 * 
 * 示例 1:
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 解释:
 * 1 + 2 + 4 = 7
 * 没有其他符合的组合了。
 * 
 * 示例 2:
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * 解释:
 * 1 + 2 + 6 = 9
 * 1 + 3 + 5 = 9
 * 2 + 3 + 4 = 9
 * 没有其他符合的组合了。
 * 
 * 示例 3:
 * 输入: k = 4, n = 1
 * 输出: []
 * 解释: 不存在有效的组合。
 * 在[1,9]范围内使用4个不同的数字，我们可以得到的最小和是1+2+3+4 = 10，因为10 > 1，没有有效的组合。
 * 
 * 提示:
 * 2 <= k <= 9
 * 1 <= n <= 60
 */
public class Code0216_CombinationSumIII {

    public List<List<Integer>> result = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();
    public int k;

    /**
     * 返回所有相加之和为 n 的 k 个数的组合
     * 
     * @param k 组合的个数
     * @param n 目标和
     * @return  所有可能的有效组合的列表
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        backtrack(1, n);
        return result;
    }

    private void backtrack(int start, int remain) {
        if (path.size() > k) {
            return;
        }
        if (path.size() == k && remain == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtrack(i + 1, remain - i);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        // 测试用例1
        int k1 = 3;
        int n1 = 7;
        System.out.println("输入: k = " + k1 + ", n = " + n1);
        Code0216_CombinationSumIII solution1 = new Code0216_CombinationSumIII();
        System.out.println("输出: " + solution1.combinationSum3(k1, n1));

        // 测试用例2
        int k2 = 3;
        int n2 = 9;
        System.out.println("输入: k = " + k2 + ", n = " + n2);
        Code0216_CombinationSumIII solution2 = new Code0216_CombinationSumIII();
        System.out.println("输出: " + solution2.combinationSum3(k2, n2));

        // 测试用例3
        int k3 = 4;
        int n3 = 1;
        System.out.println("输入: k = " + k3 + ", n = " + n3);
        Code0216_CombinationSumIII solution3 = new Code0216_CombinationSumIII();
        System.out.println("输出: " + solution3.combinationSum3(k3, n3));
    }
}
