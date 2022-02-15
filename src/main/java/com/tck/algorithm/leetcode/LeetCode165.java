package com.tck.algorithm.leetcode;

/**
 * https://leetcode-cn.com/problems/compare-version-numbers/
 */
public class LeetCode165 {

    /**
     * 比较版本号
     *
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion(String version1, String version2) {
        if (isEmpty(version1) && isEmpty(version2)) {
            return 0;
        }

        if (!isEmpty(version1) && isEmpty(version2)) {
            return 1;
        }

        if (isEmpty(version1) && !isEmpty(version2)) {
            return -1;
        }
        String[] version1_split = version1.split("\\.");
        String[] version2_split = version2.split("\\.");

        int max_length = Math.max(version1_split.length, version2_split.length);
        int min_length = Math.min(version1_split.length, version2_split.length);
        int version1_total = 0;
        int version2_total = 0;
        for (int i = 0; i < max_length; i++) {
            String version1_index = "";
            String version2_index = "";
            if (i < version1_split.length) {
                version1_index = version1_split[i];
            }
            if (i < version2_split.length) {
                version2_index = version2_split[i];
            }
            int i1 = parseIntOrNull(version1_index);
            int i2 = parseIntOrNull(version2_index);
            if (i1 > i2) {
                return 1;
            } else if (i1 < i2) {
                return -1;
            } else {
                if (i > min_length - 1) {
                    version1_total += i1;
                    version2_total += i2;
                }
            }
        }
        if (version1_total > version2_total) {
            return 1;
        } else if (version1_total < version2_total) {
            return -1;
        }
        return 0;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int parseIntOrNull(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {

        }
        return 0;
    }

    public int compareVersion2(String version1, String version2) {
        if (isEmpty(version1) && isEmpty(version2)) {
            return 0;
        }

        if (!isEmpty(version1) && isEmpty(version2)) {
            return 1;
        }

        if (isEmpty(version1) && !isEmpty(version2)) {
            return -1;
        }
        String[] version1_split = version1.split("\\.");
        String[] version2_split = version2.split("\\.");

        for (int i = 0; i < version1_split.length || i < version2_split.length; ++i) {
            int version1_index = 0;
            int version2_index = 0;
            if (i < version1_split.length) {
                version1_index = Integer.parseInt(version1_split[i]);
            }
            if (i < version2_split.length) {
                version2_index = Integer.parseInt(version2_split[i]);
            }

            if (version1_index > version2_index) {
                return 1;
            }

            if (version1_index < version2_index) {
                return -1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println("比较版本号 方法一");
        System.out.println("期待值:0，实际值:" + new LeetCode165().compareVersion("1.01", "1.001"));//0
        System.out.println("期待值:0，实际值:" + new LeetCode165().compareVersion("1.0", "1.0.0"));//0
        System.out.println("期待值:-1，实际值:" + new LeetCode165().compareVersion("1.0", "1.0.1"));//-1
        System.out.println("期待值:-1，实际值:" + new LeetCode165().compareVersion("0.1", "1.1"));//-1

        System.out.println("比较版本号 方法二");
        System.out.println("期待值:0，实际值:" + new LeetCode165().compareVersion2("1.01", "1.001"));//0
        System.out.println("期待值:0，实际值:" + new LeetCode165().compareVersion2("1.0", "1.0.0"));//0
        System.out.println("期待值:-1，实际值:" + new LeetCode165().compareVersion2("1.0", "1.0.1"));//-1
        System.out.println("期待值:-1，实际值:" + new LeetCode165().compareVersion2("0.1", "1.1"));//-1
    }


}
