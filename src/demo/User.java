package demo;

public class User {
    //使用final修饰变量
    final int age = 20;

    public static void main(String[] args) {
        User user = new User();
        //Cannot assign a value to final variable 'age'
//        user.age = 3;
    }
}

