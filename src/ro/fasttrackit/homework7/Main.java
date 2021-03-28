package ro.fasttrackit.homework7;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Andrei", 37, true);

        System.out.print(myPerson.getName() + ",");
        System.out.print(myPerson.getAge() + ",");
        System.out.println(myPerson.getMarried());

        Person firstPerson = new Person("George", 26, false);
        System.out.println(firstPerson.getName() + "," + firstPerson.getAge() + "," + firstPerson.getMarried());
        Person secondPerson = new Person("Mihai", 45, true);
        System.out.println(secondPerson.getName() + "," + secondPerson.getAge() + "," + secondPerson.getMarried());
        Person thirdPerson = new Person("Cristina", -10, false);
        System.out.println(thirdPerson.getName() + "," + thirdPerson.getAge() + "," + thirdPerson.getMarried());

    }
}
