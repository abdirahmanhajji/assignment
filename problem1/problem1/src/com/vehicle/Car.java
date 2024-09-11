package com.vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    public double getSpeedMph() {
        return this.speedKph / 1.60934;
    }

    public int getDistanceKm() {
        return this.distanceTraveled / 1000;
    }

    public int calculateRemainingFuel(double distance) {
        double fuelConsumption = distance * 0.5;
        this.fuelLevel -= (float) fuelConsumption;
        return (int) this.fuelLevel;
    }
}
