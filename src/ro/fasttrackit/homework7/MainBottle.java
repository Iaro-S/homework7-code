package ro.fasttrackit.homework7;

public class MainBottle {
    public static void main(String[] args) {
        Bottle myBottle = new Bottle(500, 300, false);

        System.out.println(myBottle.getCapacity());
        System.out.println(myBottle.moreThen());
        System.out.println(myBottle.getAvailable());
        System.out.println(myBottle.emptyCapacity());
        myBottle.openBottle();
        System.out.println("Bottle is opened: " + myBottle.isOpen());
        myBottle.closeBottle();
        System.out.println("Bottle is closed!");
        System.out.println("The quantity available is " + myBottle.drinkLiquid(150));

    }
}
