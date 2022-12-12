package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", "Black", 2016));
        carList.add(new Car("Kalina", "Min", 2003));
        carList.add(new Car("Priora", "val0", 2011));
        carList.add(new Car("Kia", "Rio", 2000));
        carList.add(new Car("Kalina", "Lucs", 2010));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
