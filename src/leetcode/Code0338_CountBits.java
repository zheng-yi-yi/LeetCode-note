package leetcode;

/**
 * 338. 比特位计数
 * 
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 * 
 * 示例 1：
 * 输入：n = 2
 * 输出：[0,1,1]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 
 * 示例 2：
 * 输入：n = 5
 * 输出：[0,1,1,2,1,2]
 * 解释：
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 * 
 * 提示：
 * 0 <= n <= 10^5
 */
public class Code0338_CountBits {

    /**
     * 获取整数的二进制表示中 '1' 的个数
     * 
     * @param n 整数
     * @return  整数 n 的二进制表示中 '1' 的个数
     */
    public static int getOnes(int n) {
        int ret = 0;
        while (n != 0) {
            n = n & (n - 1);
            ret++;
        }
        return ret;
    }

    /**
     * 计算每个整数的二进制表示中 '1' 的个数
     * 
     * @param n 整数 n
     * @return  长度为 n + 1 的数组，其中索引 i 处的值表示 i 的二进制表示中 '1' 的个数
     */
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = getOnes(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 2;
        System.out.println("输入: n = " + n1);
        int[] result1 = countBits(n1);
        System.out.print("输出: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 测试用例2
        int n2 = 5;
        System.out.println("输入: n = " + n2);
        int[] result2 = countBits(n2);
        System.out.print("输出: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
