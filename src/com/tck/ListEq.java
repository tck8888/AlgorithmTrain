package com.tck;

import java.util.ArrayList;
import java.util.List;

/**
 * description:比较两个list是否相等</br>
 * created on: 2019/6/3 10:02</br>
 *
 * @author tck
 * @version 1.0
 */
public class ListEq {

    String url;

    public ListEq(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListEq) {
            ListEq obj1 = (ListEq) obj;
            return obj1.url.equals(url);
        }
        return super.equals(obj);
    }


    public static boolean listEq(List<ListEq> list, List<ListEq> list2) {

        if (list == null && list2 == null) {
            return true;
        }

        if (list != null && list2 != null) {
            if (list.size() == list2.size()){
                return list.containsAll(list2);
            }else {
                return false;
            }
        }
        return false;

    }

    public static boolean isNotEmpty(List list) {
        return list != null && !list.isEmpty();
    }

    public static void main(String[] args) {


        List<ListEq> list1 = new ArrayList<>();
        List<ListEq> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new ListEq("hhh"));
        }
        for (int i = 0; i < 9; i++) {
            list2.add(new ListEq("hhh"));
        }


        System.out.println(listEq(list1, list2));
    }

}
