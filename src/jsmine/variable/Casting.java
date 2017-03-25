package jsmine.variable;

/**
 * Created by imcts on 2017. 3. 12..
 */
public class Casting {
    public static void main(String [] args) {

        int a = 20000;

        byte b = 5;

        b = (byte) a;

        System.out.println(b); //32

        a = b;

        System.out.println(a);

        float f = 0.1F;

        a = (int) f;

        f = a;

        System.out.println(a);
    }
}