package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCount(int number) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("c1", 11));
        cars.add(new Car("c2", 22));
        cars.add(new Car("c3", 33));
        cars.add(new Car("c4", 44));
        cars.add(new Car("c5", 55));

        List<Car> addCars = new ArrayList<>();

        if (number < cars.size()) {
            for (int i = 0; i < number; i++) {
                addCars.add(cars.get(i));
            }
            return addCars;
        } else {
            return cars;
        }
    }
}
