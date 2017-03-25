package daehacro;

/**
 * Created by imcts on 2016. 9. 7..
 */


class InterThread implements Runnable {

    @Override
    public void run() {
        while(true) {

            try {
                Thread.sleep(500);
                System.out.println("runnable thread");
            } catch(Exception e) {

            }

        }
    }
}

class TestThread extends Thread {
    public String name;

    public TestThread() {

    }

    public TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {


        while(true) {

            try {
                Thread.sleep(500);
                System.out.println(name + " : thread");
            } catch(Exception e) {

            }


            if(ThreadTest.isStop && this.name.equals("normal")) {
                System.out.println(this.name + " : thread break!");
                break;
            }

        }

        System.out.println(this.name + " thread exit !");

    }
}

public class ThreadTest {

    public static boolean isStop = false;

    public static void main(String[] args) throws Exception {

        System.out.println("메인 시작");

        TestThread n = new TestThread("normal");

        TestThread t = new TestThread("demon");
        t.setDaemon(true);
        t.start();

        TestThread n2 = new TestThread("normal2");

        System.out.println("메인 종료");

        new Runnable() {
            @Override
            public void run() {

            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        isStop = true;
    }
}
