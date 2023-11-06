public class C0003_lengthOfLongestSubstring {

    public static void main(String[] args) {
        // 编写测试代码：
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0; // 如果字符串为空，最长子串长度为0
        }

        int[] charIndex = new int[1024]; // 用于存储字符在字符串中的最后一个出现的位置
        int maxLength = 0; // 用于记录最长子串的长度
        int left = 0; // 左边界指针

        for (int right = 0; right <= n-1; right++) {
            char currentChar = s.charAt(right); // 当前循环中遍历到的字符（基础）

            // 如果当前字符已经在窗口中出现过，更新左边界为上次出现位置的下一个位置（核心）
            if (charIndex[currentChar] > left) {
                left = charIndex[currentChar];
            }

            // 更新字符的最后一个出现位置（关键）
            charIndex[currentChar] = right + 1;

            // 计算当前窗口的长度
            int currentLength = right - left + 1;  // （目的）

            // 更新最大子串长度
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

}
