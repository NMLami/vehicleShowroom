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
//int _modelNumber, int _enginePower, int _tireSize, String _turbo , String _vehicleColor
public class NormalCar extends VehicleParts {
     NormalCar(int _modelNumber, String _engineType, int _enginePower, int _tireSize, String _vehicleColor) {
        super(_modelNumber, "Normal",  _engineType, _enginePower, _tireSize ,_vehicleColor);
        addVehicle(this);
    }
   @Override 
    void addVehicle(VehicleParts newVehicle) {
        VehicleParts.totalVehicles.add(newVehicle);
    }
}
