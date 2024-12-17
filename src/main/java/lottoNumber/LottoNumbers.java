package lottoNumber;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {

    private List<LottoNumber> numbers = new ArrayList<>();

    public LottoNumbers(List<LottoNumber> numbers) {
        this.numbers = numbers;
    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }
    // 로또넘버가 담긴 리스트를 반환
    public List<LottoNumber> toLottoNumbers() {
        // 로또넘버를 담는 로또 넘버스 객체 생성
        List<LottoNumber> lottoNumbers = new ArrayList<>();
        // 로또 넘버스에 로또넘버 객체에 넘버스 i번째의 넘버를 추가
        for (int i = 0; i < numbers.size(); i++) {
            lottoNumbers.add(new LottoNumber(numbers.get(i).getNumber()));
        }
        return lottoNumbers;
    }

    public int checkLottoRank(LottoNumbers other) {
        // 3개 일치 = 4등 , 4개 일치 = 3등, 5개일치 = 2 , 6개일치 = 1
        int count = 0;
        int rank = 0;
        for (int i = 0; i < this.numbers.size(); i++) {
            if (other.hasContains(this.numbers.get(i))) {
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

        return rank;
    }
    private boolean hasContains(LottoNumber other) {
        return numbers.contains(other);
    }
}
