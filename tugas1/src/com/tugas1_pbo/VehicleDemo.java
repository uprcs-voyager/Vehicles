package com.tugas1_pbo;
import com.kendaraan.IRefuelable;
import com.kendaraan.LandVehicle;
import com.kendaraan.Vehicle;
import com.kendaraan.WaterVehicle;

public class VehicleDemo {
    public static void main(String[] args) {
      // membuat array dengan 4 objek
      Vehicle[] vehicles = new Vehicle[] {
        new LandVehicle("mobil", 120, 100, 4),
        new WaterVehicle("kapal", 80, 100, true),
        new LandVehicle("truk", 90, 5, 6),
        new WaterVehicle("kapal gede", 140, 12, false)
      };

      for (Vehicle v : vehicles) {
        v.move();
        v.calculateFuelConsumption(50);

        if(v instanceof IRefuelable) {
          IRefuelable refuelable = (IRefuelable) v;
          if(refuelable.isFuelLow()) {
            double amount = 30;
            System.out.println("\nBahan bakar "+v.getName()+" rendah! Mengisi ulang "+amount+"%..." );
            refuelable.refuel(amount);
        }
      }
      System.out.println();
      }
    }
}
