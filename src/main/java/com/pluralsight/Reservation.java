package com.pluralsight;
import java.time.*;

public class Reservation {
    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public Reservation(boolean isWeekend, int numberOfNights, String roomType) {
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
        this.roomType = roomType;
        this.price = this.roomType.equalsIgnoreCase("king") ? 139.00 : 124.00;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
