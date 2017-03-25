package jsmine.variable;

/**
 * Created by imcts on 2017. 3. 5..
 */

public class Variable {
    public static void main(String [] args) {
        //자료형 변수명; //변수의 선언
        //변수명 = 3;  //변수의 할당

        //primitive
        boolean booleanVariable = true;
        Boolean booleanClass = false;

        //Wapper Class
        char characterVariable = 'A';
        Character charClass;

        byte byteVariable = 127;
        Byte byteClass = -128;

        short shotVariable = 32767;
        Short shortClass = -32768;


        int intVariable = -210000000;
        Integer intClass = 3000;

        long longVariable = 3000;
        Long longClass = 30000000000000000L;

        float floatVariable = 0.0F;
        Float floatClass = 0.55555F;

        double doubleVariable = 0.5D;
        Double doubleClass = 0.5D;

        String stringVariable = "efopwefopwekfqpowkefopwekfopwfkow\n";
        stringVariable += "안녕하세요.\n";
        stringVariable += "반갑습니다.\n";

        System.out.println(stringVariable);
        
        int intValue; //int 형태의 메모리영역 4바이트를 동적할당 하고 그 주소값을 intValue에 할당하였다.
        intValue = 3; //할당: 3이라는 리터럴 상수값을 생성하여 메모리에 올리고 intValue에 대입한다.

        int aa = intValue = 3;
    }

}
