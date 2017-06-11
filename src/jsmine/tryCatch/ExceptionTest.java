package jsmine.tryCatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by imcts on 2017. 5. 21..
 */

interface ConnectionMaker {
    Connection getConnect() throws SQLException;
}

class Test implements ConnectionMaker, AutoCloseable {
    @Override
    public Connection getConnect() throws SQLException {




        return DriverManager.getConnection(""); //14 층 황과장
    }

    @Override
    public void close() throws Exception {
        System.out.println("나 닫힌다앙 !!");
    }
}

public class ExceptionTest {
    public static Test getTest() {
        Test test1 = null;

        try (Test test = new Test()) {

            System.out.println("try 부분의 시작입니다");

            System.out.println(3 / 1); //Integer / 0 <---

            return test;
        } catch(Exception e) {
            System.out.println("수학적 에러가 발생되었을때 처리되는 catch");
            e.printStackTrace();
        } finally {
            System.out.println("파이나리!");
        }

        System.out.println("메소드가 종료 되었을때 !!");
        return test1;
    }

    public static void throwTest() throws SQLException, ArithmeticException {

        int a = 3 / 0;

        //에러를 발생시켜서 던진다
        throw new SQLException("아이디 또는 비밀번호를 잘못 입력하셨습니다.");

        //1. 이 자체를 try catch로 묶던가.
        //2. 메소드에서 처리하지 않고 메소드를 호출한 녀석에게 익셉션을 전달한다.
    }

    public static void main(String[] args) throws Exception {

        Test t = new Test();
        System.out.println("메인메소드 실행");

        t.getConnect();

        System.out.println("에러가 발생!");

    }

}
