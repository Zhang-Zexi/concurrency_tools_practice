package immutable;

/**
 * 描述：     测试final能否被修改
 */
public class TestFinal {

    String test;

    public static void main(String[] args) {
        // 1.不可变对象无法修改
//        Person person = new Person();
//        person.age = 11;
//        person.name = "zhangzx";

        // 2.不可变对象的值是可以读取的
//        Person person = new Person();
//        int age = person.age;
//        String name = person.name;

        // 3.final修饰的变量，引用不可变，但是值可变
//        final Person person = new Person();
//        person.bag = "book";

        // 4.证明所有属性都声明final也不能保证不可变
        final Person person = new Person();
        person.testFinal.test = "13g";
        System.out.println(person.testFinal.test);
        person.testFinal.test = "15g";
        System.out.println(person.testFinal.test);

//        String abc = "abc";
//        System.out.println(abc.substring(1, 2));
//        System.out.println(abc);
//        person.bag = "book";
//        person = new Person();
//        int age = person.age;
//        String name = person.name;

    }
}
