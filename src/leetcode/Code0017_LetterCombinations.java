package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按任意顺序返回。
 * 
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 
 * 2: abc
 * 3: def
 * 4: ghi
 * 5: jkl
 * 6: mno
 * 7: pqrs
 * 8: tuv
 * 9: wxyz
 * 
 * 示例 1：
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 
 * 示例 2：
 * 输入：digits = ""
 * 输出：[]
 * 
 * 示例 3：
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * 
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
public class Code0017_LetterCombinations {

    String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    List<String> ans = new ArrayList<>();

    /**
     * 返回所有数字字符串能表示的字母组合
     * 
     * @param digits 包含数字 2-9 的字符串
     * @return 所有可能的字母组合列表
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return ans;
        backtrack(digits, 0, new StringBuilder());
        return ans;
    }

    private void backtrack(String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            ans.add(path.toString());
            return;
        }

        String currentString = map[digits.charAt(index) - '0'];
        for (int i = 0; i < currentString.length(); i++) {
            path.append(currentString.charAt(i));
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        // 测试用例1
        String digits1 = "23";
        System.out.println("输入: digits = \"" + digits1 + "\"");
        Code0017_LetterCombinations solution1 = new Code0017_LetterCombinations();
        System.out.println("输出: " + solution1.letterCombinations(digits1));

        // 测试用例2
        String digits2 = "";
        System.out.println("输入: digits = \"" + digits2 + "\"");
        Code0017_LetterCombinations solution2 = new Code0017_LetterCombinations();
        System.out.println("输出: " + solution2.letterCombinations(digits2));

        // 测试用例3
        String digits3 = "2";
        System.out.println("输入: digits = \"" + digits3 + "\"");
        Code0017_LetterCombinations solution3 = new Code0017_LetterCombinations();
        System.out.println("输出: " + solution3.letterCombinations(digits3));
    }
}
