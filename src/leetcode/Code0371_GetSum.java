package leetcode;

/**
 * 371. 两整数之和
 * 
 * 给你两个整数 a 和 b，不使用运算符 + 和 -，计算并返回两整数之和。
 * 
 * 示例 1：
 * 输入：a = 1, b = 2
 * 输出：3
 * 
 * 示例 2：
 * 输入：a = 2, b = 3
 * 输出：5
 * 
 * 提示：
 * -1000 <= a, b <= 1000
 */
public class Code0371_GetSum {

    /**
     * 计算两整数之和
     * 
     * @param a 整数a
     * @param b 整数b
     * @return  两整数之和
     */
    public static int getSum(int a, int b) {
        while (b != 0){
            int carry = (a & b) << 1; // 进位结果
            a ^= b; // 异或操作，相当于无进位加法
            b = carry; // 将进位应用于下一位相加
        }
        return a;
    }

    public static void main(String[] args) {
        // 测试用例1
        int a1 = 1, b1 = 2;
        System.out.println("输入: a = " + a1 + ", b = " + b1);
        System.out.println("输出: " + getSum(a1, b1));

        // 测试用例2
        int a2 = 2, b2 = 3;
        System.out.println("输入: a = " + a2 + ", b = " + b2);
        System.out.println("输出: " + getSum(a2, b2));
    }
}
