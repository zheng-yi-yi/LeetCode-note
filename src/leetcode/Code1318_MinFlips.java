package leetcode;

/**
 * 1318. 或运算的最小翻转次数
 *
 * 给你三个正整数 a、b 和 c。
 * 你可以对 a 和 b 的二进制表示进行位翻转操作，返回能够使按位或运算 a OR b == c 成立的最小翻转次数。
 *
 * 「位翻转操作」是指将一个数的二进制表示任何单个位上的 1 变成 0 或者 0 变成 1 。
 *
 * 示例 1：
 * 输入：a = 2, b = 6, c = 5
 * 输出：3
 * 解释：翻转后 a = 1 , b = 4 , c = 5 使得 a OR b == c
 *
 * 示例 2：
 * 输入：a = 4, b = 2, c = 7
 * 输出：1
 *
 * 示例 3：
 * 输入：a = 1, b = 2, c = 3
 * 输出：0
 *
 * 提示：
 * 1 <= a <= 10^9
 * 1 <= b <= 10^9
 * 1 <= c <= 10^9
 */
public class Code1318_MinFlips {

    /**
     * 或运算的最小翻转次数
     *
     * @param a 正整数 a
     * @param b 正整数 b
     * @param c 正整数 c
     * @return 能够使按位或运算 a OR b == c 成立的最小翻转次数
     */
    public static int minFlips(int a, int b, int c) {
        int flips = 0;
        // 遍历每一位
        for (int i = 0; i < 31; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;
            if (bitC == 0) {    // 如果c的这一位是0，那么a和b的这一位都必须是0。我们需要翻转a和b的这一位上的1
                flips += bitA + bitB;
            } else { // 如果c的这一位是1，那么a和b的这一位至少有一个是1。我们需要翻转a和b的这一位上的0
                flips += bitA == bitB && bitB == 0 ? 1 : 0;
            }
        }
        return flips;
    }

    public static void main(String[] args) {
        // 测试用例1
        int a1 = 2, b1 = 6, c1 = 5;
        System.out.println("输入: a = " + a1 + ", b = " + b1 + ", c = " + c1);
        System.out.println("输出: " + minFlips(a1, b1, c1));

        // 测试用例2
        int a2 = 4, b2 = 2, c2 = 7;
        System.out.println("输入: a = " + a2 + ", b = " + b2 + ", c = " + c2);
        System.out.println("输出: " + minFlips(a2, b2, c2));

        // 测试用例3
        int a3 = 1, b3 = 2, c3 = 3;
        System.out.println("输入: a = " + a3 + ", b = " + b3 + ", c = " + c3);
        System.out.println("输出: " + minFlips(a3, b3, c3));
    }
}
