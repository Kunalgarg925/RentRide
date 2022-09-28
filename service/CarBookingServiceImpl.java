package service;

import models.CarModel;
import models.Driver;

import java.util.ArrayList;
import java.util.List;

public class CarBookingServiceImpl implements  CarBookingService{
    private static int costPerKm = 8;

    @Override
    public Driver findDriver(List<Driver> driverList, CarModel carModel,String destination) {
        //1. filter out all the drivers driving the given carModel
        //2. find the nearest driver from the filtered list.

        List<Driver> filteredDrivers = new ArrayList<>();
        for(Driver driver : driverList ){
            if(driver.getCarModel() == carModel){
                if(driver.getDestination() == destination){
                    filteredDrivers.add(driver);
                }
            }
        }

        Driver nearestDriver = filteredDrivers.get(0);
        for(Driver driver:filteredDrivers){
            if(driver.getDistance() < nearestDriver.getDistance()){
                    nearestDriver = driver;
            }
        }

        return nearestDriver;
    }

    @Override
    public int getCost(Driver driver, int distance) {
        return distance*costPerKm;
    }
}
