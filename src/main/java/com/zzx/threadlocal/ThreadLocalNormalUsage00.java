package com.zzx.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName ThreadLocalNormalUsage00
 * @Description 两个线程打印日期
 * @Author zhangzx
 * @Date 2019/12/25 20:48
 * Version 1.0
 **/
public class ThreadLocalNormalUsage00 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                String date = new ThreadLocalNormalUsage00().date(10);
                System.out.println(date);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
//                String date = new ThreadLocalNormalUsage00().date(1007);
                String date = new ThreadLocalNormalUsage00().date(104707);
                System.out.println(date);
            }
        }).start();
    }

    public String date(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }
}
