package leetcode;

import java.util.Arrays;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 * 
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 * 
 * 示例 1：
 * 输入：arr = [0,1,2,3,4,5,6,7,8]
 * 输出：[0,1,2,4,8,3,5,6,7]
 * 解释：[0] 是唯一一个有 0 个 1 的数。
 * [1,2,4,8] 都有 1 个 1 。
 * [3,5,6] 有 2 个 1 。
 * [7] 有 3 个 1 。
 * 按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
 * 
 * 示例 2：
 * 输入：arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * 输出：[1,2,4,8,16,32,64,128,256,512,1024]
 * 解释：数组中所有整数二进制下都只有 1 个 1 ，所以你需要按照数值大小将它们排序。
 * 
 * 示例 3：
 * 输入：arr = [10000,10000]
 * 输出：[10000,10000]
 * 
 * 示例 4：
 * 输入：arr = [2,3,5,7,11,13,17,19]
 * 输出：[2,3,5,17,7,11,13,19]
 * 
 * 示例 5：
 * 输入：arr = [10,100,1000,10000]
 * 输出：[10,100,10000,1000]
 * 
 * 提示：
 * 1 <= arr.length <= 500
 * 0 <= arr[i] <= 10^4
 */
public class Code1356_SortByBits {

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
     * 按照数字二进制下 '1' 的个数升序排序整数数组
     * 
     * @param arr 整数数组
     * @return    按照 '1' 的个数升序排序后的整数数组
     */
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = arr[i];
        }
        
        Arrays.sort(array, (a, b) -> {
            int bitCountA = getOnes(a);
            int bitCountB = getOnes(b);
            if (bitCountA != bitCountB) {
                return bitCountA - bitCountB;
            } else {
                return a - b;
            }
        });
        
        for (int i = 0; i < n; i++) {
            arr[i] = array[i];
        }
        
        return arr;
    }

    public static void main(String[] args) {
        // 测试用例1
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("输入: arr = " + Arrays.toString(arr1));
        int[] result1 = sortByBits(arr1);
        System.out.println("输出: " + Arrays.toString(result1));

        // 测试用例2
        int[] arr2 = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        System.out.println("输入: arr = " + Arrays.toString(arr2));
        int[] result2 = sortByBits(arr2);
        System.out.println("输出: " + Arrays.toString(result2));

        // 测试用例3
        int[] arr3 = {10000, 10000};
        System.out.println("输入: arr = " + Arrays.toString(arr3));
        int[] result3 = sortByBits(arr3);
        System.out.println("输出: " + Arrays.toString(result3));

        // 测试用例4
        int[] arr4 = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("输入: arr = " + Arrays.toString(arr4));
        int[] result4 = sortByBits(arr4);
        System.out.println("输出: " + Arrays.toString(result4));

        // 测试用例5
        int[] arr5 = {10, 100, 1000, 10000};
        System.out.println("输入: arr = " + Arrays.toString(arr5));
        int[] result5 = sortByBits(arr5);
        System.out.println("输出: " + Arrays.toString(result5));
    }
}
