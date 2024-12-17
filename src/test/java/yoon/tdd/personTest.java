package yoon.tdd;

import org.junit.jupiter.api.Test;
import person.Person;
import person.Persons;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class personTest {

    @Test
    void person1() {
        //given
        Persons persons = new Persons(List.of(
                new Person("윤찬영","개발자",5),
                new Person("김찬영","개발자",10)));
        //when
        List<Person> seniorDeveloper = persons.findSeniorDeveloper();
        //then
        assertThat(seniorDeveloper).isEqualTo(List.of(new Person("김찬영","개발자",10)));
    }

}
