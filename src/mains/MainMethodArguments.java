package mains;

import java.util.stream.Stream;

/**
 * Created by imcts on 2017. 2. 19..
 */
public class MainMethodArguments {

    public static void main(String[] args) {
        Stream.of(args).forEach(System.out::println);

        System.out.println(5);

        System.out.println(4);

        System.out.println(3);
    }

}
