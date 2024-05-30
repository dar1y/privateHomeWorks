package homework1.cars;

public class Car {
    private String brand;
    private double speed;
    private double fuel;
    private double mileage;

    public Car(String brand, double speed, double mileage) {
        this.brand = brand;
        this.speed = speed;
        this.mileage = mileage;
    }

    public void accelerate(){
        System.out.println("car accelerating");
    };

    public void refuel(){

        System.out.println("car has been refueled");
    };

    public void drive(int distance){
        double consumed = distance/10;
        fuel = fuel - consumed;
        System.out.println("the gas car passed: "+ distance + " km"+  " and consumed: " + consumed + " l of fuel");
        mileage = mileage + distance;
        System.out.println("the mileage now is: " + mileage);
        System.out.println("the tank level now is: " + getFuel() + " l of gas");
    }

    public Car(String brand, double speed, double fuel,double mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "homework1.cars.Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", fuel=" + fuel +
                ", mileage=" + mileage +
                '}';
    }
}
