package com.zyy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. 组合
 * 
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * 
 * 你可以按任何顺序返回答案。
 * 
 * 示例 1：
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 
 * 示例 2：
 * 输入：n = 1, k = 1
 * 输出：[[1]]
 * 
 * 提示：
 * 1 <= n <= 20
 * 1 <= k <= n
 */
public class Code_Combinations {

    List<List<Integer>> result = new ArrayList<>();
    
    LinkedList<Integer> path = new LinkedList<>();

    /**
     * 返回范围 [1, n] 中所有可能的 k 个数的组合
     * 
     * @param n 范围的上限
     * @param k 组合的长度
     * @return  所有可能的组合
     */
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1);
        return result;
    }

    private void backtrack(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtrack(n, k, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 4;
        int k1 = 2;
        System.out.println("输入: n = " + n1 + ", k = " + k1);
        Code_Combinations solution1 = new Code_Combinations();
        System.out.println("输出: " + solution1.combine(n1, k1));

        // 测试用例2
        int n2 = 1;
        int k2 = 1;
        System.out.println("输入: n = " + n2 + ", k = " + k2);
        Code_Combinations solution2 = new Code_Combinations();
        System.out.println("输出: " + solution2.combine(n2, k2));
    }
}
