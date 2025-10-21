package com.pluralsight;

public class Room {
    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
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

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut() {
        this.isDirty = false;
        this.isOccupied = false;
    }

}
