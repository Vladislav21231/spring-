package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Lada", "Black", 2016));
            carList.add(new Car("Kalina", "Min", 2003));
            carList.add(new Car("Priora", "val0", 2011));
            carList.add(new Car("Kia", "Rio", 2000));
            carList.add(new Car("Kalina", "Lucs", 2010));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
