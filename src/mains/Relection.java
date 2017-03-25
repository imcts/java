package mains;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by imcts on 2017. 1. 14..
 */

class A {
    private String name;
    private String gender;

    public A() {}

    public A(String name) {
        this.name = name;
    }

    public A(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void testMethod() {
        System.out.println("The Test Method");
    }

    public static String print(String str) {
        System.out.println(str);
        return str;
    }
}

public class Relection {

    public static void main(String[] args) throws Throwable{

        //class 정보를 가져옵니다.
        Class cls = A.class;


        //생성자의 정보를 확인합니다.
        for(Constructor constructor : cls.getDeclaredConstructors()) {

            System.out.println(constructor.getName() + " : constructor name");

            for(Parameter param : constructor.getParameters())
                System.out.println(param + " : param");

            for(Class type: constructor.getParameterTypes())
                System.out.println(type + " : type");
        }


        System.out.println("------------------------------------------------------");


        //선언된 필드를 확인 합니다.
        for(Field field : cls.getDeclaredFields()) {
            System.out.println(field.getName() + " : name");
            System.out.println(field.getType() + " : type");
            System.out.println(field.getDeclaringClass() + " : class");
        }


        System.out.println("------------------------------------------------------");

        //method를 실행 합니다.
        for(Method method : cls.getMethods()) {
            System.out.println(method.getName() + " : name");

            if(method.getName().equals("print")) {
                method.invoke(cls.newInstance(), "print to the " + method.getName());
            }
        }


        System.out.println();
        System.out.println();
        System.out.println();


        List<String> strList = Arrays.asList(new String [] {"a", "b", "c"});

        List<String> strList2 = strList.stream().map(s -> s + "1").collect(Collectors.toList());


        System.out.println(strList);
        System.out.println(strList2);
    }
}
