package com.kendaraan;

public abstract class Vehicle  {
    private String name;
    private int speed;
    private double fuelLevel;   

    // Constructor
    public Vehicle(String name, int speed, double fuelLevel) {
      this.name = name;
      this.speed = speed;
      this.fuelLevel = fuelLevel;
    }
    // getter nama
    public String getName() {return this.name;}

     // getter speed
     public int getSpeed() {return this.speed;}

     // getter fuelLevel
     public double getFuelLevel() {return this.fuelLevel;}

    //setter fuelLevel
    public void setFuelLevel(double amount) {
      if (amount < 0) this.fuelLevel = 0;
      else if (amount > 100) this.fuelLevel = 100;
      else this.fuelLevel = amount;
  }
     //abstract method move
    public abstract void move();
    
    //abstract method calculateFuelConsumption
    public abstract double calculateFuelConsumption(double distance);

}


