package com.leetcode;

/**
 * 0121. 买卖股票的最佳时机
 * 
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * 
 * 示例 1：
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 
 * 提示：
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */


public class Code0121_MaxProfit {

    /**
     * 买卖股票的最佳时机I （通用解法）
     * 
     * @param prices 股票价格数组
     * @return 可获取的最大利润
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int[][] dp = new int[n][2];
        // dp[i][0] : 最多进行1次交易，第i天结束时持有0份股票的最大收益为 0
        dp[0][0] = 0;
        // dp[i][1] : 最多进行1次交易，第i天结束时持有1份股票的最大收益为 -prices[0] （也就是买入prices[0]）
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]); // 休息 / 卖出
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]); // 休息 / 买入
        }
        return dp[n - 1][0];
    }

    /**
     * 买卖股票的最佳时机I （特解）
     * 
     * 我们用 profit1 表示第 i 天之前（不含第 i 天）的最低股票价格（也就是股票价格相反数的最大值）
     * 
     * 对于 profit0，只需要决定卖出和休息中的哪项操作可以得到更高的收益：
     * 	1）如果休息，最大收益就是 profit0
     * 	2）如果进行卖出操作，则买入股票的价格就是 profit1，此时最大收益为 profit1 + prices[i]
     * 
     * @param prices 股票价格数组
     * @return 可获取的最大利润
     */
    public static int maxProfit_(int[] prices) {
    	if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit0 = 0, profit1 = -prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            profit0 = Math.max(profit0, profit1 + prices[i]);
            profit1 = Math.max(profit1, -prices[i]);
        }
        return profit0;
    }
    
    public static void main(String[] args) {
        // 示例测试
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("示例1测试结果：" + maxProfit(prices1)); // 输出：5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("示例2测试结果：" + maxProfit(prices2)); // 输出：0
    }
}
