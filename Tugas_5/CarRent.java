package Tugas5;

public class CarRent {
    CarRider rider;
    Car car;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }
}
