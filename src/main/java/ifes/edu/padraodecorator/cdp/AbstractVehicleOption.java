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
public class AbstractVehicleOption extends AbstractVehicle {
    protected Vehicle decoratorVehicle;
    public AbstractVehicleOption(Vehicle vehicle) {
        super(vehicle.getPrice());
        this.decoratorVehicle = vehicle;
    }
    

}
