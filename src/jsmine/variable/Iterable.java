package jsmine.variable;

/**
 * Created by imcts on 2017. 3. 12..
 */
public class Iterable {

    public static void main(String [] args) {
        int [] arr = {1, 2, 3, 4, 5};

        //1. 초기값
        //2. 조건문
        //3. 실행 본문
        //4. 증감식
        //5. 조건문
        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
        }

        //1. 자료형
        //2. 변수명
        //3. Iterator될 대상 객체
        for(int v : arr) {
//            System.out.println(v);
        }

        Loof1: for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++) {

                if(j <= 5) {
                    continue;
                }

                if(j == 6) {
                    break Loof1;
                }

                if(j == 7) {
                    break;
                }

                System.out.println(j + " : 의 값");
            }

        }


        boolean dd = true;

        while(dd) {

            if(dd == true) {
                dd = false;
                break;
            }

        }

        //dd == false;

        do {

            //이 구문을 한번 실행해요
            //조건 없이

        } while(dd);

    }

}
