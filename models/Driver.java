package models;

public class Driver {
    private String name;
    private Double rating;
    private int distance;
    private CarModel carModel;
    private String destination;

    public Driver(String name, Double rating, int distance, CarModel carModel, String destination) {
        this.name = name;
        this.rating = rating;
        this.distance = distance;
        this.carModel = carModel;
        this.destination = destination;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getName(){
        return name;
    }

    public Double getRating() {
        return rating;
    }

    public int getDistance() {
        return distance;
    }

    public CarModel getCarModel() {
        return carModel;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
