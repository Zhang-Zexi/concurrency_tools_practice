package demo;

/**
 * 栈封闭
 *
 * 栈封闭简单理解就是通过局部变量来实现线程封闭，多个线程访问对象的同一个方法，
 * 方法内部的局部变量会拷贝到每个线程的线程栈当中，只有当前线程才能访问到，互不干扰。所以局部变量是不被多个线程所共享的。
 */
public class StackTest {
    private int num;

    public void test(int key) {
        int flag = 0;
        for (int i = 0; i < key; i++) {
            flag = flag + 1;
            num = num + 1;
        }
        System.out.println(Thread.currentThread().getName() + " num=" + num);
        System.out.println(Thread.currentThread().getName() + " flag=" + flag);
    }

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stackTest.test(10);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stackTest.test(9);
            }
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }

}
