package stack;

public class ThreadTest {
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
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest.test(10);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest.test(9);
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
