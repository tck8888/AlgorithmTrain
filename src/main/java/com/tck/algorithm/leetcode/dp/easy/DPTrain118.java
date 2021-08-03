package com.tck.algorithm.leetcode.dp.easy;

import java.util.ArrayList;
import java.util.List;

public class DPTrain118 {

    /**
     * 杨辉三角
     *
     * @param numRows 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }else {
                    row.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new DPTrain118().generate(5));
        System.out.println(new DPTrain118().generate(1));
    }
}
