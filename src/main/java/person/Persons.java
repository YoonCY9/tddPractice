package person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persons {

    private List<Person> values = new ArrayList<>();

    public Persons(List<Person> values) {
        this.values = values;
    }

    public List<Person> getValues() {
        return values;
    }

    public List<Person> findSeniorDeveloper() {
        List<Integer> personalHistory = values.stream().map(Person::getPersonalHistory).toList();

        int max = Collections.max(personalHistory);

        return values.stream().filter(p -> p.personalHistory == max).toList();
    }
}
