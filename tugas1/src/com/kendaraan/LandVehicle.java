package com.kendaraan;

public class LandVehicle extends Vehicle implements IRefuelable{
    private int wheels;
    private double distance;
    private double fuelUsed;
    private double currentFuel;

    public LandVehicle(String name, int speed, double fuelLevel, int Inputwheels) {
       super(name, speed, fuelLevel);
       this.wheels = Inputwheels;
       
    }
    //implementasi abstract method calculateFuelConsumption
    public double calculateFuelConsumption(double distance){
        this.distance = distance;
        this.fuelUsed = distance/10;
        this.currentFuel = getFuelLevel() - fuelUsed;
        if (currentFuel < 0){
            currentFuel = 0;
        }
        String string = String.format("konsumsi bahan bakar untuk %.0f KM: %.1f%%, sisa bahan bakar:  %.1f%%", this.distance, this.fuelUsed, this.currentFuel);
        System.out.println(string);
        return currentFuel;
    }

    //implementasi method refuel
    @Override
    public void refuel(double amount) {
        setFuelLevel(currentFuel + amount);
        System.out.printf("sisa bahan bakar %s setelah diisi: %.1f%%%n",
                          getName(), getFuelLevel());
    }
    //implementasi method isFuelLow
    @Override
    public boolean isFuelLow() {return getFuelLevel() <20;}

      //implementasi abstract method move
     public void move() {
        String string = String.format("%s bergerak di darat dengan %1d roda pada kecepatan %1d KM/jam", getName(), this.wheels, getSpeed());
        System.out.println(string);
    }
    }
    

