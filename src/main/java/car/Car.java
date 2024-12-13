package car;

import java.util.Objects;

public class Car {

    String Number;
    int modelYear;
    int Mileage;

    public Car(String number, int modelYear, int mileage) {
        Number = number;
        this.modelYear = modelYear;
        Mileage = mileage;
    }

    public String getNumber() {
        return Number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return modelYear == car.modelYear && Mileage == car.Mileage && Objects.equals(Number, car.Number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number, modelYear, Mileage);
    }

    public int getModelYear() {
        return modelYear;
    }

    public int getMileage() {
        return Mileage;
    }
}
