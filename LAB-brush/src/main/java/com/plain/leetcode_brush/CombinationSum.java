package com.plain.leetcode_brush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@author:feng
*@date: 2022/3/23
*@description: Leetcode 39
**/
public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        // 定义最终的结果集
        List<List<Integer>> resultList = new ArrayList<>();
        // 定义保存过程中的结果集
        List<Integer> result = new ArrayList<>();
        // 数据进行排序，1）需要按照顺序进行减 2）保证生成回溯树的时候不会生成重复的元素
        Arrays.sort(candidates);

        // 调用递归的回溯函数
        dfs(candidates, resultList, result, 0, target);
        return resultList;
    }

    /**
     * 回溯函数
     * @param candidates
     * @param resultList
     * @param result
     * @param start
     * @param target
     */
    private static void dfs(int[] candidates, List<List<Integer>> resultList, List<Integer> result, int start, int target) {

        // 不符合条件的
        if (target < 0) {
            return;
        }
        // 符合条件的加入
        else if (target == 0) {
            resultList.add(new ArrayList<>(result));
        } else {
            for (int i = start; i < candidates.length; i++) {
                result.add(candidates[i]);
                // 下面就开始递归了
                // [key] 因为元素可以重复使用，这里递归传递下去的 i 而不是 i+1
                dfs(candidates, resultList, result, i, target - candidates[i]);
                // 回溯，和前面是对称的
                result.remove(result.size() - 1);
            }
        }
    }
}
/**
 回溯关键就在
 result.remove(result.size() - 1);

 相当于从树的左下角开始往回算
 **/
