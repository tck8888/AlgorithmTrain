package com.tck.algorithm.luogu;

import java.util.Scanner;

/**
 * https://www.luogu.com.cn/problem/P1085
 *
 * @author tck88
 * @date 2020/2/22
 */
public class P1085 {
//    题目描述
//
//    津津上初中了。
//    妈妈认为津津应该更加用功学习，所以津津除了上学之外，还要参加妈妈为她报名的各科复习班。
//    另外每周妈妈还会送她去学习朗诵、舞蹈和钢琴。
//    但是津津如果一天上课超过八个小时就会不高兴，而且上得越久就会越不高兴。
//    假设津津不会因为其它事不高兴，并且她的不高兴不会持续到第二天。
//    请你帮忙检查一下津津下周的日程安排，看看下周她会不会不高兴；如果会的话，哪天最不高兴。

//    输入格式
//
//    输入包括777行数据，分别表示周一到周日的日程安排。
//    每行包括两个小于101010的非负整数，
//    用空格隔开，分别表示津津在学校上课的时间和妈妈安排她上课的时间。


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            arr[i] = Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]);
        }
        scanner.close();

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index = i;
                break;
            }
        }
        // 周一，周二，周三，周四，周五，周六，周日
        //String[] weeks = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        //System.out.println(weeks[index + 1]);
        System.out.println(index + 1);
    }
}
