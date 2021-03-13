package demo;

/**
 * final在修饰对象时，仅仅是引用地址不可变，对象本身的内容还是可以变化的，也就是说加了final并不代表就一定不可变
 */
public class TestFinal {

    static final int[] arr = {1, 2, 3, 4, 5};

    static int[] arr2 = {2,3,4,5,6};

    public static void main(String[] args) {
        //Cannot assign a value to final variable 'arr'
        //TestFinal.arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
    }
}
