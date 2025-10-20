package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }
}
