package leetcode;

import java.util.Arrays;

/**
 * 2275. 按位与结果大于零的最长组合
 * 
 * 对数组 nums 执行 按位与 相当于对数组 nums 中的所有整数执行 按位与 。
 * 例如，对 nums = [1, 5, 3] 来说，按位与等于 1 & 5 & 3 = 1 。
 * 同样，对 nums = [7] 而言，按位与等于 7 。
 * 给你一个正整数数组 candidates 。计算 candidates 中的数字每种组合下 按位与 的结果。 candidates 中的每个数字在每种组合中只能使用 一次 。
 * 返回按位与结果大于 0 的 最长 组合的长度。
 * 
 * 示例 1：
 * 输入：candidates = [16,17,71,62,12,24,14]
 * 输出：4
 * 解释：组合 [16,17,62,24] 的按位与结果是 16 & 17 & 62 & 24 = 16 > 0 。
 * 组合长度是 4 。
 * 可以证明不存在按位与结果大于 0 且长度大于 4 的组合。
 * 注意，符合长度最大的组合可能不止一种。
 * 例如，组合 [62,12,24,14] 的按位与结果是 62 & 12 & 24 & 14 = 8 > 0 。
 * 
 * 示例 2：
 * 输入：candidates = [8,8]
 * 输出：2
 * 解释：最长组合是 [8,8] ，按位与结果 8 & 8 = 8 > 0 。
 * 组合长度是 2 ，所以返回 2 。
 * 
 * 提示：
 * 1 <= candidates.length <= 10^5
 * 1 <= candidates[i] <= 10^7
 */
public class Code2275_LargestCombination {

    /**
     * 计算candidates中每个数字在每个位上出现的次数，找出出现次数最多的位数就是答案
     * 
     * @param candidates 正整数数组
     * @return 按位与结果大于 0 的最长组合的长度
     */
    public static int largestCombination(int[] candidates) {
        int[] bitCounts = new int[25]; // 根据数据范围调整这里的位数
        int max = 0;
        
        for (int c : candidates) {
            // 统计每个数字中每个位上出现的次数
            for (int i = 0; i < 25; i++) {
                if (((c >> i) & 1) == 1) { // 通过右移和与运算判断当前位是否为1
                    bitCounts[i]++;
                }
            }
        }
        
        for (int count : bitCounts) {
            max = Math.max(max, count);
        }
        
        return max;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] candidates1 = {16,17,71,62,12,24,14};
        System.out.println("输入: candidates = " + Arrays.toString(candidates1));
        System.out.println("输出: " + largestCombination(candidates1));

        // 测试用例2
        int[] candidates2 = {8,8};
        System.out.println("输入: candidates = " + Arrays.toString(candidates2));
        System.out.println("输出: " + largestCombination(candidates2));
    }
}
