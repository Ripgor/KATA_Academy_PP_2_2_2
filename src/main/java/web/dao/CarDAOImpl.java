package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1,"Nissan",40_000L));
        cars.add(new Car(2,"KAMAZ",70_000L));
        cars.add(new Car(3,"Mazda",200_000L));
        cars.add(new Car(4,"Toyota",700_000L));
        cars.add(new Car(5,"BMV",500_000L));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
    
}