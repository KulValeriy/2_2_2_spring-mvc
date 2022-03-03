package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("BMW", "V2", 1990));
        list.add(new Car("Skoda", "V1.8", 2000));
        list.add(new Car("KIA", "V4", 2017));
        list.add(new Car("Mercedes-Benz", "V6", 2022));
        list.add(new Car("Audi", "V2", 2016));
    }

    public List<Car> getCar (int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
