package car;

import java.util.*;

public class Cars {

    private List<Car> values = new ArrayList<>();

    public Cars(List<Car> values) {
        this.values = values;
    }

    public List<Car> getValues() {
        return values;
    }

    public List<Car> findOldestCars() {
        List<Integer> carAge = values.stream().map(Car::getModelYear).toList();

        int oldest = Collections.max(carAge);

        return values.stream().filter(c -> c.getModelYear() == oldest).toList();
    }

    public List<Car> findMaxMileageCars() {
        List<Integer> mileage = values.stream().map(Car::getMileage).toList();

        int max = Collections.max(mileage);

        return values.stream().filter(c -> c.getMileage() == max).toList();
    }
}
