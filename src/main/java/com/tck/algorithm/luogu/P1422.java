package com.tck.algorithm.luogu;

import java.util.Locale;
import java.util.Scanner;

/**
 * https://www.luogu.com.cn/problem/P1422
 *
 * @author tck88
 * @date 2020/2/22
 */
public class P1422 {
//    题目描述
//
//    夏天到了，各家各户的用电量都增加了许多，相应的电费也交的更多了。
//    小玉家今天收到了一份电费通知单。
//    小玉看到上面写：据闽价电[2006]27号规定，
//    月用电量在150千瓦时及以下部分按每千瓦时0.4463元执行，
//    月用电量在151~400千瓦时的部分按每千瓦时0.4663元执行，
//    月用电量在401千瓦时及以上部分按每千瓦时0.5663元执行;
//    小玉想自己验证一下，电费通知单上应交电费的数目到底是否正确呢。
//    请编写一个程序，已知用电总计，根据电价规定，计算出应交的电费应该是多少。
//    输入格式
//
//    输入一个整数，表示用电总计（单位以千瓦时计），不超过10000。
//    输出格式
//
//    输出一个数，保留到小数点后1位（单位以元计，保留到小数点后1位）。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i < 151) {
            System.out.println(String.format(Locale.CHINA, "%.1f", i * 0.4463));
        } else if (i < 401) {
            double v = (i - 150) * 0.4663 + 150 * 0.4463;
            System.out.println(String.format(Locale.CHINA, "%.1f", v));
        } else {
            double v = (i - 400) * 0.5663 + 250 * 0.4663 + 150 * 0.4463;
            System.out.println(String.format(Locale.CHINA, "%.1f", v));
        }

        scanner.close();

    }
}
