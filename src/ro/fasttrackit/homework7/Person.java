package ro.fasttrackit.homework7;

public class Person {
    public boolean getAge;
    private int age;
    private String name;
    private boolean married;

    public Person(String name, int age, boolean married) {

        this.name = name;
        this.age = age;
        this.married = married;
    }

    public boolean getMarried() {
        return married;
    }

    int getAge() {
        return age < 0 ? 0 : age;
    }

    String getName() {
        return name;
    }
}
