package yoon.tdd;

import java.util.*;
import java.util.stream.Collectors;

import car.Car;
import cat.Cat;
import lottoNumber.LottoNumber;
import org.junit.jupiter.api.Test;
import person.Person;

import static org.assertj.core.api.Assertions.assertThat;


public class tddTest1 {

//    @Test
//    void personsTest() {
//        Person person1 = new Person("황정민");
//        Person person2 = new Person("마동석");
//        assertThat(person1.getPerson()).isEqualTo("황정민");
//        assertThat(person2.getPerson()).isEqualTo("마동석");
//    }
//
//    @Test
//    void toPersonsTest() {
//        List<String> 주어지는데이터 = List.of("황정민", "마동석");
//
//        List<Person> 결과 = toPersons(주어지는데이터);
//
//        assertThat(결과).isEqualTo(List.of(new Person("황정민"), new Person("마동석")));
//
//    }
//
//    private List<Person> toPersons(List<String> 주어지는데이터) {
//        return 주어지는데이터.stream()
//                .map(Person::new)
//                .collect(Collectors.toList());
//    }
//
//    @Test
//    void CatTest() {
//        Cat cat1 = new Cat("치즈");
//        Cat cat2 = new Cat("삼색이");
//
//        assertThat(cat1.getName()).isEqualTo("치즈");
//        assertThat(cat2.getName()).isEqualTo("삼색이");
//    }
//
//    @Test
//    void toCatsTest() {
//        List<String> cats = List.of("치즈","삼색이");
//
//        List<Cat> catList = toCats(cats);
//
//        assertThat(catList).isEqualTo(List.of(new Cat("치즈"), new Cat("삼색이")));
//    }
//    private List<Cat> toCats(List<String> cats) {
//        return cats.stream()
//                .map(Cat::new)
//                .toList();
//    }
//
//    @Test
//    void findMaxValueTest() {
//        //given
//        List<Integer> numbers = List.of(1,2,3);
//        //when
//        List<Integer> MaxValues = findMaxValues(numbers);
//        //then
//        assertThat(MaxValues).isEqualTo(List.of(3));
//    }
//    private List<Integer> findMaxValues(List<Integer> numbers) {
//        Integer maxValue = numbers.stream()
//                .max(Integer::compareTo)
//                .orElseThrow();
//        return List.of(maxValue);
//    }

//    @Test
//    void findHeaviestCats() {
//        //given
//        List<Cat> cats = List.of(new Cat("치즈", 4.0, 5),
//                new Cat("삼색이", 2.4, 8));
//        //when
//        List<Cat> heaviestCats = findHeaviestCats(cats);
//        //then
//        assertThat(heaviestCats).isEqualTo(List.of(new Cat("치즈", 4.0, 5)));
//    }
//    public List<Cat> findHeaviestCats(List<Cat> cats) {
//        // 고양이 목록 -> 고양이 몸무게 목록 map()
//        List<Double> catsWeight = new ArrayList<>();
//        for (int i = 0; i < cats.size(); i++) {
//            catsWeight.add(cats.get(i).getCatWeight());
//        }
//        // 고양이 몸무게 목록에서 최대값 Collections.max()
//        double max = Collections.max(catsWeight);
//        // 고양이 목록에서 몸무게가 최대값과 일치하는 고양이들만 골라낸다 filter
//        // return
//        return cats.stream().filter((c) ->c. getCatWeight() == max ).toList();
//    }
//
//
//    @Test
//    void findOldestCats() {
//        //given
//        List<Cat> cats = List.of(
//                new Cat("치즈",2.2,4),
//                new Cat("삼색이",4.3,11),
//                (new Cat("고등어",1.1,7)));
//        //when
//        List<Cat> oldest = findOldestCats(cats);
//        //then
//        assertThat(oldest).isEqualTo(List.of(new Cat("삼색이",4.3,11)));
//    }
//
//    public List<Cat> findOldestCats(List<Cat> cats) {
//        List<Integer> age = cats.stream().map(Cat::getCatAge).toList();
//
//        int oldestAge = Collections.max(age);
//
//        return cats.stream().filter((c) -> c.getCatAge() == oldestAge).toList();
////        List<Cat> oldestCats =  cats.stream().filter((c) -> c.getCatAge() == oldestAge).toList();
////        return oldestCats;
//    }

//    @Test
//    void carTest() {
//        Car car = new Car("12가3456",2018,99000);
//        assertThat(car.getNumber()).isEqualTo("12가3456");
//        assertThat(car.getModelYear()).isEqualTo(2018);
//        assertThat(car.getMileage()).isEqualTo(99000);
//    }


//    @Test
//    void oldestCars() {
//        // given
//        List<Car> cars = List.of(
//                new Car("12가3456",2018,99000),
//                new Car("5허4156",2024,420),
//                new Car("11다3218",1999,7100));
//        // when
//        List<Car> oldestCars = findOldestCars(cars);
//        // then
//        assertThat(oldestCars).isEqualTo(List.of(new Car("11다3218",1999,7100)));
//        assertThat(oldestCars.get(0).getNumber()).isEqualTo("11다3218");
//    }
//
//    public List<Car> findOldestCars(List<Car> cars) {
//        List<Integer> modelYear = cars.stream().map(Car::getModelYear).toList();
//        int oldest = Collections.min(modelYear);
//        return cars.stream().filter((a) -> a.getModelYear() == oldest).toList();
//    }


//    @Test
//    void maxMileageCars() {
//        //give
//        List<Car> cars = List.of(
//                new Car("11다3218", 1999, 7100),
//                new Car("5허4156", 2024, 420),
//                new Car("12가3456", 2018, 99000));
//        //when
//        List<Car> maxMileage = findMaxMileageCars(cars);
//        //then
//        assertThat(maxMileage).isEqualTo(List.of(new Car("12가3456", 2018, 99000)));
//    }
//
//    public List<Car> findMaxMileageCars(List<Car> cars) {
//        List<Integer> mileage = cars.stream().map(Car::getMileage).toList();
//        int max = Collections.max(mileage);
//
//        return cars.stream().filter((n) -> n.getMileage() == max).toList();
//    }
//
//    @Test
//    void person1() {
//        //given
//        Person person1 = new Person("윤찬영","개발자",10);
//        Person person2 = new Person("김찬영","개발자",10);
//        Person person3 = new Person("박찬영","개발자",5);
//        List<Person> persons = List.of(person1,person2,person3);
//        //when
//        List<Person> seniorDeveloper = findSeniorDeveloper(persons);
//        //then
//        assertThat(seniorDeveloper).isEqualTo(List.of(person1,person2));
//    }
//
//    public List<Person> findSeniorDeveloper(List<Person> person) {
//        List<Integer> personalHistory = person.stream().map(Person::getPersonalHistory).toList();
//
//        int best = Collections.max(personalHistory);
//
//        return person.stream().filter((n) -> n.getPersonalHistory() == best).toList();
//    }


//    @Test
//    void lotto() {
//        LottoNumber number = new LottoNumber(1);
//        assertThat(number.getNumber()).isEqualTo(1);
//    }


//    @Test
//    void lottoNumbersTest() {
//        //given
//        List<Integer> numbers = List.of(1,8,42,9,23,11);
//        //when
//        List<LottoNumber> lottoNumbers = toLottoNumbers(numbers);
//        //then
//        assertThat(lottoNumbers).isEqualTo(List.of(
//                new LottoNumber(1),
//                new LottoNumber(8),
//                new LottoNumber(42),
//                new LottoNumber(9),
//                new LottoNumber(23),
//                new LottoNumber(11)
//        ));
//    }
//    public List<LottoNumber> toLottoNumbers(List<Integer> numbers) {
//        List<LottoNumber> lottoNumbers = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            lottoNumbers.add(new LottoNumber(numbers.get(i)));
//        }
//        return lottoNumbers;

//         return numbers.stream().map(LottoNumber::new)
//                    .toList();
//        }

    @Test
    void lottoRankingTest() {
        //given
        int bonus = 1;
        List<LottoNumber> me = List.of(
                new LottoNumber(1),
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6)
                );
        List<LottoNumber> winingNumbers = List.of(
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6),
                new LottoNumber(7)
        );
        //when
        int rank = checkLottoRank(me,winingNumbers,bonus);
        //then
        assertThat(rank).isEqualTo(2);
    }
    public int checkLottoRank(List<LottoNumber> me,List<LottoNumber> winingNumbers,int bonus) {
        // 3개 일치 = 4등 , 4개 일치 = 3등, 5개일치 = 2 , 6개일치 = 1
        int count = 0;
        int rank = 0;
        for (int i = 0; i < me.size(); i++) {
            if (me.contains(winingNumbers.get(i))) {
                count++;
            }
        }
        if (count == 3) {
            rank = 5;
        }
        if (count == 4) {
            rank = 4;
        }
        if (count == 5) {
            rank = 3;
        }
        if (count == 6) {
            rank = 1;
        }
        for (LottoNumber lottoNumber : me) {
            if (lottoNumber.getNumber() == bonus) {
                return 2;
            }
        }

        return rank;
    }

}

