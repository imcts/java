package mains;

import java.util.Comparator;

/**
 * Created by imcts on 2016. 12. 10..
 */

@FunctionalInterface
interface myFunction<T> {
    public T excute(T a, T b);
}

class TestClass {
    public static <T> T operator(myFunction<T> func, T a, T b) {
        return func.excute(a, b);
    }
}

public class lambdaMain {

    public static void main(String[] args) {

        Comparator<Integer> compare = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        System.out.println(
                compare.compare(1, 2)
        );



        //1. 반드시 인터페이스가 구현해야하는 메소드가 1개 여야만한다.
        //2. 해당 메소드를 구현하는 것을 람다 표현식으로 대체할 수 있다.
        Comparator<Integer> compare2 = (o1, o2) -> o1 - o2;


        int age = 30;

        Comparable<Integer> comparable = o1 -> age - o1;


        System.out.println(
                compare2.compare(1, 2)
        );


        System.out.println(
                comparable.compareTo(10)
        );



        myFunction<Integer> sum = (a, b) -> a + b;

        System.out.println(
            sum.excute(1, 5)
        );


        Runnable thread = () -> System.out.println("start");
        thread.run();

        new Thread(
            () -> System.out.println("start")
        ).start();


        System.out.println(
            TestClass.operator((a, b) -> a + b, 5, 3) //8
        );
    }
}
