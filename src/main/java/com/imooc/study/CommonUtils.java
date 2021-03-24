package com.imooc.study;


//设定几位数 差的位数补齐
public class CommonUtils {
    public static String fillZeroBeforeString(String str , int length) {
        return fillStringBeforeString(str, "0", length);
    }

    public static String fillStringBeforeString(String str ,String fill, int length) {
        if (str.length() < length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length - str.length(); i++) {
                sb.append(fill);
            }
            sb.append(str);
            return sb.toString();
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        int max=10;
        String waterCode= CommonUtils.fillZeroBeforeString(String.valueOf(max),13);
        System.out.println(waterCode);
    }

}
