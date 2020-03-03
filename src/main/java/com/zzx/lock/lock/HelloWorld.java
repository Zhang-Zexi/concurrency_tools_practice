package com.zzx.lock.lock;

import java.util.Random;

/**
 * @ClassName HelloWorld
 * @Description
 * @Author zhangzx
 * @Date 2020/2/12 17:27
 * Version 1.0
 **/
public class HelloWorld {
    public static void main(String []args) {
//        System.out.println(formatStr("000513", 3));
////        System.out.println(1);
//        System.out.println(new StringBuffer(3));
//        StringBuffer s = new StringBuffer(3);
//        for (int j =0; j < 3; j++) {
//            s.append("0");
//        }
//        s.append("000513".trim());
//        System.out.println(s);
        System.out.println(Math.random());
        System.out.println(Math.random() * 10000);
        Long duration = (long)Math.random() * 10000;
        System.out.println(duration / 1000);

        int d = new Random().nextInt(10) + 1;
        System.out.println(d);
    }

//    private static String formatStr(String str, int i) {
//        StringBuffer sb = new StringBuffer(i);
//        for (int j =0; j < i; j++) {
//            sb.append("0");
//        }
//        if (str != null) {
//            return sb.append(str.trim()).substring(sb.length() - i, sb.length());
//        } else {
//            return sb.toString();
//        }
//    }
}
