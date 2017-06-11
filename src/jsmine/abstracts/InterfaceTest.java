package jsmine.abstracts;

/**
 * Created by imcts on 2017. 5. 14..
 */

interface StacraftCommon {
    void test();
}

interface Stacraft {
    String a = "initialize";

    void test();
}

interface ZergInterface extends Stacraft, StacraftCommon {
    void buildCreep();
}

interface TerranInterface extends Stacraft, StacraftCommon {
    void buildingFly();
}

interface UnitInterface extends Stacraft {

}

interface TerranUnit {
    void steemPack();
}

interface ZergUnit {
    void burrow();
}

class Unit implements TerranUnit, ZergUnit {
    private String type;

    @Override
    public void steemPack() {
        if(!type.equals("terran")) {
            return;
        }

        System.out.println("테란 스팀팩 !");
    }

    @Override
    public void burrow() {

    }
}

class Terran implements TerranInterface {
    private Unit unit;

    @Override
    public void test() {

    }

    @Override
    public void buildingFly() {

    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        Stacraft terran = new Terran(); //TerranInterface, Stacraft, StcraftCommon.

        //DI : Dependency Injection  //의존성 주입기.
    }
}
