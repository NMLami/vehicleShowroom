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
//  _modelNumber,String _vehicleType,  String _engineType, int _enginePower, int _tireSize, String _vehicleColor
public class SportsCar extends VehicleParts {
    String turbo= "";

    SportsCar(int _modelNumber, int _enginePower, int _tireSize, String _turbo , String _vehicleColor) {
        super(_modelNumber,"SportsCar", "OIL Engine", _enginePower, _tireSize, _vehicleColor);
        turbo = _turbo;
        addVehicle(this);
    }
     @Override 
    void addVehicle(VehicleParts newVehicle) {
        VehicleParts.totalVehicles.add(newVehicle);
    }


    
}
