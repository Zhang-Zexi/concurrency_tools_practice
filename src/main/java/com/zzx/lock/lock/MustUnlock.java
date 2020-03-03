package com.zzx.lock.lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
/**
 * @ClassName MustUnlock
 * @Description Lock不会像synchronized一样，异常的时候自动释放锁，
 * 所以最佳实践是，finally里面释放锁，以保证发生异常的时候锁一定释放
 * @Author zhangzx
 * @Date 2020/2/11 16:03
 * Version 1.0
 **/
public class MustUnlock {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
       lock.lock();
       try {
           // 获取本锁保护的资源
           System.out.println(Thread.currentThread().getName() + "开始执行任务");
       } finally {
           lock.unlock();
       }
    }
}
