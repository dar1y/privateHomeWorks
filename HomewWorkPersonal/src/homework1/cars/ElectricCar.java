package homework1.cars;

public class ElectricCar extends Car{
    private double batteryLevel;
    private double efficiency;
    public void charge(){
        batteryLevel = 100;
        System.out.println("the battery had been charged");
    }


    public void driveElectric(double distance){
        double consumedElectric = distance/efficiency;
        batteryLevel = batteryLevel-consumedElectric;
        super.setMileage(super.getMileage() + distance);
        System.out.println("the electric car passed: " + distance + "km, and consumed: " + consumedElectric + " percent of charging");
        System.out.println("the mileage now: " + super.getMileage());
        System.out.println("the battery level now is: " + getBatteryLevel() + "percents");
    }

    public ElectricCar(String brand, double speed,double mileage, double batteryLevel, double efficiency) {
        super(brand,speed,mileage);
        this.batteryLevel = batteryLevel;
        this.efficiency = efficiency;
    }


    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "homework1.cars.ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                ", efficiency=" + efficiency +
                '}';
    }
}
