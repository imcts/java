package com.company.java8.java.java8.mains;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by imcts on 2016. 12. 18..
 */

class Test {
    public static <T> T test(BiFunction<T, T, T> fnc, T value1, T value2) {
        return fnc.apply(value1, value2);
    }
}

@Data
class PersonTest {
    private String name;

    public PersonTest() {}

    public PersonTest(String name) {
        this.name = name;
    }
}

public class Java8Test {

    public static void main(String[] args) {

        String [] names = new String [] {
            "지은정", "최태산", "신연종", "정수진", "똥새끼"
        };


        List<PersonTest> list =

        Arrays
            .asList(names)
            .stream()
            .map(PersonTest::new)
            .collect(Collectors.toList());


        System.out.println(list);




//        String [] strs = new String [] {
//                "5",
//                "2",
//                "7",
//                "4",
//                "1",
//                "6",
//                "3",
//                "8"
//        };


//        Arrays
//        .asList(strs) //to list
//        .forEach(System.out::println);

//        Arrays.sort(strs, (v1, v2) -> v1.compareToIgnoreCase(v2));
//        Arrays.asList(strs).forEach(System.out::println);




//        Arrays.sort(strs, String::compareToIgnoreCase);
//
//
//        List<String> list = Arrays.asList(strs);
//
//        List<Integer> list1 = list
//            .stream()
//            .map(v -> Integer.parseInt(v) + 1) //mapping 얘는 항상 새로운 stream을 리턴한다.
//            .filter(v -> v >= 5)
//            .collect(Collectors.toList());
//
//
//        System.out.println(list + " : " + list1);







//
//        System.out.println(
//            Test.test((v1, v2) -> v1 + v2, 5, 4)
//        );
//
//        System.out.println(
//            Test.test((v1, v2) -> v1 - v2, 5, 4)
//        );
//
//
//        Function<Integer, Integer> fnc = v -> v + 1;
//        fnc.apply(5);

    }

}
