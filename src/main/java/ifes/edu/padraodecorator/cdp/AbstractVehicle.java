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
public abstract class AbstractVehicle implements Vehicle {
    private int valor;
    public AbstractVehicle(float valor) {
        this.valor += valor;
    }

    public float getPrice() {
        return this.valor;
    }
    
    
}
