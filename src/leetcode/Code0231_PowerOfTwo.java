package leetcode;
/**
 * 231. 2 的幂
 * 
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得 n == 2^x ，则认为 n 是 2 的幂次方。
 * 
 * 示例 1：
 * 输入：n = 1
 * 输出：true
 * 解释：2^0 = 1
 * 
 * 示例 2：
 * 输入：n = 16
 * 输出：true
 * 解释：2^4 = 16
 * 
 * 示例 3：
 * 输入：n = 3
 * 输出：false
 * 
 * 示例 4：
 * 输入：n = 4
 * 输出：true
 * 解释：2^2 = 4
 * 
 * 示例 5：
 * 输入：n = 5
 * 输出：false
 * 
 * 提示：
 * -2^31 <= n <= 2^31 - 1
 */
public class Code0231_PowerOfTwo {

    /**
     * 判断整数 n 是否是 2 的幂次方
     * 
     * @param n 整数 n
     * @return  若 n 是 2 的幂次方返回 true，否则返回 false
     */
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
        // 或者：
        // return n > 0 && (n & -n) == n;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 1;
        System.out.println("输入: n = " + n1);
        System.out.println("输出: " + isPowerOfTwo(n1));

        // 测试用例2
        int n2 = 16;
        System.out.println("输入: n = " + n2);
        System.out.println("输出: " + isPowerOfTwo(n2));

        // 测试用例3
        int n3 = 3;
        System.out.println("输入: n = " + n3);
        System.out.println("输出: " + isPowerOfTwo(n3));

        // 测试用例4
        int n4 = 4;
        System.out.println("输入: n = " + n4);
        System.out.println("输出: " + isPowerOfTwo(n4));

        // 测试用例5
        int n5 = 5;
        System.out.println("输入: n = " + n5);
        System.out.println("输出: " + isPowerOfTwo(n5));
    }
}
