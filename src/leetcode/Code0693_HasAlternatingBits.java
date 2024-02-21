package leetcode;

/**
 * 693. 交替位二进制数
 * 
 * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
 * 
 * 示例 1：
 * 输入：n = 5
 * 输出：true
 * 解释：5 的二进制表示是：101
 * 
 * 示例 2：
 * 输入：n = 7
 * 输出：false
 * 解释：7 的二进制表示是：111.
 * 
 * 示例 3：
 * 输入：n = 11
 * 输出：false
 * 解释：11 的二进制表示是：1011.
 * 
 * 提示：
 * 1 <= n <= 2^31 - 1
 */
public class Code0693_HasAlternatingBits {

    /**
     * 判断给定的正整数的二进制表示是否总是 0、1 交替出现
     * 
     * @param n 正整数
     * @return  是否总是 0、1 交替出现
     */
    public static boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        // 如果n是交替位二进制数，那么此时x的二进制表示全是1
        return (x & (x + 1)) == 0;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 5;
        System.out.println("输入: n = " + n1);
        boolean result1 = hasAlternatingBits(n1);
        System.out.println("输出: " + result1);

        // 测试用例2
        int n2 = 7;
        System.out.println("输入: n = " + n2);
        boolean result2 = hasAlternatingBits(n2);
        System.out.println("输出: " + result2);

        // 测试用例3
        int n3 = 11;
        System.out.println("输入: n = " + n3);
        boolean result3 = hasAlternatingBits(n3);
        System.out.println("输出: " + result3);
    }
}
