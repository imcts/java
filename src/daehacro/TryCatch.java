package daehacro;

/**
 * Created by imcts on 2016. 9. 7..
 */



class TryTest {

    public void test2() throws Exception {
        System.out.println("에러나기 전");

        int i = 3 / 0;


        System.out.println("에러나고 난 후");







    }

    public void test() {

        try {
            //contents

            int i = 3 / 0;

        } catch(Exception e) {
            System.out.println("에러를 처리 합니다.");
            //e.printStackTrace();
        } finally {
            // always.
            System.out.println("여기는 항상 실행되는거야 !ㄴ");
        }
    }

}



public class TryCatch {
    static int a;

    static {
        a = 3;
    }

    public static void main(String[] args) throws Throwable {



        new TryTest().test2();



        System.out.println("메인 메소드를 종료 합니다.");
    }
}
