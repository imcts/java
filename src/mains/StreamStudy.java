package mains;

import com.sun.deploy.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by imcts on 2016. 12. 22..
 */

@AllArgsConstructor
@Getter
@Setter
class Human {
    private final String name;
    private final Long age;
}

public class StreamStudy {

    public static void main(String[] args) {
        String str = "When one thinks of the labors which the the English have devoted to digging the tunnel under the Thames, the tremendous expenditure of energy involved, and then how a little accident may for a long time obstruct the entire enterprise, one will be able to form a fitting conception of this critical undertaking as a whole.";



        //배열을 사용한 스트림의 생성
        Stream<String> stream = Stream.of(str.split(" "));
        Stream<String> stream1 = Stream.of("a", "b", "c");

        //빈 스트림
        Stream<String> stream3 = Stream.empty();

        //컬렉션에서 생성
        Stream<String> stream4 = Arrays.asList(str.split(" ")).stream();



        Stream<String> stream5 = Pattern.compile(" ").splitAsStream("hello world");


        Integer [] intArr = new Integer [] { 1, 2, 3, 4, 5 };

//        System.out.println(intArr); //1, 2, 3, 4, 5

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5).map(v -> v + 1);

//        System.out.println(intArr); //1, 2, 3, 4, 5

//        intStream.forEach(System.out::println); //2, 3, 4, 5, 6


        Stream<Integer> intStream1 = Stream.of(intArr).filter(v -> v > 3);
//        intStream1.forEach(System.out::println); //4, 5


        str = "hello world";

        Stream<String> stream6 = Pattern.compile("").splitAsStream(str).flatMap(s -> getLetterStream(s));

//        stream6.forEach(System.out::println);


        Stream<String> stream7 = Stream.concat(getLetterStream("Hello".split("")), getLetterStream("World".split("")));
//        stream7.forEach(System.out::println);

        //reduce
        System.out.println(Stream.iterate(1, v -> v + 1).limit(100).reduce(0, (v1, v2) -> v1 + v2).intValue());

        //Array
        int [] integerArr = Stream.iterate(1, v -> v + 1).limit(100).mapToInt(v -> v).toArray();

//        for(Integer i : integerArr)
//            System.out.println(integerArr);

        //List
        List<Integer> list = Stream.iterate(1, v -> v + 1).limit(100).collect(Collectors.toList());

        //Map
        Map<String, Human> humanMap =
                Stream.iterate(0, v -> v + 1)
                .limit(20)
                .map(v -> {
                    StringBuilder name = new StringBuilder("name-");
                    name.append(v);

                    return new Human(name.toString(), Long.parseLong(v.toString()));
                })
                .collect(Collectors.toMap(Human::getName, Function.identity()));

        System.out.println(humanMap);


        str = "aBcD";

        System.out.println(
                Stream.of(str.toCharArray()).map(s -> s.toString()).reduce((a, b) -> new StringBuilder().append(b).append(a).toString())
        );

        List<String> l = Arrays.asList(new String [] {"1", "2"});

        System.out.println(StringUtils.join(l, ","));
    }

    public static <T> Stream<T> getLetterStream(T... t) {
        return Stream.of(t);
    }

}
