package ro.fasttrackit.homework7;

public class Bottle {
    private int capacity;
    private int available;
    private boolean open;

    public Bottle(int capacity, int available, boolean open) {

        this.capacity = capacity;
        this.available = available;
        this.open = false;
    }

    public boolean closeBottle() {
        return open = false;
    }

    public boolean openBottle() {
        if (open) {
            System.out.println("Sticla inchisa, nu se poate bea");
        } else {
            this.open = true;
        }
        return false;
    }

    public boolean isOpen() {
        return open;
    }

    boolean moreThen() {
        return this.capacity / 2 < this.available;
    }

    int getCapacity() {
        return this.capacity;
    }

    int getAvailable() {
        if (this.available >= 0) {
            if (this.capacity <= this.available) {
                return this.capacity;
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