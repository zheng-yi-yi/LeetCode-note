package leetcode;

/**
 * 461. 汉明距离
 * 
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 示例 1：
 * 输入：x = 1, y = 4
 * 输出：2
 * 解释：
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 * 
 * 示例 2：
 * 输入：x = 3, y = 1
 * 输出：1
 * 
 * 提示：
 * 0 <= x, y <= 2^31 - 1
 */
public class Code0461_HammingDistance {

    /**
     * 计算两个整数之间的汉明距离
     * 
     * @param x 整数x
     * @param y 整数y
     * @return  两个整数之间的汉明距离
     */
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        // 测试用例1
        int x1 = 1, y1 = 4;
        System.out.println("输入: x = " + x1 + ", y = " + y1);
        int result1 = hammingDistance(x1, y1);
        System.out.println("输出: " + result1);

        // 测试用例2
        int x2 = 3, y2 = 1;
        System.out.println("输入: x = " + x2 + ", y = " + y2);
        int result2 = hammingDistance(x2, y2);
        System.out.println("输出: " + result2);
    }
}
