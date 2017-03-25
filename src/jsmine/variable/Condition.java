package jsmine.variable;

/**
 * Created by imcts on 2017. 3. 12..
 */
public class Condition {

    public static void main(String [] args) {

        boolean isTrue = true;

        if(isTrue) {
            System.out.println();
        } else if(true) {
            System.out.println();
        } else {
            System.out.println();
        }


        String key = "b";

        switch(key) {
        case "a":
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        break;

        case "b":
            System.out.println();
            System.out.println();
            System.out.println();

        break;
        default: break;
        }
    }
}
