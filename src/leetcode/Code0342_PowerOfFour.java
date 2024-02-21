package leetcode;

/**
 * 342. 4 的幂
 * 
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 * 
 * 示例 1：
 * 输入：n = 16
 * 输出：true
 * 
 * 示例 2：
 * 输入：n = 5
 * 输出：false
 * 
 * 示例 3：
 * 输入：n = 1
 * 输出：true
 * 
 * 提示：
 * -2^31 <= n <= 2^31 - 1
 */
public class Code0342_PowerOfFour {

    /**
     * 判断整数 n 是否是 4 的幂次方
     * 
     * @param n 整数 n
     * @return  若 n 是 4 的幂次方返回 true，否则返回 false
     */
    public static boolean isPowerOfFour(int n) {
        // 如果n是4的幂，那么n的二进制表示中有且仅有一个1，并且出现在第偶数个二进制位置上（从0出发）
        // 因此我们构造一个mask，它的所有偶数二进制位都是0，奇数二进制位都是1
        // mask = （10101010101010101010101010101010）2
        // 用16进制的形式表示就是0xaaaaaaaa
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 16;
        System.out.println("输入: n = " + n1);
        System.out.println("输出: " + isPowerOfFour(n1));

        // 测试用例2
        int n2 = 5;
        System.out.println("输入: n = " + n2);
        System.out.println("输出: " + isPowerOfFour(n2));

        // 测试用例3
        int n3 = 1;
        System.out.println("输入: n = " + n3);
        System.out.println("输出: " + isPowerOfFour(n3));
    }
}
