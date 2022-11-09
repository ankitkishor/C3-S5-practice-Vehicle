/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Car extends VehicleManufacturer implements Vehicle {
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);

    }

    public String getManufacturerInformation() {
        return "Bike{" +
                "Manufacturer Name='" + getVehicleName() + '\'' +
                ", Model Name =" + getVehicleModelName() +
                ", Type = " + getVehicleType() +
                '}';
    }
    public int maxSpeed(String vehicleType)
    {
        if(vehicleType.equals("SportsCar"))
        {
            return 250;
        }
        if (vehicleType.equals("Sedan"))
        {
            return 170;
        }
        return 0;

    }
}
