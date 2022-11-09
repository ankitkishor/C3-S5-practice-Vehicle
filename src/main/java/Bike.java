/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Bike extends VehicleManufacturer implements Vehicle {
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);

    }

    public String getManufacturerInformation() {
        return "Bike{" +
                "Manufacturer Name='" + getVehicleName() + '\'' +
                ", Model Name =" + getVehicleModelName() +
                ", Type = " + getVehicleType() +
                '}';
    }
    public int maxSpeed(String type)
    {
        if(type.equals("sportsBike"))
        {
            return 300;
        }
        if (type.equals("cruiser"))
        {
            return 170;
        }
        return 0;

    }


}
