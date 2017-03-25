package daehacro;

/**
 * Created by imcts on 2016. 9. 4..
 */

abstract class Subway {
    String station;
    String lineNumber;


    public abstract void openScreenDoor();
    public abstract void closeScreenDoor();
    public abstract void openSubwayDoor();
    public abstract void closeSubwayDoor();
}

class LineNumberOne extends Subway {
    @Override
    public void openScreenDoor() {
        System.out.println("수지니가만든 스크린도어 오픈");
    }

    @Override
    public void closeScreenDoor() {
        System.out.println("수지니가만든 스크린도어 클로즈");
    }

    @Override
    public void openSubwayDoor() {
        System.out.println("수지니가만든 쟈철 오픈");
    }

    @Override
    public void closeSubwayDoor() {
        System.out.println("수지니가만든 쟈철 클로즈");
    }
}


class LineNumberTwo extends Subway {
    @Override
    public void openScreenDoor() {
        System.out.println("연조이가만든 스크린도어 오픈");
    }

    @Override
    public void closeScreenDoor() {
        System.out.println("연조이가만든 스크린도어 클로즈");
    }

    @Override
    public void openSubwayDoor() {
        System.out.println("연조이가만든 쟈철 오픈");
    }

    @Override
    public void closeSubwayDoor() {
        System.out.println("연조이가만든 쟈철 클로즈");
    }
}


class A {

    public void test() {
        System.out.println("안녕 나는 A의 테스트 메소드야");
    }

}

interface StarCraft {

    public void move();
    public void attack();
    public void money();
    public void gas();
    public void fly();

}

interface Zerg {
    public void crip();
}

interface Terran {
    public void flyBuilding();
}

interface Protoss {
    public void strong();
}


class TerranTribe implements StarCraft, Terran {
    @Override
    public void flyBuilding() {

    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void money() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void fly() {

    }
}

class ZergTribe implements StarCraft, Zerg {
    @Override
    public void crip() {

    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void money() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void fly() {

    }
}

class ProtossTribe implements StarCraft, Protoss {
    @Override
    public void strong() {

    }

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void money() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void fly() {

    }
}

public class ExtendsStudy {
    public static void main(String[] args) {

        Subway subway = new LineNumberOne();

        subway.openScreenDoor();


        subway = new LineNumberTwo();

        subway.openScreenDoor();

        A a = new A() {
            @Override
            public void test() {
                System.out.println("안녕 나는 오버라이드된 메소드 A야");
            }
        };

        a.test();



        StarCraft terran = new TerranTribe();
        Terran terran2 = new TerranTribe();

        terran.attack();
        terran2.flyBuilding();
    }
}
