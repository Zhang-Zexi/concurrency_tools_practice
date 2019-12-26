package com.zzx.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ThreadLocalNormalUsage00
 * @Description 10个线程打印日期
 * @Author zhangzx
 * @Date 2019/12/25 20:48
 * Version 1.0
 **/
public class ThreadLocalNormalUsage01 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i ++) {
            final int finalI = i;
            new Thread(new Runnable() {
                public void run() {
                    String date = new ThreadLocalNormalUsage01().date(finalI);
                    System.out.println(date);
                }
            }).start();
            Thread.sleep(100);
        }
    }

    public String date(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }
}
