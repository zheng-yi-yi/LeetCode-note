package leetcode;

/**
 * 476. 数字的补数
 * 
 * 对整数的二进制表示取反（0 变 1 ，1 变 0）后，再转换为十进制表示，可以得到这个整数的补数。
 * 给你一个整数 num ，输出它的补数。
 * 
 * 示例 1：
 * 输入：num = 5
 * 输出：2
 * 解释：5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
 * 
 * 示例 2：
 * 输入：num = 1
 * 输出：0
 * 解释：1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
 * 
 * 提示：
 * 1 <= num < 2^31
 */
public class Code0476_FindComplement {

    /**
     * 返回整数 num 的补数
     * 
     * @param num 整数 num
     * @return    整数 num 的补数
     */
    public static int findComplement(int num) {
        int x = 0;
        int n = num;
        while (n != 0) {
            x = n;
            n -= (n & -n);
        } // 当退出循环时，x是num的二进制表示中最高位的1，其余位都是0
        return ~num & (x - 1);
    }

    public static void main(String[] args) {
        // 测试用例1
        int num1 = 5;
        System.out.println("输入: num = " + num1);
        System.out.println("输出: " + findComplement(num1));

        // 测试用例2
        int num2 = 1;
        System.out.println("输入: num = " + num2);
        System.out.println("输出: " + findComplement(num2));
    }
}
