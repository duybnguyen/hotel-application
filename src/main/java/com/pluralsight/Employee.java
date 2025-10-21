package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    String department;
    double payRate;
    int hoursWorked;
    double punchInTime;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

    public int getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public int getOverTimeHours() {
        return Math.max(this.hoursWorked - 40, 0);
    }

    public void punchIn(double time) {
        this.punchInTime = time;
    }

    public void punchOut(double time) {
        this.hoursWorked += time - punchInTime;
    }
}
