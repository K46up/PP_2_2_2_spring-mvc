package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getListCarForCoun(int countCar, List<Car> listCar);
}
