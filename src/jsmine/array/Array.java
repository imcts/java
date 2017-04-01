package jsmine.array;

/**
 * Created by imcts on 2017. 3. 26..
 */
public class Array {

    public static void main(String [] args) {
        int score1 = 0,
            score2 = 0,
            score3 = 0;

        int [] scores; //선언

        scores = new int[3];

        scores[0] = 50;
        scores[1] = 70;
        scores[2] = 90;

        System.out.println(scores + " : I@1d44bcfa // JVM 이 알고 있는 주소값이다 ");

        int [] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] brr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] crr = new int[11];
        crr[0] = 0;
        ///...... 주 소 값;;

        char [] charArr;
        short [] shortArr;
        float [] floatArr;
        double [] doubleArr;
        boolean [] booleanArr;
        String [] stringArr;
        Character [] charactersArr;
        Short [] shortsArr;
        Float [] floatsArr;
        Double [] doublesArr;
        Array [] thisArr;

        charArr = new char[5];
        floatArr = new float[5];

        floatArr[0] = 2F;

        stringArr = new String[] {
                "a",
                "b",
                "c",
                "d",
                "e"
        };

        for(int i = 0; i < stringArr.length; i++) {
            System.out.println(
                    stringArr[i]
            );
        }

        //(자료형 변수명 : iterator 를 구현하고 있거나, 상속받은 객체가 들어와야 합니다.)
        for(String str : stringArr) {
            System.out.println(str + " : str");
        }

        System.out.println(arr.length + " : length");

        int [][] twoArr1 = new int[3][5];

        int [][] twoArr2 = new int[3][]; //가변배열

        twoArr2[0] = new int[5];
        twoArr2[1] = new int[10];
        twoArr2[2] = new int[11];
    }
}
