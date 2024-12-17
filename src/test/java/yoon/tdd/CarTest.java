package yoon.tdd;

import car.Car;
import car.Cars;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void oldestCars() {
        // given
        Cars cars = new Cars(List.of(
                new Car("12가3456",2018,99000),
                new Car("5허4156",2024,420),
                new Car("11다3218",1999,7100)));
        // when
        List<Car> oldestCars = cars.findOldestCars();
        // then
        assertThat(oldestCars).isEqualTo(List.of(new Car("11다3218",1999,7100)));
    }

    @Test
    void maxMileagesCars() {
        // given
        Cars cars = new Cars(List.of(
                new Car("12가3456",2018,99000),
                new Car("5허4156",2024,420),
                new Car("11다3218",1999,7100)));
        // when
        List<Car> maxMileage = cars.findMaxMileageCars();
        // then
        assertThat(maxMileage).isEqualTo(List.of(new Car("12가3456",2018,99000)));

    }
}
