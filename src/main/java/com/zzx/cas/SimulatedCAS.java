package com.zzx.cas;

/**
 * @ClassName SimulatedCAS
 * @Description 模拟CAS操作，等价代码
 * @Author zhangzx
 * @Date 2019/12/29 16:49
 * Version 1.0
 **/
public class SimulatedCAS {

    private volatile int value;
    public synchronized int compareAndSwap(int expectedValue, int newValue) {
        int oldValue = value;
        if (oldValue == expectedValue) {
            value = newValue;
        }
        return oldValue;
    }

}
