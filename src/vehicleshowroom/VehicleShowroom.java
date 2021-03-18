/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleshowroom;

/**
 *
 * @author Lami
 */
public class VehicleShowroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Normar Car parameter(int _modelNumber, String _engineType, int _enginePower, int _tireSize, String _vehicleColor)
        NormalCar nC = new NormalCar(100,"Gas", 2,5, "Green");
        nC = new NormalCar(101,"Oil", 2,5, "Black");
        nC = new NormalCar(102,"Diesel", 2,5, "Blue");

        //SportsCar parameter(int _modelNumber, int _enginePower, int _tireSize, String _turbo , String _vehicleColor)
        SportsCar sC = new SportsCar(200, 2, 4, "Yes","Green");
        sC = new SportsCar(201, 3, 6, "No", "Black");
        sC = new SportsCar(202, 3, 7, "Yes", "Blue");
        
        //Heavy Car Parameter (int _modelNumber, int _enginePower, int _tireSize, int _weight, String _vehicleColor)
        HeavyCar hC = new HeavyCar(300, 2, 5, 1000, "Green");
        hC = new HeavyCar(301, 2, 5, 1000, "Black");
        hC = new HeavyCar(302, 2, 5, 1000, "Blue");
        
        
        VehicleParts.showVehicle();
        VehicleParts.showVisitorCount();
        
        VehicleParts.removeVehicle(200);
        
         VehicleParts.showVisitorCount();
    }
    
}
