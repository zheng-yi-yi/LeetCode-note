package com.zyy;

import java.util.Arrays;

/**
 * 79. 单词搜索
 * 
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。
 * 如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * 
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母不允许被重复使用。
 * 
 * 示例 1：
 * 输入：board = [["A","B","C","E"],
 * 				["S","F","C","S"],
 * 				["A","D","E","E"]],
 * 	   word = "ABCCED"
 * 输出：true
 * 
 * 示例 2：
 * 输入：board = [["A","B","C","E"],
 * 				["S","F","C","S"],
 * 				["A","D","E","E"]], 
 * 	   word = "SEE"
 * 输出：true
 * 
 * 示例 3：
 * 输入：board = [["A","B","C","E"],
 * 				["S","F","C","S"],
 * 				["A","D","E","E"]], 
 * 	   word = "ABCB"
 * 输出：false
 * 
 * 提示：
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board 和 word 仅由大小写英文字母组成
 */
public class Code0079_WordSearch {

    /**
     * 判断单词是否存在于二维字符网格中
     * 
     * @param board 二维字符网格
     * @param word  待搜索的单词
     * @return      若单词存在于网格中返回 true，否则返回 false
     */
    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int index, int row, int col, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row == board.length || col < 0 || col == board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        boolean result = dfs(board, word, index + 1, row - 1, col, visited)
                      || dfs(board, word, index + 1, row + 1, col, visited)
                      || dfs(board, word, index + 1, row, col - 1, visited)
                      || dfs(board, word, index + 1, row, col + 1, visited);
        visited[row][col] = false;
        return result;
    }

    public static void main(String[] args) {
        // 测试用例1
        char[][] board1 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word1 = "ABCCED";
        System.out.println("输入: board = " + Arrays.deepToString(board1) + ", word = \"" + word1 + "\"");
        System.out.println("输出: " + exist(board1, word1));

        // 测试用例2
        char[][] board2 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word2 = "SEE";
        System.out.println("输入: board = " + Arrays.deepToString(board2) + ", word = \"" + word2 + "\"");
        System.out.println("输出: " + exist(board2, word2));

        // 测试用例3
        char[][] board3 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word3 = "ABCB";
        System.out.println("输入: board = " + Arrays.deepToString(board3) + ", word = \"" + word3 + "\"");
        System.out.println("输出: " + exist(board3, word3));
    }
}
