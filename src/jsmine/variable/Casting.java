package jsmine.variable;

/**
 * Created by imcts on 2017. 3. 12..
 */
public class Casting {
    public static void main(String [] args) {

        int a = 128; //4byte. //-2148... ~ 214783.. //4바이트공간에 128 값

        byte b = 127; //1byte. -128 ~ 0 ~ 127 256가지 경우의 수를 표시할 수 있는데
        //1byte = 8bit
        // 1bit = 00000000 <--- 256 2

        //b <-- a

        b = (byte) a;

        System.out.println(b);

        int kor = 91;
        int cnt = 3;

        float avg = (float) kor / cnt; //정수와 정수 ->

        float f = 3 / 0F;

        System.out.println(f);

        System.out.println(avg);
    }
}