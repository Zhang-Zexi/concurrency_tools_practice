package immutable;

/**
 * 描述：不可变的对象，演示其他类无法修改这个对象，public也不行
 */
public class Person {

    // 所有属性都不可变
    // 具有不可变性的对象一定是线程安全的，我们不需要对其采取任何额外的安全措施，也能保证线程安全
    final int age = 18;
    final String name = "Aqumon";
    // String alice = new String("Alice");

    // 3.
    String bag = "computer";

    // 如果有一个属性是可变的，就不能说明这个对象是不可变的
    // int score = 100;

//    final String name = alice;
    final TestFinal testFinal = new TestFinal();

    public static void main(String[] args) {
//        Person person = new Person();
//        person.alice = "44";
//        System.out.println(person.name);
    }
}

