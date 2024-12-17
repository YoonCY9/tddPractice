package yoon.tdd;

import cat.Cat;
import cat.Cats;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CatsTest {

    @Test
    void findHeaviestCats() {
        //given
        Cats cats = new Cats(List.of(new Cat("치즈", 4, 5),
                new Cat("삼색이", 2, 8)));
        //when
        List<Cat> heaviestCats = cats.findHeaviestCats();
        //then
        assertThat(heaviestCats).isEqualTo(List.of(new Cat("치즈", 4, 5)));
    }

    @Test
    void findOldestCats() {
        // given
        Cats cats = new Cats(List.of(new Cat("치즈", 4, 5),
                new Cat("삼색이", 2, 8)));
        // when
        List<Cat> oldestCats = cats.findOldestCats();
        // then
        assertThat(oldestCats).isEqualTo(List.of(new Cat("삼색이", 2, 8)));

    }
}
