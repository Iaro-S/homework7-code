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
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        return age;
    }

    String getName() {
        return name;
    }
}
