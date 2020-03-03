package com.zzx.lock.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName PessimismOptimismLock
 * @Description
 * @Author zhangzx
 * @Date 2020/2/12 12:19
 * Version 1.0
 **/
public class PessimismOptimismLock {

    int a;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
    public synchronized void testMethod() {
        a ++;
    }

}
