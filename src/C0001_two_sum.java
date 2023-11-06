import java.util.HashMap;
import java.util.Map;

public class C0001_two_sum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 }; // 将这里的数组替换为你的输入数组
        int target = 9; // 将这里的目标值替换为你的目标值

        // 测试 twoSum_S1
        int[] result1 = C0001_two_sum.twoSum_S1(nums, target);
        if (result1.length == 2) {
            System.out.println("twoSum_S1 结果: [" + result1[0] + ", " + result1[1] + "]");
        } else {
            System.out.println("twoSum_S1 结果: 未找到有效的索引。");
        }

        // 测试 twoSum_S2
        int[] result2 = C0001_two_sum.twoSum_S2(nums, target);
        if (result2.length == 2) {
            System.out.println("twoSum_S2 结果: [" + result2[0] + ", " + result2[1] + "]");
        } else {
            System.out.println("twoSum_S2 结果: 未找到有效的索引。");
        }
    }

    /**
     *
     * @param nums:   整数数组 nums
     * @param target: 整数目标值
     * @return 在nums数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标
     *         备注：假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
     */
    public static int[] twoSum_S1(int[] nums, int target) {
        // 思路一：暴力枚举
        // 1. 第一层循环中，i 从 0 遍历到 n-2
        // 2. 第二层循环中，j 从 i+1 遍历到 n-1
        // 3. 这样可以防止得到重复的解
        // 4. 然后，只要找到nums[i]+nums[j]==target即可，这就是暴力枚举
        // 5. 代码如下：
        int n = nums.length;

        for (int i = 0; i <= n - 2; i++) {

            for (int j = i + 1; j <= n - 1; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};

        // 时间复杂度：O(n^2)
        // 空间复杂度：O(1)
    }

    /**
     *
     * @param nums:   整数数组 nums
     * @param target: 整数目标值
     * @return 在nums数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标
     *         备注：假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
     */
    public static int[] twoSum_S2(int[] nums, int target) {
        // 思路：哈希存储
        // 1. 用一层循环即可，for循环中 i 从 0 遍历到 n-1
        // 2. 当我们遍历到某一个数 nums[i] 时，计算需要与之相加得到目标整数 target 的补数，即 complement = target -
        // nums[i]
        // 3. 接着我们需要检查哈希表中是否已经存在这个补数 complement
        // 4. 如果存在，我们需要返回当前数 nums[i] 的索引 i 以及哈希表中存储的补数对应的索引 map.get(complement)
        // 5. 如果不存在，那就将当前数 nums[i] 以及它的索引 i 都存进哈希表中，即 map.put(nums[i], i)
        // 6. 代码如下：

        Map<Integer, Integer> map = new HashMap<>(); // 创建一个哈希表，用于存储每个数及其对应的索引
        int n = nums.length; // 数组的长度

        for (int i = 0; i <= n - 1; i++) { // 遍历数组，i 从 0 遍历到 n-1

            int complement = target - nums[i]; // 补数

            // 如果哈希表中已经包含了complement，说明找到了答案
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // 否则将当前数 nums[i] 及其索引 i 放入哈希表
            map.put(nums[i], i);

        }

        // 如果没有找到答案，返回一个空数组
        return new int[] {};

        // 时间复杂度：O(n)
        // 空间复杂度：O(n)
    }
}
