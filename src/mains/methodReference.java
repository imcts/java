package mains;

import lombok.Data;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by imcts on 2016. 12. 10..
 */

class DolenStringUtils {
    private DolenStringUtils() {}

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
}


@Data
class Person {
    private String name;
    private String gender;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void testMethod() {
        System.out.println("요거거덩 !!");
    }

    public static String print(String str) {
        System.out.println(str);
        return str;
    }

    public boolean isMan(Function<String, Boolean> consumer, String str) {
        return consumer.apply(str);
    }
}

public class methodReference {

    public static void main(String[] args) {


      //메소드 참조
        String [] strings = new String [] {
            "6", "5", "4", "3", "2", "1"
        };

        List<String> list = Arrays.asList(strings);

        for(String s : strings)
            System.out.println(s);

        list.forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(strings)
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //TODO method reference
        String [] names = new String [] { "name5", "name4", "name13", "name4", "name5" };

        Person member = new Person();
        Person member1 = new Person("dolen1");
        Person member2 = new Person("dolen2", "man");


        for(int i=0;i<10;i++) {
            Person mem = new Person();
        }

        Function<String, Person> myFunction = Person::new;
        myFunction.apply("dolen");

        BiFunction<String, String, Person> myFunction1 = Person::new;
        Person dolen = myFunction1.apply("dolen", "man");

        //TODO
        //어떻게 코드를 사용할 수 있는가에 대한 연구..

        Runnable test = new Runnable() {
            @Override
            public void run() {
                System.out.println("요거거던");
            }
        };

        Runnable test1 = () -> {
            System.out.println("요거거던");
        };

        test1.run();

        Runnable test2 = new Person()::testMethod;

        test2.run();





        System.out.println();


        LocalDate theDay = IsoChronology.INSTANCE.date(1582, 10, 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");

        System.out.println(theDay.plusYears(30).format(formatter));
        System.out.println(theDay.format(formatter));


    }

}
