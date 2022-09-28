import models.CarModel;
import models.Driver;
import service.CarBookingService;
import service.CarBookingServiceImpl;

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        List<Driver> driverList = getDrivers();

        //customer input
        CarModel carModel = CarModel.sedan;
        int distance = 43;
        String destination = "Delhi";
    
        CarBookingService carBookingService = new CarBookingServiceImpl();
        Driver driver = carBookingService.findDriver(driverList, carModel,destination);
        int cost = carBookingService.getCost(driver, distance);

        System.out.println("cost:" + cost);
        System.out.println("driver:" + driver.getName());
    }

    private static List<Driver> getDrivers() {
        List<Driver> driverList = new ArrayList<>();
        Driver A = new Driver("A",4.0,500,CarModel.sedan,"Delhi");
        Driver B = new Driver("B",4.3,1,CarModel.hatchback,"Gurgaon");
        Driver C = new Driver("C",4.8,200,CarModel.seater5,"Noida");
        Driver D = new Driver("D",4.1,700, CarModel.sedan,"Noida");
        Driver E = new Driver("E",4.7,430,CarModel.hatchback,"Delhi");
        driverList.add(A);
        driverList.add(B);
        driverList.add(C);
        driverList.add(D);
        driverList.add(E);
        return driverList;
    }
}

// input ==> List<models.Driver>, CarType, TravelDistance, Destination
// output ==> models.Driver Name, Cost

// Methods in service layer:
// 1. Find models.Driver ==> input: (List<models.Driver>, CarType), output: models.Driver
// 2. Calculate Cost

// Possible Entities:
// 1. CarType --> Enum
// 2. models.Driver(name, rating, carType, distance, List<String> prefDestinations)