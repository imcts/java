package jsmine.object;

/**
 * Created by imcts on 2017. 4. 9..
 */
//public
//protected
//private
//default

public class Snack {//클래스의 선언

    public static String foodType = "과자"; //스태틱 변수의 선언

    static {
        //스태틱영역 변수의 초기화
    }

    private String wheatFlour; //일반 인스턴스 변수의 선언
    private String water;      //일반 인스턴스 변수는 클래스가 new로 인스턴스화 될때 메모리에 정의된다. 매번 매번
    private String egg = "구운계란";

    { //이렇게 해놓으면 일반 인스턴스 변수를 초기화할 수 있다.
        egg = "구운계란";
    }

    private String choco;
    protected String testProtected = "프로텍티드!";

    //1. 생성자 메소드는 반환자료형을 갖지 않는다.
    //2. 생성자 메소드는 메소드명이 반드시 클래스명과 같다.
    public Snack() {}

    public Snack(String wheatFlour, String water, String egg) {
        this.wheatFlour = wheatFlour;
        this.water = water;
        this.egg = egg;
//        System.out.println("안녕 나는 매개변수를 3개 받는 스낵의 생성자야 !");
    }

    public Snack(String wheatFlour, String water, String egg, String choco) {
        this(wheatFlour, water, egg);
        this.choco = choco;
//        System.out.println("안녕 나는 매개변ㄴ수를 4개받는 스낵의 생성자야 !");
    }

    public static String getFoodType() {
        return foodType;
    }

    public static void setFoodType(String foodType) {
        Snack.foodType = foodType;
    }

    public String getWheatFlour() {
        return wheatFlour;
    }

    public Snack setWheatFlour(String wheatFlour) {
        this.wheatFlour = wheatFlour;
        return this;
    }

    public String getWater() {
        return water;
    }

    public Snack setWater(String water) {
        this.water = water;
        return this;
    }

    public String getEgg() {
        return egg;
    }

    public Snack setEgg(String egg) {
        this.egg = egg;
        return this;
    }

    public String getChoco() {
        return choco;
    }

    public Snack setChoco(String choco) {
        this.choco = choco;
        return this;
    }

    public String getTestProtected() {
        return testProtected;
    }

    public Snack setTestProtected(String testProtected) {
        this.testProtected = testProtected;
        return this;
    }

    public static void print(Snack snack) {
        System.out.println("나는 전역에 존재하는 static method 야.");
        System.out.println(snack.getWheatFlour() + " : " + snack.getWater() +  " : " + snack.getEgg());
        snack = new Snack();
    }
}