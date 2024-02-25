package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", "X5", "X7LLSRB1HAH548712"));
        cars.add(new Car("Audi", "A4", "X7LLSRB1HAH548712"));
        cars.add(new Car("Volkswagen", "Golf", "X7LLSHGL9UH548712"));
        cars.add(new Car("Toyota", "Corolla", "X7LLSRB1HAH541075"));
        cars.add(new Car("Honda", "Civic", "X7LLRSB1HAH008712"));
    }

    public List<Car> getCars() {
        return cars;
    }
    @Override
    public List<Car> getListCarForCount(int countCar) {
        List<Car> carList = getCars();
        if (countCar <= 0 || countCar > carList.size()) {
            countCar = carList.size();
        }
        return carList.stream().limit(countCar).toList();
    }

}
