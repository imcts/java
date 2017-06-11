package jsmine.lang;

/**
 * Created by imcts on 2017. 6. 4..
 */

class T extends Object {
    String t;
}

public class TestLang {
    public static void main(String[] args) {
        String str  = ""; //상수
        String str1 = "안녕하세요."; //메모리에 안녕하세요라는 상수변수를 선언하고 그 값을 저장
        String str2 = "dkdkdks";

        StringBuffer sb = new StringBuffer();
        sb.append("33");
        sb.append("33");

        StringBuilder sbl = new StringBuilder();
        sbl.append("3");
        sbl.append(2);
        sbl.append("4");
        sbl.append("5");
        sbl.append("6");

        System.out.println(sb);


        int a; //0
        Integer wa; //null

        byte b; //0
        Byte wb; //null

        char c; //0
        Character wc; //null

        double d; //0d
        Double wd; //null

        float f; //0f
        Float wf; //null

        boolean bool; //false
        Boolean wbool; //자동으로 원시타입을 래퍼 클래스 타입으로 변환해주는 오토 박싱 기능

        long l; //0L
        Long wl; //null

        String ws; //null


        System.out.println(
                System.identityHashCode(str)
        );

        System.out.println(
                System.identityHashCode(str1)
        );

        System.out.println(
                str2.toString()
        );
    }
}
