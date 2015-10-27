/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.padraodecorator.cdp;

/**
 *
 * @author 20122bsi0387
 */
public class ArConditionedVehicle extends AbstractVehicleOption {

    public ArConditionedVehicle(Vehicle vehicle) {
        super(vehicle);
    }
    
    public void setTemperature(int value){        
    }
    
    public float getPrice() {
        return decoratorVehicle.getPrice() + 600;
    }
}
