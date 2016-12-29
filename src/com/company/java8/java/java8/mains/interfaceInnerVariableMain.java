package com.company.java8.java.java8.mains;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by imcts on 2016. 12. 10..
 */

interface Java7Interface {
    public void method();
}

interface InterfaceInnerVariable {
    int AGE2 = 28; //인터페이스에서 변수는 기본적으로 public static final이다.
    public static final int AGE = 30; //즉 이렇게 선언하는 것이 위와 동일하다.

    void getName(); //자바8 이전 버전에서는 추상메서드만 지원하였다. 인터페이스 내부에 메서드의 본문을 구현할 수 없었다.

    default int getCount(int value) {
        return InterfaceInnerVariable.AGE + value;
    }

    default int getCount1(int value) {
        return InterfaceInnerVariable.AGE + value;
    }

    static String getNames() {
        return "Hello My Name is Dolen.";
    }
}


interface CommonStaticMethod {
    default int getCount(int value) {
        return 20 + value;
    }

    default int getCount1(long value) {
        return (int)(20 + value);
    }


    static <T> Result<T> success(T data) {
        return new Result<T>().setResult(data);
    }
}

@Data
@Accessors(chain = true)
class Result<T> {
    private T result;

    public static <T> Result<T> success(T data) {
        return new Result<T>().setResult(data);
    }
}

class Extends implements InterfaceInnerVariable, CommonStaticMethod {
    @Override
    public void getName() {
        //method body 구현
    }

    @Override
    public int getCount(int value) {
        //메소드를 오버라이드하여 재정의 하거나, 하나의 인터페이스 메소드를 선택해 주어야 합니다 !
        return CommonStaticMethod.super.getCount(value);
    }
}

public class interfaceInnerVariableMain {

    public static void main(String[] args) {

        System.out.println(InterfaceInnerVariable.AGE); //30

        System.out.printf(InterfaceInnerVariable.getNames()); //안녕하세요 제 이름은 최태산입니다.

        CommonStaticMethod.success(new String()); //static 메소드를 인터페이스로 뺄 수 있다.

        Result.success(""); //이런식으로 줄일 수 있다.

        Extends e = new Extends();
        System.out.println(e.getCount(3)); //인터페이스의 default 메소드를 다중 상속받았을때에는 중복되는 메소듭명이 존재할시에 반드시 오버라이드 해야만 한다.
    }

}
