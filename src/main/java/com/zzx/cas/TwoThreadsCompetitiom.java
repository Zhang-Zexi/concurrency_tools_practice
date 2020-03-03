package com.zzx.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName TwoThreadsCompetitiom
 * @Description 模拟CAS操作，等价代码
 * @Author zhangzx
 * @Date 2019/12/29 16:53
 * Version 1.0
 **/
public class TwoThreadsCompetitiom implements Runnable{

    private volatile int value;

    public synchronized int compareAndSwap(int expectedValue, int newValue) {
        int oldValue = value;
        if (oldValue == expectedValue) {
            value = newValue;
        }
        return oldValue;
    }

    public static void main(String[] args) throws InterruptedException {
        new AtomicInteger();
        TwoThreadsCompetitiom r = new TwoThreadsCompetitiom();
        r.value = 0;
        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(r.value);
    }

    @Override
    public void run() {
        compareAndSwap(0, 1);
    }
}
