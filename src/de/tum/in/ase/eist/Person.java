package de.tum.in.ase.eist;

public class Person {
    private String name;
    private int age;
    private String tumId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTumId() {
        return tumId;
    }

    public Person(String name, int age, String tumId) {
        this.name = name;
        this.age = age;
        this.tumId = tumId;
    }

    public void say(String text){
        System.out.println(name + " said: " + text);
    }
}
