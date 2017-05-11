package jsmine.object;

/**
 * Created by imcts on 2017. 4. 23..
 */

class Parent {
    private String house;
    private String car;
    private String school;

    {
        house = "안녕 나는 아빠 집이야";
        car = "안녕 나는 아빠 자동차야";
        school = "하버드";
    }

    public Parent() {
        System.out.println("나는 부모의 디폴트 생성자야");
    }

    public Parent(String car, String school) {
        this.car = car;
        this.house = house;
        System.out.println("나는 부모의 변수두개 생성자야");
    }

    public String getHouse() {
        return house;
    }

    public Parent setHouse(String house) {
        this.house = house;
        return this;
    }

    public String getCar() {
        return car;
    }

    public Parent setCar(String car) {
        this.car = car;
        return this;
    }

    public void getMyInfo() {
        System.out.println(
                "안녕 나는 Children이야 !!" + this.house + " : " + this.car + " : " + this.school
        );
    }
}

class Children extends Parent {
    public Children() {
        super("빠라바라바라밤 자동차", "서울대학교");
    }

    @Override
    public void getMyInfo() {
        System.out.println("안녕 나는 자식의 겟 마이 인포야 !");
    }
}

class Print {

    public void print3(Parent c) {
        c.getMyInfo();
    }

}

class Tv {
    private String name;
    private int channel;
    private int volume;

    public Tv() {}

    public Tv(String name, int channel, int volume) {
        this.name = name;
        this.channel = channel;
        this.volume = volume;
    }

    public void channelUp() {
        System.out.println("안녕 나는 " + this.name + "의 채널 업이야");
    }

    public void channelDown() {
        System.out.println("안녕 나는 " + this.name + "의 채널 다운이야");
    }

    public void volumeUp() {
        System.out.println("안녕 나는 " + this.name + "의 볼륨업이야");
    }

    public void volumeDown() {
        System.out.println("안녕 나는 " + this.name + "의 볼륨다운이야");
    }


    public String getName() {
        return name;
    }

    public Tv setName(String name) {
        this.name = name;
        return this;
    }

    public int getChannel() {
        return channel;
    }

    public Tv setChannel(int channel) {
        this.channel = channel;
        return this;
    }

    public int getVolume() {
        return volume;
    }

    public Tv setVolume(int volume) {
        this.volume = volume;
        return this;
    }
}

class LgTv extends Tv {
    public LgTv() {}

    public LgTv(String name, int channel, int volume) {
        super(name, channel, volume);
    }
}

class SamsungTv extends Tv {
    public SamsungTv() {}

    public SamsungTv(String name, int channel, int volume) {
        super(name, channel, volume);
    }
}


class RemoteController {
    private Tv tv;

    public RemoteController() {
    }

    public RemoteController(Tv tv) {
        this.tv = tv;
    }

    public void channelUp() {
        this.tv.channelUp();
    }

    public void channelDown() {
        this.tv.channelDown();
    }

    public void volumeUp() {
        this.tv.volumeUp();
    }

    public void volumeDown() {
        this.tv.volumeDown();
    }
}

class LgRemoteController extends RemoteController {
    public LgRemoteController() {
    }

    public LgRemoteController(Tv tv) {
        super(tv);
    }

    public void doMotion() {
        System.out.println("모션인식을 실행합니다.");
    }
}

class SamsungRemoteController extends RemoteController {
    public SamsungRemoteController() {
    }

    public SamsungRemoteController(Tv tv) {
        super(tv);
    }

    public void doPayment() {
        System.out.println("삼성페이를 결제합니다.");
    }
}



class AA {
    private BB b;
    private CC c;

    public AA() {}

    public AA(BB b, CC c) {
        this.b = b;
        this.c = c;

        this.b.setInitialize(this, this.c);
        this.c.setInitialize(this, this.b);
    }

    public void setInitialize(BB b, CC c) {
        this.b = b;
        this.c = c;
    }

    public BB getB() {
        return b;
    }

    public AA setB(BB b) {
        this.b = b;
        return this;
    }

    public CC getC() {
        return c;
    }

    public AA setC(CC c) {
        this.c = c;
        return this;
    }
}

class BB {
    private AA a;
    private CC c;

    public BB() {
    }

    public BB(AA a, CC c) {
        this.a = a;
        this.c = c;

        this.a.setInitialize(this, this.c);
        this.c.setInitialize(this.a, this);
    }

    public void setInitialize(AA a, CC c) {
        this.a = a;
        this.c = c;
    }

    public AA getA() {
        return a;
    }

    public BB setA(AA a) {
        this.a = a;
        return this;
    }

    public CC getC() {
        return c;
    }

    public BB setC(CC c) {
        this.c = c;
        return this;
    }
}

class CC {
    private AA a;
    private BB b;

    public CC() {
    }

    public CC(AA a, BB b) {
        this.a = a;
        this.b = b;

        this.a.setInitialize(this.b, this);
        this.b.setInitialize(this.a, this);
    }

    public void setInitialize(AA a, BB b) {
        this.a = a;
        this.b = b;
    }

    public AA getA() {
        return a;
    }

    public CC setA(AA a) {
        this.a = a;
        return this;
    }

    public BB getB() {
        return b;
    }

    public CC setB(BB b) {
        this.b = b;
        return this;
    }
}



public class Inherit {

    public static void main(String[] args) {

        //class 다형성 조금 했음
        //다음주에는 부모의 메소드를 가져가는 법과,3개의 클래스가 서로 참조하는 방법

        //앱스트랙트 클래스 전에 이너클래스와 즉석 클래스와 익명클래스에 대해서 진행할 것
        //인터페이스까지 진입

        Tv lgTv = new LgTv("엘지티비", 3, 5);
        LgRemoteController lgController = new LgRemoteController(lgTv);
        lgController.channelUp();
        lgController.doMotion();

        System.out.println("----------------------------------------------------------");

        Children children = new Children();
        children.getMyInfo();

        Parent parent = new Parent();
        parent.getMyInfo();

        parent = children;
        parent.getMyInfo();

        System.out.println("----------------------------------------------------------");

        //자료형 4byte, 주소값을 담을 공간 a
        AA a = new AA(); //유저 정보

        BB b = new BB(); //대기방

        CC c = new CC(); //게임방

        System.out.println(a.getB().equals(b));
        System.out.println(a.getC().equals(c));
        System.out.println(b.getA().equals(a));

        System.out.println("----------------------------------------------------------");
    }
}
