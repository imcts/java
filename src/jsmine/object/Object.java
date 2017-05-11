package jsmine.object;

class Optional {
    public static final String VERSION = "1.0.0";
}

class Initialize {
    public static String INITIAL_STATE;

    static {
        System.out.println("나는 언제 실행될까??");

        if(Optional.VERSION.equals("1.0.0")) {
            INITIAL_STATE = "1.0.0";
        } else {
            INITIAL_STATE = null;
        }
    }

    public String a = "initial";
    {
        //do something

        a = "이렇게도 초기화가 가능합니다.";

        //do something

        System.out.println("inner setting");
    }

    public Initialize() {

        //do something

        System.out.println("constructor");
    }

    public Initialize(String a) {
        this.a = a;
    }
}

public class Object {
    public static String a;

    public void test() {}

    public static void main(String [] args) {

        Initialize init = new Initialize();

        System.out.println(init.a);


        Snack chitos = new Snack("흑표 곰밀가루", "삼다수", "세븐일레븐 구운계란");
        Snack homerunBall = new Snack("홈런볼 밀가루!!", "삼다수", "청정란", "홈런볼초코");

        Snack.print(chitos);
        Snack.print(homerunBall);

        System.out.println(homerunBall.getWheatFlour() + " : 최종본");



    }
}