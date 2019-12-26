package com.zzx.threadlocal;

/**
 * @ClassName ThreadLocalNormalUsage06
 * @Description 演示ThreadLocal用法2：避免传递参数的麻烦
 * @Author zhangzx
 * @Date 2019/12/26 20:18
 * Version 1.0
 **/
public class ThreadLocalNormalUsage06 {

    public static void main(String[] args) {
//        Thread
        new Service1().process();
    }

}

class Service1 {
    public void process() {
        User user = new User("鹏哥");
        UserContextHolder.holder.set(user);
        new Service2().process();
    }
}

class Service2 {
    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println("Service2拿到用户名" + user.name);
        new Service3().process();
    }
}

class Service3 {
    public void process() {
        User user = UserContextHolder.holder.get();
        // 一个线程可以用到多个ThreadLocal
//        ThreadSafeFormatter.dateFormatThreadLocal.get();
        System.out.println("Service3拿到用户名" + user.name);
    }
}



class UserContextHolder {
    public static ThreadLocal<User> holder = new ThreadLocal<>();
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}
