package jsmine.method;

import jsmine.object.Snack;

/**
 * Created by imcts on 2017. 4. 9..
 */

class MyMethod {
    String name;
    int age;

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

}

public class Method {
    public static void main(String [] args) {
        MyMethod m = new MyMethod();
        m.name = "최태산";
        m.age = 31;

        m.setAge(30);

        System.out.println(m.getAge());

        Snack snack = new Snack("", "", "", "");
    }
}
