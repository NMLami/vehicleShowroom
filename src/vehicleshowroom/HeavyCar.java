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
public class HeavyCar extends VehicleParts {
    int weight;

    HeavyCar(int _modelNumber, int _enginePower, int _tireSize, int _weight, String _vehicleColor) {
        super( _modelNumber, "HeavyCar", "Diesel Engine", _enginePower, _tireSize, _vehicleColor);
        weight = _weight;
        addVehicle(this);
    }
  @Override  
    void addVehicle(VehicleParts newVehicle) {
        VehicleParts.totalVehicles.add(newVehicle);
    } 
}
