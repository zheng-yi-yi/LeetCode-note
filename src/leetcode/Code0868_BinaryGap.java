package leetcode;

/**
 * 868. 二进制间距
 * 
 * 给定一个正整数 n，找到并返回 n 的二进制表示中两个 相邻 1 之间的 最长距离 。如果不存在两个相邻的 1，返回 0 。
 * 
 * 如果只有 0 将两个 1 分隔开（可能不存在 0 ），则认为这两个 1 彼此 相邻 。两个 1 之间的距离是它们的二进制表示中位置的绝对差。
 * 例如，"1001" 中的两个 1 的距离为 3 。
 * 
 * 示例 1：
 * 输入：n = 22
 * 输出：2
 * 解释：22 的二进制是 "10110" 。
 * 在 22 的二进制表示中，有三个 1，组成两对相邻的 1 。
 * 第一对相邻的 1 中，两个 1 之间的距离为 2 。
 * 第二对相邻的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 * 
 * 示例 2：
 * 输入：n = 8
 * 输出：0
 * 解释：8 的二进制是 "1000" 。
 * 在 8 的二进制表示中没有相邻的两个 1，所以返回 0 。
 * 
 * 示例 3：
 * 输入：n = 5
 * 输出：2
 * 解释：5 的二进制是 "101" 。
 * 
 * 提示：
 * 1 <= n <= 10^9
 */
public class Code0868_BinaryGap {

    /**
     * 找到并返回 n 的二进制表示中两个相邻 1 之间的最长距离
     * 
     * @param n 正整数
     * @return 两个相邻 1 之间的最长距离
     */
    public static int binaryGap(int n) {
        int last = -1, res = 0;
        for (int i = 0; i < 32; ++i) {
            if (((n >> i) & 1) > 0) {
                if (last >= 0) {
                    res = Math.max(res, i - last);
                }
                last = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 22;
        System.out.println("输入: n = " + n1);
        int result1 = binaryGap(n1);
        System.out.println("输出: " + result1);

        // 测试用例2
        int n2 = 8;
        System.out.println("输入: n = " + n2);
        int result2 = binaryGap(n2);
        System.out.println("输出: " + result2);

        // 测试用例3
        int n3 = 5;
        System.out.println("输入: n = " + n3);
        int result3 = binaryGap(n3);
        System.out.println("输出: " + result3);
    }
}
