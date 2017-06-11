package jsmine.inner;


import javax.inject.Inject;

/**
 * Created by imcts on 2017. 6. 4..
 */

class InnerTest2 {
    private InnerTest3 innerTest3;

    public InnerTest2() {
        this.innerTest3 = new InnerTest3();
    }

    public static class InnerTest3 {
        private String name;
        private String 좌심실1;
        private String 우심방2;

        public InnerTest3() {
        }

        public InnerTest3(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public InnerTest3 setName(String name) {
            this.name = name;
            return this;
        }
    }
}

class InnerTest4 {
    private String a;

    public InnerTest4() {
        System.out.println("나는 생성자야");
    }

    public void innerTest4() {
        System.out.println("나는 테스트4야");
    }
}

interface InnerInterface {
    void test2();
}


class Testt3 {
    String a = "dd";

    @Override
    public String toString() {
        return "Testt3{" +
                "a='" + a + '\'' +
                '}';
    }
}

class Ttest {

    @Inject
    Testt3 tst3;

    public Ttest() {
        System.out.println(tst3.toString());
    }


}

public class InnerTest {
    public static void main(String[] args) {
        InnerInterface in = new InnerInterface() {
            @Override
            public void test2() {
                System.out.println("나는 새로운 익명클래스야");
            }
        };

        new Ttest();
    }
}
