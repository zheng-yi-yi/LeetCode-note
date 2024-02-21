package leetcode;

/**
 * 1426. 数组异或操作
 * 
 * 给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * 
 * 示例 1：
 * 输入：n = 5, start = 0
 * 输出：8
 * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
 * "^" 为按位异或 XOR 运算符。
 * 
 * 示例 2：
 * 输入：n = 4, start = 3
 * 输出：8
 * 解释：数组 nums 为 [3, 5, 7, 9]，其中 (3 ^ 5 ^ 7 ^ 9) = 8.
 * 
 * 示例 3：
 * 输入：n = 1, start = 7
 * 输出：7
 * 
 * 示例 4：
 * 输入：n = 10, start = 5
 * 输出：2
 * 
 * 提示：
 * 1 <= n <= 1000
 * 0 <= start <= 1000
 * n == nums.length
 */

public class Code1426_ArrayXOR {

    /**
     * 数组异或操作
     * 
     * @param n     整数，数组的长度
     * @param start 整数，数组的起始值
     * @return      数组中所有元素按位异或后的结果
     */
    public static int xorOperation(int n, int start) {
        int res = 0;
        for(int i = 0; i < n; i++) {
            res ^= (start + 2 * i);
        }
        return res;
    }

    public static void main(String[] args) {
        // 测试用例1
        int n1 = 5, start1 = 0;
        System.out.println("输入: n = " + n1 + ", start = " + start1);
        System.out.println("输出: " + xorOperation(n1, start1));

        // 测试用例2
        int n2 = 4, start2 = 3;
        System.out.println("输入: n = " + n2 + ", start = " + start2);
        System.out.println("输出: " + xorOperation(n2, start2));

        // 测试用例3
        int n3 = 1, start3 = 7;
        System.out.println("输入: n = " + n3 + ", start = " + start3);
        System.out.println("输出: " + xorOperation(n3, start3));

        // 测试用例4
        int n4 = 10, start4 = 5;
        System.out.println("输入: n = " + n4 + ", start = " + start4);
        System.out.println("输出: " + xorOperation(n4, start4));
    }
}
