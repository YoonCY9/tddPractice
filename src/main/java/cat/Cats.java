package cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cats {


    private List<Cat> values = new ArrayList<>();

    public Cats(List<Cat> values) {
        this.values = values;
    }

    public List<Cat> getValues() {
        return values;
    }

    public List<Cat> findHeaviestCats() {
        // 고양이 목록 -> 고양이 몸무게 목록 map()
        List<Integer> Weights = values.stream().map(Cat::getCatWeight).toList();

        // 고양이 몸무게 목록에서 최대값 Collections.max()
        int max = Collections.max(Weights);
        // 고양이 목록에서 몸무게가 최대값과 일치하는 고양이들만 골라낸다 filter
        // return
        return values.stream().filter((c) ->c.getCatWeight() == max ).toList();
    }

    public List<Cat> findOldestCats() {
        List<Integer> ages = values.stream().map(Cat::getCatAge).toList();

        int maxAge = Collections.max(ages);

        return values.stream().filter(c -> c.getCatAge() == maxAge).toList();
    }
}
