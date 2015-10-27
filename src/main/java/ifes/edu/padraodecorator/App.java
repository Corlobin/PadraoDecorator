package ifes.edu.padraodecorator;

import ifes.edu.padraodecorator.cdp.AlloyWheeledVehicle;
import ifes.edu.padraodecorator.cdp.ArConditionedVehicle;
import ifes.edu.padraodecorator.cdp.LeatherSeatedVehicle;
import ifes.edu.padraodecorator.cdp.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle mycar = null;
        mycar = new ArConditionedVehicle(mycar);
        mycar = new AlloyWheeledVehicle(mycar);
        mycar = new LeatherSeatedVehicle(mycar);
    }
}
