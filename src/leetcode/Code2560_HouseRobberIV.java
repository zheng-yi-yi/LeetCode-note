package leetcode;
/**
 * 2560. 打家劫舍 IV
 *
 * 沿街有一排连续的房屋。每间房屋内都藏有一定的现金。现在有一位小偷计划从这些房屋中窃取现金。
 * 由于相邻的房屋装有相互连通的防盗系统，所以小偷 不会窃取相邻的房屋 。
 * 小偷的 窃取能力 定义为他在窃取过程中能从单间房屋中窃取的 最大金额 。
 * 给你一个整数数组 nums 表示每间房屋存放的现金金额。形式上，从左起第 i 间房屋中放有 nums[i] 美元。
 * 另给你一个整数 k ，表示窃贼将会窃取的 最少 房屋数。小偷总能窃取至少 k 间房屋。
 * 返回小偷的 最小 窃取能力。
 * 
 * 示例 1：
 * 输入：nums = [2,3,5,9], k = 2
 * 输出：5
 * 解释：
 * 小偷窃取至少 2 间房屋，共有 3 种方式：
 * - 窃取下标 0 和 2 处的房屋，窃取能力为 max(nums[0], nums[2]) = 5 。
 * - 窃取下标 0 和 3 处的房屋，窃取能力为 max(nums[0], nums[3]) = 9 。
 * - 窃取下标 1 和 3 处的房屋，窃取能力为 max(nums[1], nums[3]) = 9 。
 * 因此，返回 min(5, 9, 9) = 5 。
 * 
 * 示例 2：
 * 输入：nums = [2,7,9,3,1], k = 2
 * 输出：2
 * 解释：共有 7 种窃取方式。窃取能力最小的情况所对应的方式是窃取下标 0 和 4 处的房屋。返回 max(nums[0], nums[4]) = 2 。
 * 
 * 提示：
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^9
 * - 1 <= k <= (nums.length + 1)/2
 */
class Code2560_HouseRobberIV {

    static class Solution {
        public int minCapability(int[] nums, int k) {
            int n = nums.length, l = nums[0], r = nums[0];
            for (int i = 1; i < n; i++) {
                l = Math.min(l, nums[i]);
                r = Math.max(r, nums[i]);
            }
            int m, ans = 0;
            while (l <= r) {
                m = (l + r) / 2;
                if (f(nums, n, m) >= k) {
                    ans = m;
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            return ans;
        }

        public int f(int[] nums, int n, int a) {
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] <= a) {
                    ans++;
                    i++;
                }
            }
            return ans;
        }

        // 动态规划版本
        public static int mostRob1(int[] nums, int n, int ability) {
            if (n == 1) {
                return nums[0] <= ability ? 1 : 0;
            }
            if (n == 2) {
                return (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;
            }
            int[] dp = new int[n];
            dp[0] = nums[0] <= ability ? 1 : 0;
            dp[1] = (nums[0] <= ability || nums[1] <= ability) ? 1 : 0;
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], (nums[i] <= ability ? 1 : 0) + dp[i - 2]);
            }
            return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        // 测试用例
        int[] nums1 = {2, 3, 5, 9};
        int k1 = 2;
        System.out.println("Test Case 1: " + new Solution().minCapability(nums1, k1)); // Output: 5

        int[] nums2 = {2, 7, 9, 3, 1};
        int k2 = 2;
        System.out.println("Test Case 2: " + new Solution().minCapability(nums2, k2)); // Output: 2
    }
}
