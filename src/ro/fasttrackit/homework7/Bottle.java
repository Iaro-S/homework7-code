package ro.fasttrackit.homework7;

public class Bottle {
    private int capacity;
    private int available;
    private boolean open;

    Bottle(int capacity, int available, boolean open) {

        this.capacity = capacity;
        this.available = available;
        this.open = false;
    }

    public int drinkLiquid(int drink) {
        if (this.getAvailable() > 0) {
            int newAvailable = this.getAvailable() - drink;
            if (newAvailable > 0) {
                return newAvailable;
            } else {
                return 0;
            }
        } else {
            System.out.println("there's not enough liquid");
            return 0;
        }
    }

    public boolean closeBottle() {
        return open = false;
    }

    public boolean openBottle() {
        if (open) {
            System.out.println("you can't drink from a closed bottle");
            return false;
        } else {
            this.open = true;
            return true;
        }
    }

    public boolean isOpen() {
        return open;
    }

    boolean moreThen() {
        return capacity / 2 < available;
    }

    int getCapacity() {
        if (capacity < 1) {
            System.out.println("Bottle capacity must be bigger then 0");
            return 1;
        } else {
            return capacity;
        }
    }

    int getAvailable() {
        if (this.available >= 0) {
            if (this.capacity <= this.available) {
                return getCapacity();
            } else {
                return this.available;
            }
        } else {
            return 0;
        }
    }

    int emptyCapacity() {
        if (this.available > 0) {
            int empty = this.capacity - this.available;

            if (empty > 0) {
                return empty;
            } else {
                return 0;
            }
        } else {
            return this.capacity;
        }
    }
}