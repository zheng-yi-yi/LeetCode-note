# 77. 组合

给定两个整数 `n` 和 `k`，返回范围 `[1, n]` 中所有可能的 `k` 个数的组合。

你可以按 **任何顺序** 返回答案。

**示例 1：**

```
输入：n = 4, k = 2
输出：
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
```

**示例 2：**

```
输入：n = 1, k = 1
输出：[[1]]
```

**提示：**

- `1 <= n <= 20`
- `1 <= k <= n`

# 解题

我们用回溯算法解题。

> 回溯算法，其实就是指在递归搜索中，先试探再收回，继续向其他方向试探，这样才能找到所有方案

在这道题中，我们需要找出从1到n中选择k个数的所有组合。

回溯法是一种递归搜索的方法，其中，我们逐步构建答案，并适当回退，以找到所有可能的解。

具体思路如下：

1. 首先，我们定义一个`List<List<Integer>>`类型的结果列表，用于存储最终的组合结果。
2. 创建一个递归函数，该函数接受以下参数：
   - 当前正在生成组合的起始数字 `start`
   - 一个存储当前组合的列表 `currentCombination`
   - 剩余需要选择的数字个数 `remaining`
3. 在递归函数中，首先判断如果 `remaining` 为0，说明已经选够了 `k` 个数字，将 `currentCombination` 添加到结果列表中，并返回。
4. 否则，从 `start` 到 `n` 遍历，每次选择一个数字，将其添加到 `currentCombination` 中，并递归调用函数，`start` 更新为当前数字+1，`remaining` 减1，继续生成组合。
5. 在递归完成后，要记得回溯，即从 `currentCombination` 中移除最后一个添加的数字，以便尝试其他可能的组合。

```java
class Solution {
    private int n;
    private List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(1, k, currentCombination);
        return result;
    }

    private void backtrack(int start, int remaining, List<Integer> currentCombination) {
        if (remaining == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            backtrack(i + 1, remaining - 1, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
```

