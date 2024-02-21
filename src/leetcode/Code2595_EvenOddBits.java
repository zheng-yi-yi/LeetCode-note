package leetcode;
/**
 * 2595. 奇偶位数
 * 
 * 给你一个正整数 n 。
 * 用 even 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的偶数下标的个数。
 * 用 odd 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的奇数下标的个数。
 * 返回整数数组 answer ，其中 answer = [even, odd] 。
 * 
 * 示例 1：
 * 输入：n = 17
 * 输出：[2,0]
 * 解释：17 的二进制形式是 10001 。 
 * 下标 0 和 下标 4 对应的值为 1 。 
 * 共有 2 个偶数下标，0 个奇数下标。
 * 
 * 示例 2：
 * 输入：n = 2
 * 输出：[0,1]
 * 解释：2 的二进制形式是 10 。 
 * 下标 1 对应的值为 1 。 
 * 共有 0 个偶数下标，1 个奇数下标。
 * 
 * 提示：
 * 1 <= n <= 1000
 */
public class Code2595_EvenOddBits {

    /**
     * 计算正整数 n 在二进制形式中偶数位和奇数位上的1的个数
     * 
     * @param n 正整数
     * @return  整数数组，其中[0]表示偶数位上的1的个数，[1]表示奇数位上的1的个数
     */
    public static int[] evenOddBit(int n) {
        int index = 0;
        int even = 0, odd = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n >>= 1;
            index++;
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 17;
        int[] result1 = evenOddBit(n1);
        System.out.println("输入: n = " + n1);
        System.out.println("输出: [" + result1[0] + ", " + result1[1] + "]");

        // 测试用例2
        int n2 = 2;
        int[] result2 = evenOddBit(n2);
        System.out.println("输入: n = " + n2);
        System.out.println("输出: [" + result2[0] + ", " + result2[1] + "]");
    }
}
