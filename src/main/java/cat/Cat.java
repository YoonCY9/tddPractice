package cat;

import java.util.Objects;

public class Cat {

    String cat;
    double catWeight;
    int catAge;

    public Cat(String cat,double catWeight, int catAge) {
        this.cat = cat;
        this.catWeight = catWeight;
        this.catAge = catAge;
    }

    public int getCatAge() {
        return catAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat1 = (Cat) o;
        return Double.compare(catWeight, cat1.catWeight) == 0 && catAge == cat1.catAge && Objects.equals(cat, cat1.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat, catWeight, catAge);
    }

    public double getCatWeight() {
        return catWeight;
    }

    public String getName() {
        return cat;
    }
}
