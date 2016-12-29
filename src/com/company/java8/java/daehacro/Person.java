package com.company.java8.java.daehacro;

/**
 * Created by imcts on 2016. 9. 3..
 */
public class Person {
    private Person friend;
    private String name;
    private String sex;
    private String hoby;
    private int age;

    public Person(String name, int age, String hoby) {
        this.name = name;
        this.age  = age;
        this.hoby = hoby;
    }

    public String getName() {

        return this.name;
    }

    public void setFriend(Person friend) {

        this.friend = friend;
    }

}