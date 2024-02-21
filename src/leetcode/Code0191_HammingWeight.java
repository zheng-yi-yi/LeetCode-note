package leetcode;

/**
 * 191. 位1的个数
 * 
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * 
 * 示例 1：
 * 输入：n = 00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 
 * 示例 2：
 * 输入：n = 00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * 
 * 示例 3：
 * 输入：n = 11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 * 
 * 提示：
 * 输入必须是长度为 32 的 二进制串 。
 */
public class Code0191_HammingWeight {

    /**
     * 计算无符号整数的二进制表达式中数字位数为 '1' 的个数
     * 
     * @param n 无符号整数
     * @return  '1' 的个数
     */
    public static int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 0b00000000000000000000000000001011;
        System.out.println("输入: n = " + n1);
        System.out.println("输出: " + hammingWeight(n1));

        // 测试用例2
        int n2 = 0b00000000000000000000000010000000;
        System.out.println("输入: n = " + n2);
        System.out.println("输出: " + hammingWeight(n2));

        // 测试用例3
        int n3 = 0b11111111111111111111111111111101;
        System.out.println("输入: n = " + n3);
        System.out.println("输出: " + hammingWeight(n3));
    }
}
