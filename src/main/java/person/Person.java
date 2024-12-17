package person;

import java.util.Objects;

public class Person {

    String person;
    String job;
    int personalHistory;

    public Person(String person, String job, int personalHistory) {
        this.person = person;
        this.job = job;
        this.personalHistory = personalHistory;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person1 = (Person) o;
        return personalHistory == person1.personalHistory && Objects.equals(person, person1.person) && Objects.equals(job, person1.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, job, personalHistory);
    }

    public String getJob() {
        return job;
    }

    public int getPersonalHistory() {
        return personalHistory;
    }

    public Person(String person) {
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

}
