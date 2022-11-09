/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class VehicleService {
    public static void main(String[] args) {
        Bike bike=new Bike("yamaha","activa","125cc");
        System.out.println(bike.getManufacturerInformation());
        System.out.println("bike speed= "+ bike.maxSpeed("sportsBike"));

        Car car=new Car("BMW","X-Series","Luxury");
        System.out.println(car.getManufacturerInformation());
        System.out.println("car speed= "+ car.maxSpeed("Sedan"));

    }
}
