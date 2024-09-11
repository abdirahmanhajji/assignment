package com.vehicle;

public class ElectricCar extends Car {
    private double batteryLevel;

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        double kilometersDriven = distance / 1000.0;
        this.batteryLevel -= kilometersDriven * 0.1;
    }
}
