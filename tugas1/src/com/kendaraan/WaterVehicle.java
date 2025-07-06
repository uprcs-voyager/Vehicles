package com.kendaraan;

public class WaterVehicle extends Vehicle implements IRefuelable{
    private boolean hasPropeller;
    private double distance;
    private double fuelUsed;
    private double currentFuel;


    public WaterVehicle(String name, int speed, double fuelLevel, boolean Inputbooleans) {
        super(name, speed, fuelLevel);
        this.hasPropeller = Inputbooleans;
        
    }
    //implementasi abstract method move
     public  void move(){
        String string = String.format("\n%s bergerak di air dengan  kecepatan %1d KM/jam, menggunakan baling-baling: %b", getName(), getSpeed(), hasPropeller);
        System.out.println(string);
     }
       //implementasi abstract method calculateFuelConsumption
       public double calculateFuelConsumption(double distance){
        this.distance = distance;
        this.fuelUsed = distance/8;
        this.currentFuel = getFuelLevel() - fuelUsed;
        if (currentFuel < 0){
            currentFuel = 0;
        }
        String string = String.format("konsumsi bahan bakar untuk %.0f KM: %.2f%%, sisa bahan bakar:  %.2f%%", this.distance, this.fuelUsed, this.currentFuel);
        System.out.println(string);
        return currentFuel;
    }
     //implementasi method refuel
     @Override
    public void refuel(double amount) {
        setFuelLevel(currentFuel + amount);
        System.out.printf("%s diisi ulang sebanyak %.2f%%. Bahan bakar sekarang: %.2f%%%n",
                          getName(), amount, getFuelLevel());
 
    }
    //implementasi method isFuelLow
    @Override
    public boolean isFuelLow() {return getFuelLevel() < 20;}   
}
