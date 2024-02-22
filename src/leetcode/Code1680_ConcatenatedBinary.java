package leetcode;

/**
 * 1680. 连接连续二进制数字
 * 
 * 给你一个整数 n ，请你将 1 到 n 的二进制表示连接起来，并返回连接结果对应的十进制数字对 10^9 + 7 取余的结果。
 * 
 * 示例 1：
 * 输入：n = 1
 * 输出：1
 * 解释：二进制的 "1" 对应着十进制的 1 。
 * 
 * 示例 2：
 * 输入：n = 3
 * 输出：27
 * 解释：二进制下，1，2 和 3 分别对应 "1" ，"10" 和 "11" 。
 * 将它们依次连接，我们得到 "11011" ，对应着十进制的 27 。
 * 
 * 示例 3：
 * 输入：n = 12
 * 输出：505379714
 * 解释：连接结果为 "1101110010111011110001001101010111100" 。
 * 对应的十进制数字为 118505380540 。
 * 对 10^9 + 7 取余后，结果为 505379714 。
 * 
 * 提示：
 * 1 <= n <= 10^5
 */
public class Code1680_ConcatenatedBinary {

    /**
     * 连接连续二进制数字并返回十进制数字对 10^9 + 7 取余的结果
     * 
     * @param n 整数 n
     * @return  连接结果对应的十进制数字对 10^9 + 7 取余的结果
     */
    public static int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        long res = 0;
        int shift = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                // i is a power of 2
                shift++;
            }
            res = ((res << shift) + i) % MOD;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 1;
        System.out.println("输入: n = " + n1);
        System.out.println("输出: " + concatenatedBinary(n1));

        // 测试用例2
        int n2 = 3;
        System.out.println("输入: n = " + n2);
        System.out.println("输出: " + concatenatedBinary(n2));

        // 测试用例3
        int n3 = 12;
        System.out.println("输入: n = " + n3);
        System.out.println("输出: " + concatenatedBinary(n3));
    }
}
