package service;

import models.CarModel;
import models.Driver;

import java.util.List;

public interface CarBookingService {
    Driver findDriver(List<Driver> driverList, CarModel carModel,String destination);

    int getCost(Driver driver, int distance);
}
