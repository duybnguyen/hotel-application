package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    double payRate;
    int hoursWorked;

    public double getTotalPay() {
        return this.payRate * this.hoursWorked;
    }

    public int getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public int getOverTimeHours() {
        return Math.max(this.hoursWorked - 40, 0);
    }
}
