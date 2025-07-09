package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " - Electric motor is starting silently...");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving on electric power...");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric motor running for up to " + avgKmPerCharge + " km per charge.");
    }

}
