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
<<<<<<< HEAD
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        return age;
=======
        return age < 0 ? 0 : age;
>>>>>>> f6c77b7 (Vrs 1.0)
    }

    String getName() {
        return name;
    }
}
