package leetcode;

/**
 * 201. 数字范围按位与
 * 
 * 给你两个整数 left 和 right，表示区间 [left, right]，返回此区间内所有数字按位与的结果（包含 left 、right 端点）。
 * 
 * 示例 1：
 * 输入：left = 5, right = 7
 * 输出：4
 * 
 * 示例 2：
 * 输入：left = 0, right = 0
 * 输出：0
 * 
 * 示例 3：
 * 输入：left = 1, right = 2147483647
 * 输出：0
 * 
 * 提示：
 * 0 <= left <= right <= 2^31 - 1
 * 
 * 解：
 * 	从最高位开始，找到left和right的最高位的公共前缀。
 * 	当left和right的某一位不同的时候，这一位以及更低的位在[left, right]范围内的所有数中都会出现0和1，
 * 	所以这一位以及更低的位的按位与的结果都是0。
 */
public class Code0201_RangeBitwiseAnd {

    /**
     * 返回区间内所有数字按位与的结果
     * 
     * @param left  左边界整数
     * @param right 右边界整数
     * @return      区间内所有数字按位与的结果
     */
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            ++shift;
        }
        return left << shift;
    }

    public static void main(String[] args) {
        // 测试用例1
        int left1 = 5, right1 = 7;
        System.out.println("输入: left = " + left1 + ", right = " + right1);
        System.out.println("输出: " + rangeBitwiseAnd(left1, right1));

        // 测试用例2
        int left2 = 0, right2 = 0;
        System.out.println("输入: left = " + left2 + ", right = " + right2);
        System.out.println("输出: " + rangeBitwiseAnd(left2, right2));

        // 测试用例3
        int left3 = 1, right3 = 2147483647;
        System.out.println("输入: left = " + left3 + ", right = " + right3);
        System.out.println("输出: " + rangeBitwiseAnd(left3, right3));
    }
}
