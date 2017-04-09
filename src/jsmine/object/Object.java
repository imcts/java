package jsmine.object;

class Snack {
    static String staticValriable; //1. 인스턴스화 된 객체에서 사용할 수 없습니다.
    String wheatFlour;
    String water;
    String egg;
}

public class Object {
    public static void main(String [] args) {
        Snack chitos = new Snack();

        chitos.wheatFlour = "흑표 곰밀가루";
        chitos.water = "삼다수";
        chitos.egg = "세븐일레븐 구운계란";

        chitos.staticValriable = "333";

        System.out.println(chitos.wheatFlour + " : " + chitos.water + " : " + chitos.egg + " : " + Snack.staticValriable);


        Snack homerunBall = new Snack();

        homerunBall.wheatFlour = "홈런볼 밀가루!!";
        homerunBall.water = "삼다수";
        homerunBall.egg = "청정란";

        System.out.println(homerunBall.wheatFlour + " : " + homerunBall.water + " : " + homerunBall.egg + " : " + Snack.staticValriable);
    }
}