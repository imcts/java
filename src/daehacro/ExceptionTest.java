package daehacro;

/**
 * Created by imcts on 2017. 3. 8..
 */

class ExceptionB {

    public void close(){
        System.out.println("B 닫힌다 >ㅆ <");
    }
}

class ExceptionA implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("A 닫힌다 >ㅆ <");
    }
}


public class ExceptionTest {


    public static void main(String[] args) {
        ExceptionB b1 = null;

        try {
            b1 = new ExceptionB();

        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            if(b1 != null)
                b1.close();
        }


        try{
            // 1. ArrayIndexOUtOfBoundsException 발생
            // 2. NumberFormatException 발생
            // 3. 다른 Exception 발생
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e ){
            // 예외 처리1, 예외 처리2
        }catch(Exception e){
            // 예외 처리3
        }finally{
            // 항상 실행되야하는 내용
        }


        try (
                ExceptionA a = new ExceptionA();
                ExceptionA b = new ExceptionA();
        ) {

            use(a);
            use(b);

        } catch(Exception e) { //finally에서 무조건 close 해주지 않아도 AutoAutoCloseable 를 구현하고 있다면 자동으로 close 호출 자바 7이상
            e.printStackTrace();
        }

        if(true)
            throw new RuntimeException("런타임시 에러 !"); //컴파일러가 체크 안함
    }

    public static void use(ExceptionA a) {

    }
}
