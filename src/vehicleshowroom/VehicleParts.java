/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleshowroom;

import java.util.ArrayList;

/**
 *
 * @author Lami
 */
public abstract class VehicleParts {
    protected String vehicleType ,engineType, vehicleColor;
    protected int modelNumber, enginePower, tireSize;
    protected static ArrayList<VehicleParts> totalVehicles = new ArrayList<VehicleParts>();
    

    VehicleParts(int _modelNumber,String _vehicleType,  String _engineType, int _enginePower, int _tireSize, String _vehicleColor){
       
        vehicleType = _vehicleType;
        modelNumber = _modelNumber;
        engineType = _engineType;
        enginePower = _enginePower;
        tireSize = _tireSize;
        vehicleColor = _vehicleColor;
      
    }

    abstract void addVehicle(VehicleParts newVehicle);

    static void removeVehicle(int modelNumber) {
        for(int i=0; i<totalVehicles.size(); i++) {
            VehicleParts vehicle = totalVehicles.get(i);
            if(vehicle.modelNumber == modelNumber) {
                totalVehicles.remove(i);
                break;
            }
        }
    }

    static void showVehicle() {
        
         for(int i=0; i<totalVehicles.size(); i++) {
            VehicleParts vehicle = totalVehicles.get(i);
           System.out.println("Model Numnber: " + vehicle.modelNumber + " \nCar Type: " + vehicle.vehicleType + " \nEngine Type: " + vehicle.engineType
                               + " \nEngine Power: " + vehicle.enginePower +"HP"
                               + " \nColor: " + vehicle.vehicleColor);
           if(vehicle.vehicleType.equals("SportsCar")) {
                SportsCar sC = (SportsCar) vehicle;
                System.out.println("TruboCharger: "+sC.turbo);
            }
            if(vehicle.vehicleType.equals("HeavyCar")) {
                HeavyCar hC = (HeavyCar) vehicle;
                System.out.println("Weight: "+hC.weight);
            }
            
            System.out.println("-----------------------------------------");
        }
    }

    static void showVisitorCount() {
        int expectedVisitors = 30;
         for(int i=0; i<totalVehicles.size(); i++) {
            VehicleParts vehicle = totalVehicles.get(i);
            if(vehicle.vehicleType == "SportsCar") {
                expectedVisitors= expectedVisitors+20;
                
            }
            }
          System.out.println("Total Number of Expected Visitors: " + expectedVisitors);
}
}
