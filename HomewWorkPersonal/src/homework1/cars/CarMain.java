package homework1.cars;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car toyota = new Car("toyota", 100, 80,1800);
        Car tesla = new ElectricCar("tesla", 150, 500, 100, 5);
        List<Car> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(toyota);
        for (int i = 0; i < cars.size(); i++) {
             if(cars.get(i) instanceof ElectricCar) {
                ElectricCar tes = (ElectricCar)cars.get(i);
                tes.driveElectric(100);
            }else if (cars.get(i) instanceof Car) {
                cars.get(i).drive(100);
            }
        }
    }
}
